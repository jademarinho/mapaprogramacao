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

public class Aluguel {
    private int id;
    private Carro carro;
    private Cliente cliente;
    private int qtdDias;
    private int kmInicial;
    private int kmFinal;
    private double valorTotalAluguel;

    public void iniciarLocacao() {
        cliente = new Cliente();
        cliente.cadastrarUsuario();

        carro = new Carro();
        carro.cadastrarCarro();

        String qtdDiasStr = JOptionPane.showInputDialog("Digite a quantidade de dias para locação:");
        qtdDias = Integer.parseInt(qtdDiasStr);

        String kmInicialStr = JOptionPane.showInputDialog("Digite o Km inicial do veículo:");
        kmInicial = Integer.parseInt(kmInicialStr);
    }

    public void fecharLocacao() {
        // Code to read kmFinal through JOptionPane
        String kmFinalStr = JOptionPane.showInputDialog("Digite o Km final do veículo:");
        kmFinal = Integer.parseInt(kmFinalStr);

        int diasLocados = qtdDias;
        double valorPorKm = carro.getValorPorKm();

        double valorLocacao = diasLocados * (kmFinal - kmInicial) * valorPorKm;

        if (diasLocados > 10) {
            valorLocacao *= 0.9; // 10% desconto
        } else if (diasLocados > 20) {
            valorLocacao *= 0.8; // 20% desconto
        }

        valorTotalAluguel = valorLocacao;
    }

    public String mostrarResumoLocacao() {
        String resumo = "Resumo Aluguel\n\n";
        resumo += "Cliente\n" + cliente.mostrarDadosUsuario() + "\n\n";
        resumo += "Carro\n" + carro.mostrarDadosCarro() + "\n\n";
        resumo += "Aluguel\nQuantidade de dias: " + qtdDias + "\nKm Inicial: " + kmInicial + "\nKm Final: " + kmFinal
                + "\nValor Total: R$" + valorTotalAluguel;
        return resumo;
    }
}

