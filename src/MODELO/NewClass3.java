/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import javax.swing.*;

/**
 *
 * @author Propietario
 */

public class NewClass3 {

    public int[][] generarMatriz(int tamaño ){
        int[][] matriz = new int [tamaño][tamaño];
        for (int i = 0; i < tamaño; i ++){
            matriz[i][i] = 1;
        }
        return matriz;
    }

    public void mostrarMatriz(int[][]matriz){
        StringBuilder resultado = new StringBuilder("Matriz generada \n");
        for (int[] fila : matriz){
            for (int elemento :fila){
                resultado.append(elemento).append("");
            }
            resultado.append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
