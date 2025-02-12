package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int index = -1;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new UserNotFoundException("User not found!");
        }
        return users[index];
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User not valid!");
        }
        return user.isValid();
    }

    public static void main(String[] args) {
        User[] users = {
            new User("Petr Arsentev", true)
        };
        try {
            if (findUser(users, "Petr Arsentev") != null) {
                validate(findUser(users, "Petr Arsentev"));
            }
        } catch (UserInvalidException ue) {
            ue.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
