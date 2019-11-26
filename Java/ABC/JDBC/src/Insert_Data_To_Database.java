import oracle.jdbc.OracleDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert_Data_To_Database {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement prst;

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

            //Query
            String sql = "Insert into Student values(?,?,?,?)";

            //Prepare Statement
            prst = con.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Name");
            String name = sc.nextLine();

            System.out.println("Enter class");
            int Class = sc.nextInt();

            System.out.println("Enter address");
            sc.nextLine();
            String address = sc.nextLine();

            System.out.println("Enter roll");
            int roll = sc.nextInt();

            prst.setString(1,name);
            prst.setInt(2,Class);
            prst.setString(3,address);
            prst.setInt(4,roll);

            int x =prst.executeUpdate();
            System.out.println(x);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
