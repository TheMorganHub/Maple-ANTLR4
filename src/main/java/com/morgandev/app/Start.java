package com.morgandev.app;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        if (args.length > 0) {
            startFromCmd();
        } else {
            String mapleStatement = "procedure test(varchar nombre) {\n" +
                    "\tint x = 1;\n" +
                    "    string var = '';\n" +
                    "\twhile(x <= 5) {\n" +
                    "        x++; \n" +
                    "\t}\n" +
                    "    print var;\n" +
                    "}";
            start(mapleStatement);
        }
    }

    public static void start(String mapleStatement) {
        MapleInstance instance = new MapleInstance();
        System.out.println(instance.convert(mapleStatement));
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
