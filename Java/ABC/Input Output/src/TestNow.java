import oracle.jdbc.OracleDriver;

import java.sql.DriverManager;
import java.sql.SQLClientInfoException;

public class TestNow {

    public static void main(String[] args) throws Exception {
        DriverManager.registerDriver(new OracleDriver());
        System.out.println("Loaded");


    }
}
