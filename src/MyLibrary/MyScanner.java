package MyLibrary;

import java.util.Scanner;

public class MyScanner {
    private static Scanner sc;

    public MyScanner() {
        sc = new Scanner(System.in);
    }

    public int inputInteger(String s) {
        System.out.println(s);
        int num = this.sc.nextInt();
        return num;
    }

    public String inputString(String s) {
        System.out.println(s);
        String string = this.sc.next();
        return string;
    }
}
