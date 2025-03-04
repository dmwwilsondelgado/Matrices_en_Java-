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
public class NewClass6 {
    private int [][] matriz;
    private int n ; // tamaño de la matriz
    public NewClass6(int n ){
        if ( this.n == n ){
            this.matriz = new int[n][n];

        }else {
            return;
        }
    }
    //public NewdClass6{
        //this.n
        //this.matriz = new int[n][n];
    //}
    public int[][] getMatriz(){
        return matriz;
    }
    public void setMatriz(int[][] matriz){
        this.matriz = matriz;
    }
    public  int salidaN(){
        return n;
    }
    public String imprimirContorno(){
        StringBuilder contornoo = new StringBuilder("Contorno de la Matriz\n");
        for (int i = 0 ; i < n ; i ++ ){
            for (int j = 0; j < n; j ++ ){
                if (i == 0 || j == n - 1 || i == n - 1 || j == 0) {//Condición para el contorno: primera fila, última columna, última fila, primera columna
                    contornoo.append(matriz[i][j]).append(" ");
                } else {
                    contornoo.append("  "); // Espacios para los elementos que no son del contorno
                }
            }
            contornoo.append("\n");
        }
        return contornoo.toString();
    }

    public String VizualizarMatrix() {
        StringBuilder MatrizCompleta = new StringBuilder("Matrix Completa : \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                MatrizCompleta.append(matriz[i][j]).append(" ");

            }
            MatrizCompleta.append("\n");
        }
        return MatrizCompleta.toString();
    }







    // Con Ia Intentamos Usar Try Cath Para Corregir errroes
    public static int obtenerTamañoMatriz() {
        int tamaño = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            String input = JOptionPane.showInputDialog(null,
                    "Ingrese el tamaño de la matriz (N x N):",
                    "Tamaño de la Matriz",
                    JOptionPane.QUESTION_MESSAGE);
            try {
                tamaño = Integer.parseInt(input);
                if (tamaño > 0) {
                    entradaValida = true;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Por favor, ingrese un número positivo.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Entrada inválida. Por favor, ingrese un número entero.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } catch (NullPointerException e) {
                System.exit(0); // Manejar el caso en que el usuario cancela el diálogo
            }
        }
        return tamaño;
    }


    public static void llenarMatriz(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean entradaValida = false;
                while (!entradaValida) {
                    String input = JOptionPane.showInputDialog(null,
                            "Ingrese el valor para la posición [" + (i + 1) + "][" + (j + 1) + "]:",
                            "Ingreso de Datos",
                            JOptionPane.QUESTION_MESSAGE);
                    try {
                        matriz[i][j] = Integer.parseInt(input);
                        entradaValida = true;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null,
                                "Entrada inválida. Por favor, ingrese un número entero.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    } catch (NullPointerException e) {
                        System.exit(0); // Manejar el caso en que el usuario cancela el diálogo
                    }
                }
            }
        }
    }

}
