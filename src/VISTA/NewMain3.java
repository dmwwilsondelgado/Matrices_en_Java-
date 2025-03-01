package VISTA;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.JOptionPane;
import MODELO.NewClass3;
/**
 *
 * @author Propietario
 * Crear la siguiente matriz de datos en Java
 */
public class NewMain3 {
    public static void main(String[] args) {
        /**
         *         NewClass3 obj = new NewClass3();
         *         JOptionPane.showMessageDialog(null, obj.encontrarMaximo(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
         *         dataType[][] arrayName = new dataType[rows][columns];
         *         NewClass1 matriz = new NewClass1(filas, columnas);
         *         obj.llenarMatriz();
         *         JOptionPane.showMessageDialog(null, obj.mostrarMatriz(), "Matriz", JOptionPane.INFORMATION_MESSAGE);
         */
        NewClass3 obj = new NewClass3();
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Tamaño de La Matrix"));


        int [][] matriz = obj.generarMatriz(tamaño);
        obj.mostrarMatriz(matriz);
    }
}
