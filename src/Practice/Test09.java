package Practice;
import java.sql.*;
import java.util.Scanner;

// programme with database
public class Test09 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "lakshan";

      /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter Your Age : ");
        int age = scanner.nextInt(); */

        String query = "INSERT INTO users VALUES('lakshan',24)";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();

            statement.executeUpdate(query);


            connection.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
