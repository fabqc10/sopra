package org.example;

public class Persona {
    String sexo;
    int edad;

    public Persona(String sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
