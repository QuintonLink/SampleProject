package lesson8.Crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
    private Map<String, User> users;

    public UserService() {
        users = new HashMap<>();
        User admin = new User("Quinton Link", "1488", "@quinton");
        users.put("Quinton Link",admin);
    }

    public boolean addUser(User user) {
        users.put(user.getLogin(), user);
        if (users.containsKey(user.getLogin()) && users.containsValue(user)) {
            return true;
        }
        return false;
    }

    public User getByLogin(String login) {

        User user = users.get(login);
        return user;
    }

    public boolean deleteUser(String login) {
        if (users.containsKey(login)) {
            users.remove(login);
            return true;
        }
        return false;
    }

    public List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        for (Map.Entry<String, User> entry : users.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }

    public boolean editUser(User user) {

        if (users.containsValue(user)) {
            users.put(user.getLogin(), user);
            return true;
        }
        return false;
    }

    public boolean auth(String login, String password) {
        if (users.containsKey(login)) {
           User user = users.get(login);

            if (user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}

