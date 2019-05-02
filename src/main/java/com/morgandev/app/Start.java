package com.morgandev.app;

import com.morgandev.app.gen.MapleLexer;
import com.morgandev.app.gen.MapleParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Start {

    public static void main(String[] args) {
        try {
            String mapleStatement = "personas(nombre, apellido) <<- 'David' ? id < 5;";
            if (args.length > 0) {
                mapleStatement = args[0];
            }
            CharStream cs = CharStreams.fromString(mapleStatement);
            MapleLexer lexer = new MapleLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            MapleParser parser = new MapleParser(token);
            ParseTree tree = parser.parse();

            MapleCustomVisitor visitor = new MapleCustomVisitor();
            String val = visitor.visit(tree);
            System.out.println(val);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
