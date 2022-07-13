package L6a;

import java.util.Collections;
import java.util.List;

public abstract class Funcionarios {
    private String nome;
    private String cpf;
    private String numeroRegistro;
    private String oorgaoDeLotacao;
    public double salario;


    public Funcionarios() {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroRegistro = numeroRegistro;
        this.oorgaoDeLotacao = oorgaoDeLotacao;
        this.salario = salario;



    }
    public int aumentoSalario(){
        return (int) (salario = this.salario * 0.1);
    }

    public List<String> getNome(){
        return Collections.singletonList(nome);
    }

    public abstract void aumentoDeSalario();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getOorgaoDeLotacao() {
        return oorgaoDeLotacao;
    }

    public void setOorgaoDeLotacao(String oorgaoDeLotacao) {
        this.oorgaoDeLotacao = oorgaoDeLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;

    }
}
