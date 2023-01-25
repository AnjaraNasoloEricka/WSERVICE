package com.example.enchere.connexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnexionPostgreSQL {
    
    Connection Connect;

    public ConnexionPostgreSQL(){}

    public Connection getConnect(){
        try{
            Class.forName("org.postgresql.Driver");
            this.Connect = DriverManager.getConnection("jdbc:postgresql://containers-us-west-49.railway.app:5928/railway", "postgres", "XZbxYC54mG00XDWtAZYA");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return this.Connect;
    }
}
