package app;

import java.util.concurrent.Callable;
import controller.SortPersonaMethods;
import models.Persona;
import models.Resultado;
import utils.Benchmarking;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("PRUEBA CON 10.000 PERSONAS");
        int size = 10000; 
        String escenario = "Desordenado"; 
        
        Persona[] base = generarPersonas(size);
        Persona[] copiaInsercion = base.clone();
        Persona[] copiaQuickSort = base.clone();

        SortPersonaMethods metodos = new SortPersonaMethods();

        Callable<Void> funcionInsertion = () -> {
            metodos.insertionSort(copiaInsercion);
            return null;
        };
    

        Resultado rIncertion = Benchmarking.medirTiempo(funcionInsertion, "Insertion",escenario, size);
            System.out.println("\n" + rIncertion );


        Callable<Void> funcionQuickSort = () -> {
            metodos.quickSort(copiaQuickSort, 0 , copiaQuickSort.length - 1 );
            return null;
        };
    

        Resultado rQuickSort = Benchmarking.medirTiempo(funcionQuickSort, "QuickSort",escenario, size);
            System.out.println(rQuickSort );

        int size2 = size +1;
        metodos.quickSort(base, 0 , base.length -1);
        Persona[] baseCasiOrdenada = new Persona[size2];

        for(int  i = 0 ; i< base.length; i++){
            baseCasiOrdenada[i] = base[i];

        }

        int bCOrdenada = baseCasiOrdenada.length-1; 
        baseCasiOrdenada[bCOrdenada] = new Persona ("Nueva Persona", (int) (Math.random() * 101));
        Persona[] copiaInsercionN2 = baseCasiOrdenada.clone();
        Persona[] copiaQuickSortN2 = baseCasiOrdenada.clone();

        SortPersonaMethods metodos2 = new SortPersonaMethods();

        Callable<Void> funcionInsertion2 = () -> {
            metodos2.insertionSort(copiaInsercionN2);
            return null;
        };
    

        Resultado rIncertion2 = Benchmarking.medirTiempo(funcionInsertion2, "Insertion", "Casi ordenado + 1 persona" , size2);
            System.out.println(rIncertion2 );


        Callable<Void> funcionQuickSort2 = () -> {
            metodos2.quickSort(copiaQuickSortN2, 0 , copiaQuickSortN2.length - 1 );
            return null;
        };
    

        Resultado rQuickSort2 = Benchmarking.medirTiempo(funcionQuickSort2, "QuickSort","Casi ordenado + 1 persona", size2);
            System.out.println(rQuickSort2 +  "\n" );


        System.out.println("PRUEBA CON 50.000 PERSONAS");
        int size3 = 50000; 
        String escenario3 = "Desordenado"; 
        
        Persona[] base3 = generarPersonas(size3);
        Persona[] copiaInsercion3 = base3.clone();
        Persona[] copiaQuickSort3 = base3.clone();

        SortPersonaMethods metodos3 = new SortPersonaMethods();

        Callable<Void> funcionInsertion3 = () -> {
            metodos3.insertionSort(copiaInsercion3);
            return null;
        };
    

        Resultado rIncertion3 = Benchmarking.medirTiempo(funcionInsertion3, "Insertion",escenario3, size3);
            System.out.println("\n" + rIncertion3 );


        Callable<Void> funcionQuickSort3 = () -> {
            metodos3.quickSort(copiaQuickSort3, 0 , copiaQuickSort3.length - 1 );
            return null;
        };
    

        Resultado rQuickSort3 = Benchmarking.medirTiempo(funcionQuickSort3, "QuickSort",escenario3, size3);
            System.out.println(rQuickSort3 );

        int size4 = size3 +1;
        metodos3.quickSort(base3, 0 , base3.length -1);
        Persona[] baseCasiOrdenada3 = new Persona[size4];

        for(int  i = 0 ; i< base3.length; i++){
            baseCasiOrdenada3[i] = base3[i];

        }

        int bCOrdenada3 = baseCasiOrdenada3.length-1; 
        baseCasiOrdenada3[bCOrdenada3] = new Persona ("Nueva Persona", (int) (Math.random() * 101));
        Persona[] copiaInsercion4 = baseCasiOrdenada3.clone();
        Persona[] copiaQuickSort4 = baseCasiOrdenada3.clone();

        SortPersonaMethods metodos4 = new SortPersonaMethods();

        Callable<Void> funcionInsertion4 = () -> {
            metodos4.insertionSort(copiaInsercion4);
            return null;
        };
    

        Resultado rIncertion4 = Benchmarking.medirTiempo(funcionInsertion4, "Insertion", "Casi ordenado + 1 persona" , size4);
            System.out.println(rIncertion4 );


        Callable<Void> funcionQuickSort4 = () -> {
            metodos4.quickSort(copiaQuickSort4, 0 , copiaQuickSort4.length - 1 );
            return null;
        };
    

        Resultado rQuickSort4 = Benchmarking.medirTiempo(funcionQuickSort4, "QuickSort","Casi ordenado + 1 persona", size4);
            System.out.println(rQuickSort4 +  "\n" );


        System.out.println("PRUEBA CON 100.000 PERSONAS");
        int size5 = 100000; 
        String escenario5 = "Desordenado"; 
        
        Persona[] base5 = generarPersonas(size5);
        Persona[] copiaInsercion5 = base5.clone();
        Persona[] copiaQuickSort5 = base5.clone();

        SortPersonaMethods metodos5 = new SortPersonaMethods();

        Callable<Void> funcionInsertion5 = () -> {
            metodos5.insertionSort(copiaInsercion5);
            return null;
        };
    

        Resultado rIncertion5 = Benchmarking.medirTiempo(funcionInsertion5, "Insertion Sort",escenario5, size5);
            System.out.println("\n" + rIncertion5 );


        Callable<Void> funcionQuickSort5 = () -> {
            metodos5.quickSort(copiaQuickSort5, 0 , copiaQuickSort5.length - 1 );
            return null;
        };
    

        Resultado rQuickSort5 = Benchmarking.medirTiempo(funcionQuickSort5, "QuickSort",escenario5, size5);
            System.out.println(rQuickSort5 );

        int size6 = size5 +1;
        metodos5.quickSort(base5, 0 , base5.length -1);
        Persona[] baseCasiOrdenada5 = new Persona[size6];

        for(int  i = 0 ; i< base5.length; i++){
            baseCasiOrdenada5[i] = base5[i];

        }

        int bCOrdenada5 = baseCasiOrdenada5.length-1; 
        baseCasiOrdenada5[bCOrdenada5] = new Persona ("Nueva Persona", (int) (Math.random() * 101));
        Persona[] copiaInsercion6 = baseCasiOrdenada5.clone();
        Persona[] copiaQuickSort6 = baseCasiOrdenada5.clone();

        SortPersonaMethods metodos6 = new SortPersonaMethods();

        Callable<Void> funcionInsertion6 = () -> {
            metodos6.insertionSort(copiaInsercion6);
            return null;
        };
    

        Resultado rIncertion6 = Benchmarking.medirTiempo(funcionInsertion6, "Insertion Sort", "Casi ordenado + 1 persona" , size6);
            System.out.println(rIncertion6 );


        Callable<Void> funcionQuickSort6 = () -> {
            metodos6.quickSort(copiaQuickSort6, 0 , copiaQuickSort6.length - 1 );
            return null;
        };
    

        Resultado rQuickSort6 = Benchmarking.medirTiempo(funcionQuickSort6, "QuickSort","Casi ordenado + 1 persona", size6);
            System.out.println(rQuickSort6 +  "\n" );


    }

 
    public static Persona[] generarPersonas(int cantidad){
        Persona[] personas = new Persona[cantidad];
        for (int i = 0; i < cantidad; i++){
            String nombre = "Persona " + (i + 1);
            int edad = (int) (Math.random() * 101);
            personas[i] = new Persona(nombre, edad);
        }
        return personas; 
    }
}
