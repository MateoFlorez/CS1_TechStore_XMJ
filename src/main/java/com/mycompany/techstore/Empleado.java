
package com.mycompany.techstore;

public abstract class Empleado implements EmpleadosCTS{
    protected String name;
    protected String position;
    protected String rol;
    protected String user;
    protected String password;
    
    public Empleado(String name, String position, String rol, String user, String password){
        this.name = name;
        this.position = position;
        this.rol = rol;
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getRol() {
        return rol;
    }
    
    
}
