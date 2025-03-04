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
        NewClass5 obj = new NewClass5(100);

        //generamos un vector con numeros aletorios en este
        obj.generarVector();

        // Mostrar el vector original en consola
        obj.mostrarVector("Vector Original:");

        // Crear una copia del vector para Selection Sort y ordenarlo
        int[] vectorSelection = obj.getVector();
        NewClass5 objSelection = new NewClass5(100);
        objSelection.setVector(vectorSelection);
        objSelection.selectionSort();
        objSelection.mostrarVector("Ordenado con Selection Sort:");

        // Crear una copia del vector para QuickSort y ordenarlo
        int[] vectorQuick = obj.getVector();
        NewClass5 objQuick = new NewClass5(100);
        objQuick.setVector(vectorQuick);
        objQuick.quickSort(0, vectorQuick.length - 1);
        objQuick.mostrarVector("Ordenado con Quick Sort:");

    }
}

