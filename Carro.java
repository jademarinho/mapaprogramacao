/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author jadem
 */
import javax.swing.JOptionPane;

public class Carro {
    private int id;
    private String modelo;
    private String marca;
    private double valorPorKm;
    
    public double getValorPorKm() {
    return valorPorKm;
}

    public void cadastrarCarro() {
        modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");
        marca = JOptionPane.showInputDialog("Digite a marca do carro:");
        String valorPorKmStr = JOptionPane.showInputDialog("Digite o valor por Km do carro:");
        valorPorKm = Double.parseDouble(valorPorKmStr);
    }

    public String mostrarDadosCarro() {
        return "Modelo: " + modelo + "\nMarca: " + marca + "\nValor por Km: " + valorPorKm;
    }
}

