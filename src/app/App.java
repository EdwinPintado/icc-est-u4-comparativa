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


    Callable<Void> funcionIncertion = () -> {
            metodos.SortIncertion(copiaInsercion);
            return null;
        };
    }


    Resultado rIncertion = Benchmarking.medirTiempo(funcionCallable, "Incertion",  , size);
        System.out.println(rIncertion.getName() + "=" + rBubble.getTime());


    public static int[] generate (int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            int numero = (int) (Math.random() * 10000);
            array[i] = numero;
        }
        return array;
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
