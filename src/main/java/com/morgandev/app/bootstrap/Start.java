package com.morgandev.app.bootstrap;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        if (args.length > 0) {
            startFromCmd();
        } else {
            String mapleStatement = "people ? id = 6 AND age > 5 OR (AVG(age) > 5) AND dob BETWEEN '1993-03-07' AND '1994-03-04'";
            start(mapleStatement);
        }
    }

    public static void start(String mapleStatement) {
        MapleRuntime instance = new MapleRuntime();
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
