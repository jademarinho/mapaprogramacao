/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author jadem
 */
import javax.swing.JOptionPane;

public class Mavenproject1 {
    public static void main(String[] args) {
        Aluguel aluguel = new Aluguel();
        aluguel.iniciarLocacao();
        aluguel.fecharLocacao();
        aluguel.mostrarResumoLocacao();

        JOptionPane.showMessageDialog(null, aluguel.mostrarResumoLocacao(), "Resumo da Locação", JOptionPane.INFORMATION_MESSAGE);
    }
}
