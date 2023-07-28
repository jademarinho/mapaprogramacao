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

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;

    public void cadastrarUsuario()  {
        nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        cpf = JOptionPane.showInputDialog("Digite o CPF do cliente:");
        telefone = JOptionPane.showInputDialog("Digite o telefone do cliente:");
    }

    public String mostrarDadosUsuario() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone;
    }
}

