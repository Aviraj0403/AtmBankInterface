package AviBank;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
//          Class.forName("com.mysql.jdbc.Driver");
            Class.forName("oracle.jdbc.OracleDriver");
            c =DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-5L4CGTPT:1521:XE","System","834");
            s=c.createStatement();
//         System.out.println("hello");
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  