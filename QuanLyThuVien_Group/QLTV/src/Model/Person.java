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
public abstract class Person {
    protected String id;
    protected String name;
    protected LocalDate birthDate;
    protected String gender;
    protected String phoneNumber;
    protected String email;
    protected String address;

    public Person(String id, String name, LocalDate birthDate, String gender, String phoneNumber, String email, String address) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

}

