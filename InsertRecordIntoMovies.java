package com.company;

import java.sql.*;

public class InsertRecordIntoMovies {
    public static void main(String[] args) {
        try {

            Connection con = null;
            Statement stmt = null;

            con = DriverManager
                    .getConnection("jdbc:sqlite:/C:\\sqlite\\java\\connect\\net\\sqlitetutorial\\Mulesoft\\MoviesDatabase.db");

            System.out.println("Database Connection Successful !!");

            stmt = con.createStatement(); // Create Statement

            String query0 = "INSERT INTO FavMovies values ('virata parvam','Rana','Sai pallavi', 2022,'venu udugula');";
            stmt.executeUpdate(query0); // Create Query-1

            String query1 = "INSERT INTO FavMovies values ('fidaa','varun tej','Sai pallavi', 2017,'Shekhar kammula');";
            stmt.executeUpdate(query1); // Create Query-1

            String query2 = "INSERT INTO FavMovies values ('mca','Nani','Sai pallavi',2018,'venu sriram');";
            stmt.executeUpdate(query2); // Create Query-2

            String query3 = "INSERT INTO FavMovies values ('shyam singha roy','nani','Sai pallavi',2021,'rahul sankrithyan');";
            stmt.executeUpdate(query3); // Create Query-3

            String query4 = "INSERT INTO FavMovies values ('Maari2','Dhanush','Sai pallavi',2018,'Balaji mohan');";
            stmt.executeUpdate(query4); // Create Query-4

            String query5 = "INSERT INTO FavMovies values ('kanam','Naga Shourya','Sai pallavi',2022,'Al vijay');";
            stmt.executeUpdate(query5);
            stmt.close();

            con.close();                //Close Connection
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Record  Insertion successful");
    }
}