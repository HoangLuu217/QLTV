package DAO;

import Model.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class AdminDAO implements GenericDAO {
    private HashMap<String, String[]> adminMap = new HashMap<>();

    public AdminDAO() throws SQLException {
        loadAdminsFromDatabase();
    }

    private void loadAdminsFromDatabase() throws SQLException {
        String query = "SELECT id, name, email FROM Admins";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                adminMap.put(id, new String[]{name, email});
            }
        }
    }

    @Override
    public List<String[]> getAll() throws SQLException {
        return new ArrayList<>(adminMap.values());
    }

    @Override
    public String[] getById(String id) throws SQLException {
        return adminMap.get(id);
    }

    @Override
    public void insert(Object entity) throws SQLException {
        if (!(entity instanceof Admin)) {
            throw new IllegalArgumentException("Entity must be an instance of Admin");
        }
        Admin admin = (Admin) entity;
        String query = "INSERT INTO Admins (id, name, email) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, admin.getId());
            stmt.setString(2, admin.getName());
            stmt.setString(3, admin.getEmail());
            stmt.executeUpdate();
            adminMap.put(admin.getId(), new String[]{admin.getName(), admin.getEmail()});
        }
    }

    @Override
    public void update(Object entity) throws SQLException {
        if (!(entity instanceof Admin)) {
            throw new IllegalArgumentException("Entity must be an instance of Admin");
        }
        Admin admin = (Admin) entity;
        String query = "UPDATE Admins SET name = ?, email = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, admin.getName());
            stmt.setString(2, admin.getEmail());
            stmt.setString(3, admin.getId());
            stmt.executeUpdate();
            adminMap.put(admin.getId(), new String[]{admin.getName(), admin.getEmail()});
        }
    }

    @Override
    public void delete(String id) throws SQLException {
        String query = "DELETE FROM Admins WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            adminMap.remove(id);
        }
    }
}
