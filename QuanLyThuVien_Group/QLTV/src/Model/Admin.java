/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Admin extends Person {
    private String username;
    private String password;

    public Admin(String id, String name, LocalDate birthDate, String gender, String phoneNumber, String email, String address) {
        super(id, name, birthDate, gender, phoneNumber, email, address);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString() + "Admin{" + "username=" + username + ", password=" + password + '}';
    }
//hhhhh
//hdsyhrwe
} 