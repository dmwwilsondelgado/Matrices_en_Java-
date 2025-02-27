/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;
import javax.swing.JOptionPane;
/**
 *
 * @author Propietario
 * Crear la siguiente matriz de datos en Java
 */
public class NewClass1 {
    private int[][] matriz;

    public NewClass1(int filas, int columnas) {
         matriz = new int[filas][columnas];
    }

    public void llenarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String input = JOptionPane.showInputDialog(null,
                        "Ingrese el valor para [" + i + "][" + j + "]:",
                        "Ingreso de Datos", JOptionPane.QUESTION_MESSAGE);
                matriz[i][j] = Integer.parseInt(input);
            }
        }
    }

    public String mostrarMatriz() {
        StringBuilder resultado = new StringBuilder("Matriz ingresada:\n");
        for (int[] fila : matriz) {
            for (int num : fila) {
                resultado.append(num).append("\t");
            }
            resultado.append("\n");
        }
        return resultado.toString();
    }
}