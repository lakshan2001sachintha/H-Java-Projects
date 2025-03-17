package Projects;

import java.sql.*;
import java.util.Scanner;

// MySQL-based Library Management System
class MySQLLibrary {
    private Connection conn;

    // Constructor to establish the database connection
    public MySQLLibrary() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_db", "root", "password");
            System.out.println("Connected to MySQL database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Add a book to the database
    public void addBook(String title, String author) {
        String sql = "INSERT INTO books (title, author, is_available) VALUES (?, ?, TRUE)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, title);
            stmt.setString(2, author);
            stmt.executeUpdate();
            System.out.println("Book added: " + title);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Display available books
    public void displayBooks() {
        String sql = "SELECT title, author FROM books WHERE is_available = TRUE";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\nAvailable Books:");
            while (rs.next()) {
                System.out.println(rs.getString("title") + " by " + rs.getString("author"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Borrow a book
    public void borrowBook(String title) {
        String sql = "UPDATE books SET is_available = FALSE WHERE title = ? AND is_available = TRUE";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, title);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("You have borrowed: " + title);
            } else {
                System.out.println("Book not found or already borrowed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Return a book
    public void returnBook(String title) {
        String sql = "UPDATE books SET is_available = TRUE WHERE title = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, title);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("You have returned: " + title);
            } else {
                System.out.println("Book not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Close the database connection
    public void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

// Main class to run the MySQL Library System
public class MySQLLibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MySQLLibrary library = new MySQLLibrary();

        // Adding sample books
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("To Kill a Mockingbird", "Harper Lee");

        // Menu-driven system
        while (true) {
            System.out.println("\nLibrary Management System (MySQL)");
            System.out.println("1. Display Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 4:
                    System.out.println("Exiting Library System...");
                    library.closeConnection(); // Close DB connection
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
