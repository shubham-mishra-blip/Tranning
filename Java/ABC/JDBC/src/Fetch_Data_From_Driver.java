import oracle.jdbc.OracleDriver;
import oracle.net.aso.C04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Fetch_Data_From_Driver{
    public static void main(String[] args) {

        Connection con = null;
        Statement stmt;
        ResultSet res;

        String url = "jdbc:Oracle:thin:@//localhost:1521/XE";
        String user = "system";
        String pass = "pass";

        try {

            //Load Driver
            DriverManager.registerDriver(new OracleDriver());
            System.out.println("Driver Loaded");

            //Connection
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("Connected");


        }catch (Exception e){
            e.printStackTrace();
        }

        try {

            //query
            String sql = "SELECT * From Student";

            //Create Statement
            stmt = con.createStatement();

            //Execute Query
            res = stmt.executeQuery(sql);

            //Fetch
            while (res.next() == true){
                String Name = res.getString(1);
                int Class = res.getInt(2);
                String Address = res.getString(3);

                //or

                //String Name = res.getString("name");
                //int Class = res.getInt("class");
                //String Address = res.getString("address");

                System.out.println(Name+" | "+Class+" | "+Address);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}