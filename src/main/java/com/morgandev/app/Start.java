package com.morgandev.app;

import com.morgandev.app.gen.MapleLexer;
import com.morgandev.app.gen.MapleParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        try {
            if (args.length > 0) {
                startFromCmd();
            } else {
                String mapleStatement = "personas p ->;";
                start(mapleStatement);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void start(String mapleStatement) {
        CharStream cs = CharStreams.fromString(mapleStatement);
        MapleLexer lexer = new MapleLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        MapleParser parser = new MapleParser(token);
        ParseTree tree = parser.parse();

        MapleCustomVisitor visitor = new MapleCustomVisitor();
        String val = visitor.visit(tree);
        System.out.println(val);
    }

    public static void startFromCmd() {
        Scanner scanner = new Scanner(System.in);
        String mapleStatement;
        do {
            System.out.println("Enter a Maple statement:\n");
            mapleStatement = scanner.nextLine();
            if (!mapleStatement.equals("exit")) {
                start(mapleStatement);
            } else {
                System.out.println("Bye!");
            }
        } while (!mapleStatement.equals("exit"));
    }
}
