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
    public int[] generamoselVector(){
        int[] vector = new int[100];
        Random random = new Random();
        for (int i = 0; i < vector.length; i++){
            vector[i] = random.nextInt(1000);
            //EL evento Next Int() sirve para permitir leer enteros diferentes en basases numericas
        }
        return vector;
    }
    public void mostrarelVector (int[] vector, String mensajote){
        JOptionPane.showMessageDialog(null,mensajote + "\n" +java.util.Arrays.toString(vector));
    }
    public void SelectionSort(int[] vector){

    }
    public void QuickSort(int[] vector){

    }

}
