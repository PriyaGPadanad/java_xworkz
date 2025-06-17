package com.xworkz.airlines.repository;

import com.xworkz.airlines.dto.AirlinesDTO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AirlinesRepositoryImp implements AirlinesRepository {
    @Override
    public String save(AirlinesDTO airlinesDTO) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/airlinedb";
            String username="root";
            String password="Xworkzodc@123";

            //create a connection
            Connection connection = DriverManager.getConnection(url,username,password);

            //prepare the statement
            String sql = "insert into airlinedetails values(0,'" + airlinesDTO.getName() + "','" +
                    airlinesDTO.getSource() + "','" + airlinesDTO.getDestination() + "','" +
                    airlinesDTO.getFlightCode() + "','" + airlinesDTO.getClassType() + "','" +
                    airlinesDTO.getMealType() + "','" + airlinesDTO.getInternational() + "')";

            Statement statement = connection.createStatement();

            //Execute the statement

            statement.executeUpdate(sql);
            System.out.println(connection);


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "false";
    }
}











