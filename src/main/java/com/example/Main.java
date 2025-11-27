package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }

    // Ejercicio 1
    public static void ejercicio1() {
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Pera");

        frutas.add(2, "Uva");
        frutas.set(3, "Kiwi");

        int cantidadFrutas = frutas.size();
        System.out.println("Cantidad de frutas: " + cantidadFrutas);

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        System.out.println("------------------------------------------------ ejercicio 1 fin");
    }

    // Ejercicio 2
    public static void ejercicio2() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(20);

        if (numeros.size() > 2) {
            numeros.remove(2);
        }
        if (numeros.size() > 1) {
            numeros.remove(1);
        }

        boolean contiene40 = numeros.contains(40);
        int tamañoFinal = numeros.size();
        System.out.println("Contiene número 40: " + contiene40);
        System.out.println("Tamaño final: " + tamañoFinal);

        for (int num : numeros) {
            System.out.println(num);
        }
        System.out.println("------------------------------------------------ ejercicio 2 fin");
    }

    // Ejercicio 3
    public static void ejercicio3() {
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Maria");
        nombres.add("Carlos");
        nombres.add("Elena");

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Índice " + i + ": " + nombres.get(i));
        }

        int count = 0;
        for (String n : nombres) {
            if (n != null && n.length() > 4) {
                count++;
            }
        }
        System.out.println("Nombres con más de 4 caracteres: " + count);
        System.out.println("Total nombres: " + nombres.size());
        System.out.println("------------------------------------------------ ejercicio 3 fin");
    }

    // Ejercicio 4
    public static void ejercicio4() {
        List<Double> valores = new ArrayList<>(Arrays.asList(15.5, 23.8, 9.2, 31.7, 12.4));

        double suma = 0.0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;

        for (Double v : valores) {
            if (v != null) {
                suma += v;
                if (v > max) {
                    max = v;
                }
                if (v < min) {
                    min = v;
                }
            }
        }

        double promedio = valores.isEmpty() ? 0.0 : suma / valores.size();

        System.out.println("Suma: " + suma);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Promedio: " + promedio);
        System.out.println("------------------------------------------------ ejercicio 4 fin");
    }

    // Ejercicio 5
    public static void ejercicio5() {
        List<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integers.add(i);
        }
        System.out.println("Lista antes de eliminar: " + integers);

        Iterator<Integer> it = integers.iterator();
        int countEliminados = 0;
        while (it.hasNext()) {
            Integer num = it.next();
            if (num % 2 == 0) {
                it.remove();
                countEliminados++;
            }
        }

        System.out.println("Lista después de eliminar pares: " + integers);
        System.out.println("Cantidad de elementos eliminados: " + countEliminados);
        System.out.println("------------------------------------------------ ejercicio 5 fin");
    }

    // Ejercicio 6
    public static void ejercicio6() {
        List<String> lenguaje = new ArrayList<>(Arrays.asList(
                "Java", "Python", "C++", "JavaScript", "Python", "Go"
        ));

        int primeraPython = lenguaje.indexOf("Python");
        int ultimaPython = lenguaje.lastIndexOf("Python");
        boolean contieneRuby = lenguaje.contains("Ruby");
        List<String> subLista = lenguaje.subList(1, 4);

        System.out.println("Lista completa: " + lenguaje);
        System.out.println("Primera aparición de Python: " + primeraPython);
        System.out.println("Última aparición de Python: " + ultimaPython);
        System.out.println("Contiene Ruby: " + contieneRuby);
        System.out.println("Sublista (índice 1 a 3): " + subLista);
        System.out.println("------------------------------------------------ ejercicio 6 fin");
    }

    // Ejercicio 7
    public static void ejercicio7() {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(45, 12, 78, 23, 67, 34, 89, 56));

        Collections.sort(numeros);
        System.out.println("Lista ordenada ascendente: " + numeros);

        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Lista ordenada descendente: " + numeros);

        List<String> nombres = new ArrayList<>(Arrays.asList("Ana", "Juan", "Pedro", "María", "Luis"));

        Collections.sort(nombres);
        System.out.println("Nombres ordenados alfabéticamente: " + nombres);

        nombres.sort(Comparator.comparingInt(String::length));
        System.out.println("Nombres ordenados por longitud: " + nombres);
        System.out.println("------------------------------------------------ ejercicio 7 fin");
    }

    // Ejercicio 8
    public static void ejercicio8() {
        List<String> palabras = new ArrayList<>(Arrays.asList(
                "casa", "auto", "bicicleta", "avión", "barco", "tren"
        ));

        palabras.removeIf(p -> p.length() < 5);
        System.out.println("Palabras con 5 o más caracteres: " + palabras);

        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numeros.add(i);
        }

        numeros.removeIf(n -> n % 3 == 0);
        System.out.println("Números no divisibles por 3: " + numeros);
        System.out.println("------------------------------------------------ ejercicio 8 fin");
    }

    // Ejercicio 9
    public static void ejercicio9() {
        List<String> dias = new ArrayList<>(Arrays.asList(
                "Lunes", "Martes", "Miércoles", "Jueves", "Viernes"
        ));

        Object[] arregloObject = dias.toArray();
        String[] arregloString = dias.toArray(new String[0]);

        System.out.println("Longitud arreglo Object: " + arregloObject.length);
        System.out.println("Longitud arreglo String: " + arregloString.length);

        System.out.print("Elementos arreglo Object: ");
        for (Object o : arregloObject) {
            System.out.print(o + " ");
        }
        System.out.println();

        System.out.print("Elementos arreglo String: ");
        for (String s : arregloString) {
            System.out.print(s + " ");
        }
        System.out.println();

        String[] colores = {"Rojo", "Verde", "Azul"};
        List<String> listaColores = new ArrayList<>(Arrays.asList(colores));
        System.out.println("ArrayList creado desde arreglo: " + listaColores);
        System.out.println("------------------------------------------------ ejercicio 9 fin");
    }

    // Ejercicio 10
    public static void ejercicio10() {
        List<String> nombres = new ArrayList<>();
        List<Double> calificaciones = new ArrayList<>();

        agregarEstudiante(nombres, calificaciones, "Ana", 4.5);
        agregarEstudiante(nombres, calificaciones, "Luis", 2.8);
        agregarEstudiante(nombres, calificaciones, "María", 3.7);
        agregarEstudiante(nombres, calificaciones, "Carlos", 4.2);
        agregarEstudiante(nombres, calificaciones, "Elena", 2.5);

        System.out.println("Lista inicial:");
        listarEstudiantes(nombres, calificaciones);

        System.out.println("\nPromedio general: " + calcularPromedio(calificaciones));

        System.out.println("\nEstudiantes aprobados:");
        estudiantesAprobados(nombres, calificaciones);

        eliminarEstudiante(nombres, calificaciones, 1); // elimina a Luis

        int posMaria = buscarEstudiante(nombres, "María");
        System.out.println("\nPosición de María: " + posMaria);

        System.out.println("\nLista final:");
        listarEstudiantes(nombres, calificaciones);

        System.out.println("------------------------------------------------ ejercicio 10 fin");
    }

    // Métodos auxiliares para ejercicio 10
    public static void agregarEstudiante(List<String> nombres, List<Double> calificaciones,
                                         String nombre, Double calificacion) {
        nombres.add(nombre);
        calificaciones.add(calificacion);
    }

    public static void eliminarEstudiante(List<String> nombres, List<Double> calificaciones, int indice) {
        if (indice >= 0 && indice < nombres.size()) {
            nombres.remove(indice);
            calificaciones.remove(indice);
        }
    }

    public static int buscarEstudiante(List<String> nombres, String nombre) {
        return nombres.indexOf(nombre);
    }

    public static double calcularPromedio(List<Double> calificaciones) {
        if (calificaciones.isEmpty()) {
            return 0.0;
        }
        double suma = 0;
        for (double c : calificaciones) {
            suma += c;
        }
        return suma / calificaciones.size();
    }

    public static void listarEstudiantes(List<String> nombres, List<Double> calificaciones) {
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(i + ". " + nombres.get(i) + " - " + calificaciones.get(i));
        }
    }

    public static void estudiantesAprobados(List<String> nombres, List<Double> calificaciones) {
        for (int i = 0; i < nombres.size(); i++) {
            if (calificaciones.get(i) >= 3.0) {
                System.out.println(nombres.get(i) + " - " + calificaciones.get(i));
            }
        }
    }
}
