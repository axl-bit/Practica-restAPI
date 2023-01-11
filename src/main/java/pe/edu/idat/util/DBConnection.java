/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.idat.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    public static Connection getConnection()
            throws ClassNotFoundException, SQLException
    {
        //cargamos el driver del jar
        Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.cj.jdbc.Driver
        
        //Obtener una conexión a la BD
        Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/idat_final?useTimeZone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=True", "root","2392001");
        return cnx;
    }
}
