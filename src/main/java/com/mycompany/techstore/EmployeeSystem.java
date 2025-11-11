/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.techstore;

import java.util.HashMap;

/**
 *
 * @author pc
 */
public class EmployeeSystem {
    private HashMap<String, Empleado> employees = new HashMap<>();
    
    public void addEmployee(Empleado e) {
        employees.put(e.getUser(), e);
    }
    
    public Empleado login(String user, String password){
        Empleado e = employees.get(user);
        
        if (e == null) {
            throw new IllegalArgumentException("User not found");
        }

        if (!e.getPassword().equals(password)) {
            throw new IllegalArgumentException("Incorrect password");
        }

        return e;
    }
}
