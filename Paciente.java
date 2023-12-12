/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class EValorInvalidoException extends RuntimeException {
    public EValorInvalidoException(String message) {
        super(message);
    }
}

 public class Paciente {
    private String cpf;
    private String nome;
    private Date dataNascimento;
    private String planoSaude;

    public Paciente(String cpf, String nome, String dataNascimento, String planoSaude) {
        this.cpf = cpf;
        this.nome = nome;

        
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            this.dataNascimento = dateFormat.parse(dataNascimento);
        } catch (ParseException e) {
            throw new EValorInvalidoException("Data de nascimento inválida: " + dataNascimento);
        }

        this.planoSaude = planoSaude;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(dataNascimento);
    }

    public String getPlanoSaude() {
        return planoSaude;
    }
}
       