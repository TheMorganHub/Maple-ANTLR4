package com.morgandev.app.bootstrap;

import com.morgandev.app.result.MapleResult;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        if (args.length > 0) {
            startFromCmd();
        } else {
            String mapleStatement = "personas(nombre varchar, ciudad)";
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
