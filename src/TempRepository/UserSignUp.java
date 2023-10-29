package TempRepository;

public class UserSignUp {
    private String username;
    private String password;
    private String passwordConfirmed;

    public UserSignUp() {}

    public UserSignUp(String username, String password, String passwordConfirmed) {
        this.username = username;
        this.password = password;
        this.passwordConfirmed = passwordConfirmed;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirmed() {
        return passwordConfirmed;
    }

    public void setPasswordConfirmed(String passwordConfirmed) {
        this.passwordConfirmed = passwordConfirmed;
    }
}
