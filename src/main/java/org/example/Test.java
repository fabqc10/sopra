package org.example;

import java.util.List;

public class Test {
    // 1. -Escriba un algoritmo que lea un número entero y determine si es par o impar.
    //     -Si es par,que escriba todos los pares de manera descendiente desde sí mismo y hasta el cero.
    //     -Si es impar, que escriba todos los impares de manera descendiente desde si sí mismo hasta el uno.
    //     -Utilice la instrucción LEER NUMERO al inicio del programa para cargar un número en la variable NUMERO.

    public static void leerNumero(int num) {
        for (int i = num; i >= 0; i -= 2) {
            System.out.println(i);
        }
    }

//    2. Escriba un algoritmo que visualice una clasificación de 50 personas según edad y sexo.
//    Deberá mostrar los siguientes resultados:
    //    a. Cantidad de personas mayores de edad (18 años o más).
    //    b. Cantidad de personas menores de edad.
    //    c. Cantidad de personas masculinas mayores de edad.
    //    d. Cantidad de personas femeninas menores de edad.
    //    e. Porcentaje que representan las personas mayores de edad respecto al total de
    //    personas.
    //    f. Porcentaje que representan las mujeres respecto al total de personas.
//    Utilice la instrucción LEER PERSONAS al inicio del programa para cargar los datos de las
//    50 personas en un variable, PERSONAS, que actúa como un vector de 50 posiciones.
//    Cada elemento de PERSONAS es de un tipo estructurado que dispone dos campos:
//    SEXO y EDAD.

    public static void leerPersonas(List<Persona> personas) {
        int mayores = 0;
        int masculinasMayores = 0;
        int mujeres = 0;

        for (Persona persona : personas) {
            if (persona.getEdad() >= 18) {
                mayores++;
                if (persona.getSexo().equalsIgnoreCase("Hombre")) {
                    masculinasMayores++;
                } else {
                    mujeres++;
                }
            } else if (persona.getSexo().equalsIgnoreCase("Mujer")) {
                mujeres++;
            }
        }

        int menores = personas.size() - mayores;
        int femeninasMenores = mujeres - masculinasMayores;

        double porcentajeMayores = ((double) mayores / personas.size()) * 100;
        double porcentajeMujeres = ((double) mujeres / personas.size()) * 100;

        System.out.println("Personas mayores de edad: " + mayores);
        System.out.println("Personas menores de edad: " + menores);
        System.out.println("Personas masculinas mayores de edad: " + masculinasMayores);
        System.out.println("Personas femeninas menores de edad: " + femeninasMenores);
        System.out.println("Porcentaje que representan las personas mayores: " + porcentajeMayores);
        System.out.println("Porcentaje que representan las mujeres: " + porcentajeMujeres);
    }

//    3.
//    Desarrolle un algoritmo para el cálculo del salario de un trabajador. El importe
//    liquidado (sueldo) depende de una tarifa o precio por hora establecida y de un
//    condicionante sobre las horas trabajadas: si la cantidad de horas trabajadas es mayor a
//     40 horas, la tarifa se incrementa en un 50% para las horas extras. Calcular el sueldo
//    recibido por el trabajador en base las horas trabajadas y la tarifa. Utilice las
//    instrucciones LEER HORASTRABAJADAS y LEER TARIFA al inicio del programa para
//    cargar los valores en las variables HORASTRABAJADAS y TARIFA.


    public static void calculoSalario(double horasTrabajadas, double tarifa) {
        double sueldo;
        if (horasTrabajadas <= 40) {
            sueldo = horasTrabajadas * tarifa;
            System.out.println("El sueldo del trabajador es: " + sueldo);
        } else {
            double horasExtra = horasTrabajadas - 40;
            double suplementoPorHExtra = tarifa * 0.5 + tarifa;
            double totalPrecioHExtra = horasExtra * suplementoPorHExtra;
            double sueldoBase = 40 * tarifa;
            sueldo = sueldoBase + totalPrecioHExtra;
            System.out.println("El sueldo del trabajador es: " + sueldo);
        }
    }

}

