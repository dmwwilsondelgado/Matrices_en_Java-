/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 */

public class NewClass2 {
    private int[][] matriz = {
        {23, 45, 68},
        {25, 9, 12},
        {25, 78, 89}
    };

    public String encontrarMaximo() {
        int maximo = matriz[0][0];
        int filaMax = 0;
        int columnaMax = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    filaMax = i;
                    columnaMax = j;
                }
            }
        }

        return "El valor máximo es: " + maximo + "\nSe encuentra en la posición: [" + filaMax + "][" + columnaMax + "]";
    }
}
