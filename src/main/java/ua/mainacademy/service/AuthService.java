package ua.mainacademy.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ua.mainacademy.dao.UserDAO;
import ua.mainacademy.model.User;

import java.util.Optional;

import static java.util.Objects.isNull;

public class AuthService {
    public Optional<User> findOneByLoginAndPassword(String login, String password) {
        UserDAO userDAO = new UserDAO();
        return userDAO.findOneByLoginAndPassword(login,password);

    }


}
