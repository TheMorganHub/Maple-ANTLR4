package com.morgandev.app.bootstrap;

import com.morgandev.app.gen.MapleLexer;
import com.morgandev.app.gen.MapleParser;
import com.morgandev.app.visitors.MapleMainVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class MapleRuntime {

    private MapleMainVisitor visitor;

    public MapleRuntime() {
        visitor = MapleMainVisitor.getInstance();
    }

    public String convert(String mapleStatement) {
        try {
            CharStream cs = CharStreams.fromString(mapleStatement);
            MapleLexer lexer = new MapleLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            MapleParser parser = new MapleParser(token);
            ParseTree tree = parser.parse();
            return visitor.visit(tree);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
