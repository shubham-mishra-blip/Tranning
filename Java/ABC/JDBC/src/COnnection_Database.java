import oracle.jdbc.OracleDriver;

import java.sql.DriverManager;

public class COnnection_Database {
    public static void main(String[] args) throws Exception{

        //Loaded
        DriverManager.registerDriver(new OracleDriver());
        System.out.println("Loaded established");

        //Connection
        String url = "jdbc:Oracle:thin:@//localhost:1521/XE";
        String user = "system";
        String pass = "pass";
        DriverManager.getConnection(url,user,pass);
        System.out.println("Connection Established");
    }
}
