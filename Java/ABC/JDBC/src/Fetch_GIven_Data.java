import oracle.jdbc.OracleDriver;

import java.sql.*;
import java.util.Scanner;

public class Fetch_GIven_Data {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement preparedStatement;
        ResultSet res;

        String url = "jdbc:Oracle:thin:@//localhost:1521/xe";
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

            String sql = "Select * from Student where roll=?";

            //prepare Statement bcoz query is not complete
            preparedStatement = con.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter roll No");
            int i = sc.nextInt();
            preparedStatement.setInt(1,i);

            res = preparedStatement.executeQuery();

            //Fetch
            while (res.next() == true){
                String Name = res.getString("name");
                int Class = res.getInt("class");
                String Address = res.getString("address");

                System.out.println(Name+" | "+Class+" | "+Address);
            }




        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
