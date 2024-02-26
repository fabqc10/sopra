package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>(List.of(
                new Persona("Hombre", 15),
                new Persona("Mujer", 30),
                new Persona("Hombre", 20),
                new Persona("Mujer", 18),
                new Persona("Hombre", 40),
                new Persona("Mujer", 35),
                new Persona("Hombre", 22),
                new Persona("Mujer", 28),
                new Persona("Hombre", 45),
                new Persona("Mujer", 50),
                new Persona("Hombre", 19),
                new Persona("Mujer", 29),
                new Persona("Hombre", 33),
                new Persona("Mujer", 26),
                new Persona("Hombre", 13),
                new Persona("Mujer", 14),
                new Persona("Hombre", 15),
                new Persona("Mujer", 16),
                new Persona("Hombre", 27),
                new Persona("Mujer", 38),
                new Persona("Mujer", 4),
                new Persona("Mujer", 36),
                new Persona("Hombre", 32),
                new Persona("Mujer", 48),
                new Persona("Hombre", 24),
                new Persona("Mujer", 34),
                new Persona("Hombre", 37),
                new Persona("Mujer", 43),
                new Persona("Hombre", 39),
                new Persona("Mujer", 45),
                new Persona("Hombre", 44),
                new Persona("Mujer", 55),
                new Persona("Mujer", 49),
                new Persona("Hombre", 60),
                new Persona("Hombre", 51),
                new Persona("Mujer", 58),
                new Persona("Hombre", 46),
                new Persona("Mujer", 56),
                new Persona("Mujer", 52),
                new Persona("Hombre", 65),
                new Persona("Hombre", 47),
                new Persona("Hombre", 70),
                new Persona("Mujer", 53),
                new Persona("Hombre", 63),
                new Persona("Mujer", 54),
                new Persona("Hombre", 68),
                new Persona("Mujer", 59),
                new Persona("Hombre", 75),
                new Persona("Mujer", 1),
                new Persona("Mujer", 2)
        ));

        Test.leerNumero(7);
        Test.leerPersonas(personas);
        Test.calculoSalario(41,10);
    }
}