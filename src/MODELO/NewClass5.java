/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import javax.swing.*;
import java.util.Random;

/**
 *
 * @author Propietario
 * Generar un vector de 100 elementos y ordenarlo ascendente apoyados con el método
 * SelectionSort y QuickSort.
 */
public class NewClass5 {
    private int[] vector;

    public NewClass5(int tamaño) {
        vector = new int[tamaño];
    }
    public void generarVector() {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100) + 1;
        }
    }
    public void mostrarVector(String mensaje) {
        System.out.println(mensaje);
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public void selectionSort() {
        int n = vector.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vector[j] < vector[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vector[minIndex];
            vector[minIndex] = vector[i];
            vector[i] = temp;
        }
    }

    public void quickSort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);

            quickSort(low, pi - 1);  // Antes de la partición
            quickSort(pi + 1, high); // Después de la partición
        }
    }

    private int partition(int low, int high) {
        int pivot = vector[high];
        int i = (low - 1); // Indice del elemento más pequeño
        for (int j = low; j < high; j++) {
            // Si el elemento actual es más pequeño o igual al pivote
            if (vector[j] <= pivot) {
                i++;

                // Intercambia vector[i] y vector[j]
                int temp = vector[i];
                vector[i] = vector[j];
                vector[j] = temp;
            }
        }

        // Intercambia vector[i+1] y vector[high] (o el pivote)
        int temp = vector[i + 1];
        vector[i + 1] = vector[high];
        vector[high] = temp;

        return i + 1;
    }

    public int[] getVector() {
        return vector.clone();
    }

    public void setVector(int[] nuevoVector) {
        this.vector = nuevoVector.clone();
    }

}



