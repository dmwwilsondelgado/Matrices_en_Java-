/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VISTA;
/**
 * @author Propietario
 */

import MODELO.NewClass6;

import javax.swing.JOptionPane;

public class NewMain6 {

    public static void main(String[] args) {
        //  Solicitar el tamaño N de la matriz
        int n = obtenerTamañoMatriz();

        obj.obtenerTamañoMatriz;



        //  Crear el objeto modelo
        NewClass6 obj = new NewClass6(n);
        int[][] matriz = obj.getMatriz();

        //  Llenar la matriz con valores ingresados por el usuario
        llenarMatriz(matriz, n);
        matrizObj.setMatriz(matriz);

        //  Imprimir el contorno de la matriz
        String contorno = obj.imprimirContorno();
        JOptionPane.showMessageDialog(null, contorno, "Contorno de la Matriz", JOptionPane.INFORMATION_MESSAGE);

        //  Visualizar la matriz completa
        String matrizCompleta = obj.VizualizarMatrix();
        JOptionPane.showMessageDialog(null, matrizCompleta, "Matriz Completa", JOptionPane.INFORMATION_MESSAGE);
    }

}