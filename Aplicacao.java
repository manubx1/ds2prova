/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplicacaoClinica;
import com.mycompany.mavenproject1.Clinica;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */


public class Aplicacao{

    public static void main(String[] args) {
        // Criar uma clínica
        Clinica senaiSaude = new Clinica("Senai", "Dendezeiros, 188, Bomfim", "0000000000", 75.0, 150.0);


        while (true) {
            System.out.println("\nOpções:");
            System.out.println("a. Realizar atendimento");
            System.out.println("b. Consultar a média de valor dos atendimentos realizados");
            System.out.println("c. Alterar o valor da consulta simples ou o adicional para exames");
            System.out.println("d. Sair");
}
    }
    
}
