package com.morgandev.app.bootstrap;

import com.morgandev.app.errorhandling.AntlrErrorListener;
import com.morgandev.app.errorhandling.MapleParseException;
import com.morgandev.app.gen.MapleLexer;
import com.morgandev.app.gen.MapleParser;
import com.morgandev.app.result.MapleResult;
import com.morgandev.app.visitors.MapleMainVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

public class MapleRuntime {

    private MapleMainVisitor visitor;

    public MapleRuntime() {
        visitor = MapleMainVisitor.getInstance();
    }

    public MapleResult convert(String mapleStatement) {
        MapleResult result = new MapleResult();
        try {
            ParseTree tree = buildParser(mapleStatement).parse();
            result.setSqlStatements(visitor.visit(tree));
        } catch (MapleParseException mapleParseException) { //thrown by the visitors
            result.setException(mapleParseException);
        } catch (ParseCancellationException rException) { //thrown by the parser
            String detailedMessage = rException.getMessage();
            result.setException(new MapleParseException(10000, null, (detailedMessage != null ? detailedMessage : "")));
        } catch (Exception e) {
            result.setException(new MapleParseException(10001));
        }
        return result;
    }

    private MapleParser buildParser(String mapleStatement) {
        CharStream cs = CharStreams.fromString(mapleStatement);
        MapleLexer lexer = new MapleLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        MapleParser parser = new MapleParser(token);
        parser.removeErrorListeners();
        parser.addErrorListener(new AntlrErrorListener());
        return parser;
    }
}
