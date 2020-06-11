package BankingManager;

import javax.swing.JOptionPane;
import java.io.File;
import java.util.Scanner;

public class BankingManager {
    
    /**
     * Compares input username and password to confirm they are a valid combination
     * @param usernameInput the user's inputted username to test
     * @param passwordInput the user's inputted password to test
     * @return true if authentication is successful, false otherwise
     */
    private static boolean authenticate(String usernameInput, String passwordInput) {
        boolean authentication = false;

        return authentication;
    }

    public static void main(String args[]) {

        // declare variables
        String title = "PT Banking";
        
        // welcome message
        JOptionPane.showMessageDialog(null,"Welcome to PT Banking! Where none of your actual banking needs are met, and it's all just a simulation.", title, JOptionPane.OK_OPTION);

        // start login authentication process
        String usernameInput = "";
        String passwordInput = "";
        int attempts = 0;
        boolean authenticated = false;

        while (attempts < 3) {

            usernameInput = JOptionPane.showInputDialog(null,"Please enter your username.", title, JOptionPane.OK_OPTION);
            passwordInput = JOptionPane.showInputDialog(null,"Please enter your password.", title, JOptionPane.OK_OPTION);

            authenticated = authenticate(usernameInput, passwordInput);
            if (authenticated) break;
            else {
                JOptionPane.showMessageDialog(null, "Incorrect username and/or password.", title, JOptionPane.ERROR_MESSAGE);
            }

            attempts++;

            if (attempts == 3) {
                JOptionPane.showMessageDialog(null, "You have run out of login attempts. Goodbye.", title, JOptionPane.ERROR_MESSAGE);
            }

        }

        // if login successful, start main application process

    }

}