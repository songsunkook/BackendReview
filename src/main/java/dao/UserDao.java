package dao;

import domain.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
public class UserDao {
    public void add(User user) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/user","root","0000");
        PreparedStatement preparedStatement=connection.prepareStatement("insert into user (name,age) values (?,?,?)");
        preparedStatement.setString(1,user.getName());
        preparedStatement.setInt(2,user.getAge());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }
}
*/