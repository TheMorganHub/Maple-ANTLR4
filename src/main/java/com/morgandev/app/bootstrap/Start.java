package com.morgandev.app.bootstrap;

import com.morgandev.app.result.MapleResult;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        if (args.length > 0) {
            startFromCmd();
        } else {
            String mapleStatement = "procedure calcularNota(int nota) {\n" +
                    "\tif (nota >= 4 and nota <= 10) {\n" +
                    "    \tprint 'Aprobado';\n" +
                    "    } elseif (nota >= 1 and nota <= 3) {\n" +
                    "    \tprint 'Reprobado';\n" +
                    "    } else {\n" +
                    "    \tprint 'Nota invalida';\n" +
                    "    }\n" +
                    "}";
            start(mapleStatement);
        }
    }

    public static void start(String mapleStatement) {
        MapleRuntime instance = new MapleRuntime();
        MapleResult result = instance.convert(mapleStatement);
        System.out.println(result);
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
