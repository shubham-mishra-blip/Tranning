import oracle.jdbc.OracleDriver;

import java.sql.*;

public class MetaData_Example {

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt ;
        ResultSet res;
        ResultSetMetaData rsmd;

        String url = "jdbc:Oracle:thin:@//localhost:1521/XE";
        String user = "system";
        String pass = "pass";

        try {

            //Load Driver
            DriverManager.registerDriver(new OracleDriver());
            System.out.println("Loaded");

            //Connection
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("Connected");
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
          String sql = "Select * from Student";
          stmt = con.createStatement();

          res = stmt.executeQuery(sql);
          rsmd = res.getMetaData();
          for (int i = 1; i <= rsmd.getColumnCount(); i++){
              System.out.println(rsmd.getColumnName(i)+"  "+ rsmd.getColumnTypeName(i));
          }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
