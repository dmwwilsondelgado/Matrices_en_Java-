/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VISTA;

import MODELO.NewClass4;

import javax.swing.*;

/**
 * @author Propietario
 *
 */
public class NewMain4 {
    public static void main (String[]args){
        NewClass4 obj = new NewClass4();
        int filas = Integer.parseInt( JOptionPane.showInputDialog("__ingrese el Numero de Filas__"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("__ingrese el Numero de Columnas"));
        int[][] matrix = obj.rellenarLaMatrix(filas,columnas);
        int[] sumamoscolumnas = obj.sumadecolumnas(matrix);
        int[] sumamosFilas = obj.sumadeFilas(matrix);

        obj.mostrarResultados(matrix,sumamosFilas,sumamoscolumnas);
    }
}
