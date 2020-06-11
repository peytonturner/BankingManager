package BankingManager;

public class Account {
    
    private String username;    // account username
    private String password;    // account password
    private int balance;        // account balance

    /**
     * Default constructor
     * Creates an empty account with a default username and password and initializes it with a zero balance
     */
    public Account () {
        this.username = "noname";
        this.password = "password";
        this.balance = 0;
    }

    /**
     * Creates an account with zero balance with the provided username and password
     * @param username account username
     * @param password account password
     */
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0;
    }

    /**
     * Constructs an Account with a provided username, password, and balance
     * @param username account username
     * @param password account password
     * @param balance account balance
     */
    public Account(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    /**
     * Gets the username for this Account
     * @return this Account's username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Gets the current balance for this Account
     * @return this Account's balance
     */
    public int getBalance() {
        return this.balance;
    }

    /**
     * Checks if the provided password matches this Account's password
     * @param password the password to compare with the Account's password
     * @return true if the passwords match, false otherwise
     */
    public boolean validatePassword(String password) {
        if (this.password.equals(password)) return true;
        else return false;
    }

    /**
     * Update this Account's username
     * @param newUsername the new username for this Account
     */
    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    /**
     * Update this Account's password
     * @param oldPassword the current password on the Account
     * @param newPassword the new password to set
     * @return true if the password change is successful, false otherwise
     */
    public boolean setPassword(String oldPassword, String newPassword) {
        boolean changed = false;
        if (this.password.equals(oldPassword)){
            this.password = newPassword;
            changed = true;
        }
        return changed;
    }

}