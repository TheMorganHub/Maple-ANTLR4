package com.morgandev.app;

import com.morgandev.app.gen.SQLiteLexer;
import com.morgandev.app.gen.SQLiteParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Start {

    public static void main(String[] args) {
        try {
            CharStream cs = CharStreams.fromString("SELECT nombre, apellido FROM personas p WHERE name = 'asd' AND apellido = 'bah';");
            SQLiteLexer lexer = new SQLiteLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            SQLiteParser parser = new SQLiteParser(token);
            ParseTree tree = parser.select_or_values();

            CustomVisitor visitor = new CustomVisitor();
            String val = visitor.visit(tree);
            System.out.println(val);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
