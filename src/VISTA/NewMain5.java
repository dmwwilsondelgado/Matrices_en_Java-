/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VISTA;
/**
 * @author Propietario
 * Generar un vector de 100 elementos y ordenarlo ascendente apoyados con el método
 * SelectionSort y QuickSort.
 * Página de consulta: Baudino, G. (s/f). MetodosDeOrdenamiento: Métodos de ordenamiento con
 * sus especificaciones, características y su código en Python 3. Comparativa final entre los
 * algoritmos de ordenamiento. https://github.com/gbaudino/MetodosDeOrdenamiento
 */

import MODELO.NewClass5;

public class NewMain5 {
    public static void main(String[] args) {
        NewClass5 modelo = new NewClass5();
        int[] vector = modelo.generarVector();

        modelo.mostrarVector(vector, "Vector Original:");

        int[] vectorSelection = vector.clone();
        modelo.selectionSort(vectorSelection);
        modelo.mostrarVector(vectorSelection, "Ordenado con SelectionSort:");

        int[] vectorQuick = vector.clone();
        modelo.quickSort(vectorQuick, 0, vectorQuick.length - 1);
        modelo.mostrarVector(vectorQuick, "Ordenado con QuickSort:");
    }
}

