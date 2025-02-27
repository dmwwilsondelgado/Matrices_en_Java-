/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VISTA;
import javax.swing.JOptionPane;
import MODELO.NewClass1;

/**
 *
 * @author Propietario
 * Crear la siguiente matriz de datos en Java
 */
public class NewMain1 {

 
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 5;
    
        NewClass1 matriz = new NewClass1(filas, columnas);
        matriz.llenarMatriz();
        JOptionPane.showMessageDialog(null, matriz.mostrarMatriz(), "Matriz", JOptionPane.INFORMATION_MESSAGE);
    }
}
