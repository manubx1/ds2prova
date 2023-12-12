/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Clinica {
    private String nome;
    private String endereco;
    private String cnpj;
    private double valorConsultaSimples;
    private double valorAdicionalExames;
    private List<Consulta> atendimentosRealizados;

    public Clinica(String nome, String endereco, String cnpj, double valorConsultaSimples, double valorAdicionalExames) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        if (valorConsultaSimples < 0 || valorAdicionalExames < 0) {
            throw new EValorInvalidoException("Valores inválidos para consulta simples ou adicional de exames");
        }
        this.valorConsultaSimples = valorConsultaSimples;
        this.valorAdicionalExames = valorAdicionalExames;
        this.atendimentosRealizados = new ArrayList<>();
    }

    // Métodos 

    public double getValorTotal() {
        double total = 0;
        for (Consulta consulta : atendimentosRealizados) {
            total += consulta.getValorConsulta();
        }
        return total;
    }

    public void alterarValorConsultaSimples(double novoValor) {
        if (novoValor >= 0) {
            this.valorConsultaSimples = novoValor;
        } else {
            throw new EValorInvalidoException("Valor Invalido.");
        }
    }

    public void alterarValorAdicionalExames(double novoValor) {
        if (novoValor >= 0) {
            this.valorAdicionalExames = novoValor;
        } else {
            throw new EValorInvalidoException("Valor Invalido.");
        }
    }

    public double realizarAtendimento(String tipoConsulta, Paciente paciente, String data, String localAtendimento) {
        double valorAtendimento = 0;
        if (tipoConsulta.equals("Simples")) {
            Consulta consultaSimples = new Consulta(paciente, data, localAtendimento, valorConsultaSimples);
            atendimentosRealizados.add(consultaSimples);
            valorAtendimento = valorConsultaSimples;
        } else if (tipoConsulta.equals("Check-up")) {
            Checkup checkup = new Checkup(valorAdicionalExames, paciente, localAtendimento, localAtendimento, valorConsultaSimples);
            atendimentosRealizados.add(checkup);
            valorAtendimento = checkup.getValorConsulta();
        } else {
            throw new EValorInvalidoException("Tipo de consulta não reconhecida");
        }
        return valorAtendimento;
    }
}

