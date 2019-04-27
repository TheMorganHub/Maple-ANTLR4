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
            CharStream cs = CharStreams.fromString("Personas > nombre, (dni > numero) <> Alumno a <> Colegio;");
            MapleLexer lexer = new MapleLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            MapleParser parser = new MapleParser(token);
            ParseTree tree = parser.maple_stmt();

            MapleCustomVisitor visitor = new MapleCustomVisitor();
            String val = visitor.visit(tree);
            System.out.println(val);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
