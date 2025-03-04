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
    public static  int obtenerTamañoMatriz() {
        int tamaño = 0;
        boolean entradaValida = false; // definimos entrada valida en falso
        // usamos un mientras para Preguntar Los valores dela matriz
        // Con Ia Intentamos Usar Try Cath Para Corregir errroes
        while (!entradaValida) {
            String input = JOptionPane.showInputDialog(null,
                    "Ingrese el tamaño de la matriz (N x N):",
                    "Tamaño de la Matriz",
                    JOptionPane.QUESTION_MESSAGE);
            try {
                tamaño = Integer.parseInt(input);
                if (tamaño > 0) {// Colocamos una condicion si el valor es mayor a cerpo a ingresar la matrix
                    entradaValida = true;// lo que nos va a adar Verdadero
                } else { // si No  nos mostrara un mensaje de Alerta
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


    //------------------------------------------------------------------------
    public static void main(String[] args) {
        //  Solicitar el tamaño N de la matriz
        int n = obtenerTamañoMatriz();
        //  Crear el objeto modelo
        NewClass6 obj = new NewClass6(n);
        int[][] matriz = obj.getMatriz();
        //  Llenar la matriz con valores ingresados por el usuario
        obj.llenarMatriz(matriz, n);
        obj.setMatriz(matriz);
        //  Imprimir el contorno de la matriz
        String contorno = obj.imprimirContorno();
        JOptionPane.showMessageDialog(null,
                contorno, "Contorno de la Matriz",
                JOptionPane.INFORMATION_MESSAGE);
        //  Visualizar la matriz completa
        String matrizCompleta = obj.VizualizarMatrix();
        JOptionPane.showMessageDialog(null,
                matrizCompleta, "Matriz Completa",
                JOptionPane.INFORMATION_MESSAGE);
    }
}