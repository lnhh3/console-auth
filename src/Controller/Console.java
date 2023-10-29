package Controller;

import MyLibrary.MyScanner;
import Enum.*;
import TempRepository.UserSignUp;

public class Console {
    private static MyScanner input = new MyScanner();

    public static ConsoleTypes renderConsole(ConsoleTypes consoleTypes) {
        switch (consoleTypes) {
            case AUTHENTICATION -> renderAuthentication();
            case SIGN_UP -> renderSignUp();
        }

        return ConsoleTypes.NONE;
    }

    private static ConsoleTypes renderAuthentication() {
        render("""
                Authentication
                    1. Sign Up
                    2. Sign In
                """,
                ConsoleTypes.SIGN_UP,
                ConsoleTypes.SIGN_IN);

        return ConsoleTypes.NONE;
    }

    private static ConsoleTypes renderSignUp() {
        String username = input.inputString("Username: ");
        String password = input.inputString("Password: ");
        String passwordConfirmed = input.inputString("Confirm Password: ");

        UserSignUp signUp = new UserSignUp(username, password, passwordConfirmed);

        return ConsoleTypes.NONE;
    }

    private static ConsoleTypes render(String s, ConsoleTypes... types) {
        System.out.println(s);
        int choice = input.inputInteger("Please enter your choice: ");

        if (types.length == 1) return types[0];

        for (int i = 0; i < types.length; i++) {
            if (choice == i + 1)
                return types[i];
        }

        return ConsoleTypes.NONE;
    }
}
