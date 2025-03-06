/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Run;

import DAO.AdminDAO;
import DAO.DatabaseConnection;
import Model.Admin;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class run {

    public run() {
        DatabaseConnection cn = new DatabaseConnection();
    }

    public static void main(String[] args) throws SQLException {
        // Test database connection
        DatabaseConnection cnn = new DatabaseConnection();
        if (cnn != null) {
            System.out.println("Database connection: OK");
        } else {
            System.out.println("Database connection: Not OK");
        }

        // Test querying admin data
        try {
            AdminDAO adminDAO = new AdminDAO();
            List<Admin> admins = adminDAO.getAll();
            if (admins == null) System.out.println("Null");
            System.out.println("Admin data:");
            for (Admin admin : admins) {
                System.out.println(admin);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        AdminDAO adminDAO = new AdminDAO();
        HashMap<String , String > ADacc = new HashMap<>();
        ADacc = adminDAO.loadAdminAcc();
        for (Map.Entry<String, String> entry : ADacc.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            if(key.equals("hoangluu217")){
            System.out.println(val);
            }
        }
        // Example of inserting a new admin
//        try {
//            AdminDAO adminDAO = new AdminDAO();
//            Admin newAdmin = new Admin("AD123", LocalDate.now(), "Male", "123 Main St", 1);
//            adminDAO.insert(newAdmin);
//            System.out.println("Inserted new admin: " + newAdmin);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        // Example of updating an existing admin

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        try {
//            String date = "21/07/2004";
//            
//            Admin updatedAdmin = new Admin("AD001",LocalDate.parse(date,formatter), "male", "Quang Nam", 2);
//            adminDAO.update(updatedAdmin);
//            System.out.println("Updated admin: " + updatedAdmin);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        // Example of deleting an admin
//        try {
//            AdminDAO adminDAO = new AdminDAO();
//            adminDAO.delete("AD123");
//            System.out.println("Deleted admin with ID: AD123");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}