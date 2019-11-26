import oracle.jdbc.OracleDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update_Data_To_Database {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement prst;

        String url = "jdbc:oracle:thin:@//localhost:1521/xe";
        String user = "system";
        String pass = "pass";

        try {

            //Loaded the driver
            DriverManager.registerDriver(new OracleDriver());
            System.out.println("Loaded");

            //Connection
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("Connected");

        }catch (Exception e){
            e.printStackTrace();
        }

        try {

            String sql = "Update Student set roll = ?, where name = ?";

            //Prepare Statement
            prst = con.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter roll");
            int r = sc.nextInt();
            System.out.println("Enter Name");
            sc.nextLine();
            String s = sc.nextLine();

            prst.setInt(1,r);
            prst.setString(2,s);

            int i = prst.executeUpdate();

            System.out.println(i+" rows Updated");



        }catch (Exception e){

        }
    }
}
