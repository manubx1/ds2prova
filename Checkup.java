/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public class Checkup extends Consulta{
     private double valorAdicional;

    public Checkup(double valorAdicional, Paciente paciente, String dataAtendimento, String localAtendimento, double valorConsulta) {
        super(paciente, dataAtendimento, localAtendimento, valorConsulta);
        this.valorAdicional = valorAdicional;

     
      if (valorAdicional < 0) {
            throw new EValorInvalidoException("Valor Invalido.");
        }

        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    
    @Override
    protected double getValorConsulta() {
         return super.getValorConsulta() + valorAdicional;
       }
    
     // 18%
    public double ValorFinalDescon(){
        return getValorConsulta() + valorAdicional * 0.85;
    }
   
    
}

