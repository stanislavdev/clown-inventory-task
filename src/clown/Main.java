package clown;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        helpClown();
    }

    private static void helpClown() {
        Scanner scanner = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("Input: ");
            str = scanner.nextLine();
            str = str.replaceAll("\\){2,}", ")");
            str = str.replaceAll("\\({2,}", "(");
            System.out.println(str);
        }
    }
}