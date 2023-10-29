package Repository;

import Enum.AuthorizeTypes;
import TempRepository.UserSignUp;

public class User {
    private String username;
    private String password;
    private AuthorizeTypes author;

    public User() {}

    public User(UserSignUp userSignUp, AuthorizeTypes author) {
        this.username = userSignUp.getUsername();
        this.password = userSignUp.getPasswordConfirmed();
        this.author = author;
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

    public AuthorizeTypes getAuthor() {
        return author;
    }

    public void setAuthor(AuthorizeTypes author) {
        this.author = author;
    }
}
