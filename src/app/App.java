package app;

import java.util.concurrent.Callable;

import controller.SortPersonaMethods;
import models.Persona;
import models.Resultado;
import utils.Benchmarking;

public class App {
    public static void main(String[] args) throws Exception {

        int size = 10000; 
        
        Persona[] base = generarPersonas(size);
        Persona[] copiaInsercion = base.clone();
        Persona[] copiaQuickSort = base.clone();

        SortPersonaMethods metodos = new SortPersonaMethods();

        Callable<Void> funcionInsertion = () -> {
            metodos.insertionSort(copiaInsercion);
            return null;
        };
    

        Resultado rIncertion = Benchmarking.medirTiempo(funcionInsertion, "Insertion Sort","Aleatorio", size);
            System.out.println(rIncertion.getAlgoritmo() + "en milisegundos= " + rIncertion.getTiempoMillis());


        Callable<Void> funcionQuickSort = () -> {
            metodos.quickSort(copiaQuickSort, 0 , copiaQuickSort.length - 1 );
            return null;
        };
    

        Resultado rQuickSort = Benchmarking.medirTiempo(funcionQuickSort, "QuickSort","Aleatorio", size);
            System.out.println(rQuickSort.getAlgoritmo() + "en milisegundos= " + rQuickSort.getTiempoMillis());
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
