/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import javax.management.modelmbean.ModelMBean;
import javax.swing.*;

/**
 *
 * @author Propietario
 */
public class NewClass4 {


    public int[][] rellenarLaMatrix(int filas, int columnas){
        int[][] matrix = new int[filas][columnas];//instancia la matrix
        for (int i = 0; i < filas;i++){
            for (int j = 0; j < columnas;j++){
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para filas"+i+"y columnas"+j+":"));
            }
        }
        return matrix;
    }


    public int[] sumadeFilas(int[][] matrix){
        int[] sumaFilas = new int[matrix.length];
        for ( int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix.length;j++ ){
                sumaFilas[i] += matrix[i][j];
            }
        }
        return sumaFilas;
    }


    public int [] sumadecolumnas(int[][] matrix){
        int columnas = matrix[0].length;
        int[] sumaColumnas = new int[matrix.length];
        for (int i = 0;i < columnas;i++){
            for (int j = 0;j < matrix.length;j++){
                sumaColumnas[j] += matrix[i][j];
            }
        }
        return sumaColumnas;
    }


    public void mostrarResultados(int[][] matrix, int[] sumadeFilas,int[] sumadecolumnas){
        StringBuilder resultado = new StringBuilder("Matriz ingresa es \n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                resultado.append(matrix[i][j]).append(" ");
            }
            resultado.append(" | Suma Fila: ").append(sumadeFilas[i]).append("\n");
        }
        resultado.append("\nSuma__ de Columnas\n");
        for (int suma : sumadecolumnas){
            resultado.append(suma).append(" ");
        }
        JOptionPane.showMessageDialog(null,resultado.toString());
    }
    // Mostrar Resultados
}
