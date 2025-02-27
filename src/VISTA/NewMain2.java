package VISTA;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.JOptionPane;
import MODELO.NewClass2;

/**
 *
 * @author Propietario
 * Crear la siguiente matriz de datos en Java
 */
public class NewMain2 {
    public static void main(String[] args) {
        NewClass2 matriz = new NewClass2();
        JOptionPane.showMessageDialog(null, matriz.encontrarMaximo(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
