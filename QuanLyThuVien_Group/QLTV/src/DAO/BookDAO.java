/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO {

    public void findBook(String bookID) {

        String query = "SELECT * FROM Book WHERE bookid = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            if (conn != null) {
                System.out.println("Ket Noi Thanh Cong");
            }
            pstmt.setString(1, bookID);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String bookId = rs.getString("bookId");
                String title = rs.getString("title");
                System.out.println("Book ID: " + bookId + ", Title: " + title);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
