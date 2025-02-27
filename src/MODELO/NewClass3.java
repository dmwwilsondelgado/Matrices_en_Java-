/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */

public class NewClass3 {
    int[][] Numbers = new int[3][3];
    
    public void Diagonal (){
        for (int i = 0; i< Numbers.length;i++){
        
        }
    } 
  
    public NewClass3(int filas, int columnas) {
         Numbers = new int[filas][columnas];
    }

    public void llenarMatriz() {
        for (int i = 0; i < Numbers.length; i++) {
            for (int j = 0; j < Numbers[i].length; j++) {
                String input = JOptionPane.showInputDialog(null,
                        "Ingrese el valor para [" + i + "][" + j + "]:",
                        "Ingreso de Datos", JOptionPane.QUESTION_MESSAGE);
                Numbers[i][j] = Integer.parseInt(input);
            }
        }
    }

    public String mostrarMatriz() {
        StringBuilder resultado = new StringBuilder("Matriz ingresada:\n");
        for (int[] fila : Numbers) {
            for (int num : fila) {
                resultado.append(num).append("\t");
            }
            resultado.append("\n");
        }
        return resultado.toString();
    }
}
