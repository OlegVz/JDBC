package com.hybris.internship;

import java.sql.*;

public class AccountDAO {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hybrisDB";
        String user = "hybris";
        String password = "Hybris1#";
        try (            Connection connection = DriverManager.getConnection(url, user, password);
                         Statement statement = connection.createStatement();
                         ResultSet rs = statement.executeQuery("select * from account")
        ){
            System.out.println(connection);

//            int result = statement.executeUpdate("insert into account values(1, 'Vozniuk', 'Oleg', 1000)");
//            System.out.println(result + " rows got inserted");
//            int result = statement.executeUpdate("update account set bal = 5000 where accno = 1");
//            System.out.println(result + " rows got updated");
//            int result = statement.executeUpdate("delete from account where accno = 1");
//            System.out.println(result + " rows got deleted");

            while (rs.next()) {
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getInt(4));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
