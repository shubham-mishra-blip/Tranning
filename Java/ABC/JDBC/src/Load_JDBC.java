import oracle.jdbc.OracleDriver;

import java.sql.DriverManager;

public class Load_JDBC {
    public static void main(String[] args)throws Exception {

        DriverManager.registerDriver(new OracleDriver());
        System.out.println("Loaded Successully");
    }
}
