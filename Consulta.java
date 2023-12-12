/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
/**
 *
 * @author Aluno
 */

class EValorInvalidoException extends RuntimeException {
    public EValorInvalidoException(String message) {
        super(message);
    }
}

class Paciente {
    private String cpf;
    private String nome;

    public Paciente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}

public class Consulta {
    private Paciente paciente;
    private String dataAtendimento;
    private String localAtendimento;
    private double valorConsulta;

    public Consulta(Paciente paciente, String dataAtendimento, String localAtendimento, double valorConsulta) {
        this.paciente = paciente;
        this.dataAtendimento = dataAtendimento;
        this.localAtendimento = localAtendimento;

        if (valorConsulta < 0) {
            throw new EValorInvalidoException("Valor Invalido.");
        }

        this.valorConsulta = valorConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getDataAtendimento() {
        return dataAtendimento;
    }

    public String getLocalAtendimento() {
        return localAtendimento;
    }

    protected double getValorConsulta() {
        return valorConsulta;
    }

 
}