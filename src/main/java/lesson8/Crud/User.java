package lesson8.Crud;

public class User {
    private String login;
    private String password;
    private String id;


    public User(String login, String password, String id) {
        this.login = login;
        this.password = password;
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
