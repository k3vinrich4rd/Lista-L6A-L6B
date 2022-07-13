package l6a;

import java.util.ArrayList;

public class Professor extends Funcionarios {
    public Professor(String nome, String cpf, String numeroRegistro, String oorgaoDeLotacao, double salario) {
        super();


    }

    ArrayList<String> listaTurmas = new ArrayList<String>();
    private String nivelDeGraduacao;
    private String diciplinaMinistrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeTurmas;


    public Professor(String nome, String cpf, String numeroRegistro, String oorgaoDeLotacao, double salario, String nivelDeGraduacao, String diciplinaMinistrada, int quantidadeDeAlunos, int quantidadeDeTurmas) {
        super();
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.diciplinaMinistrada = diciplinaMinistrada;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

    public void statusProf(){
        System.out.println("Informações sobre o professor(a):");
        System.out.println("Nome do professor : " + this.getNome() + "\nCpf: " + this.getCpf()
        + "\nNúmero de registro: " + this.getNumeroRegistro() + "\nÓrgão de lotação: " + this.getOorgaoDeLotacao()
        + "\nSalário: " + this.getSalario() + "\nNível de graduação: " + this.getNivelDeGraduacao() + "\nDisciplina Ministrada " + this.getDiciplinaMinistrada()
        + "\nQuantidade de turmas: " + this.getQuantidadeDeTurmas() + "\nQuantidade de alunos " + this.getQuantidadeDeAlunos() + "\nAumento de salário de 10%: R$ " + this.aumentoSalario());
        System.out.println();

    }
    public Professor() {
        super();
    }

    @Override
    public void aumentoDeSalario() {
        this.setSalario(this.getSalario() * 0.1);


    }

    public void adicionarTurma(String turmaAno) {
        this.listaTurmas.add(turmaAno);


    }

    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDiciplinaMinistrada() {
        return diciplinaMinistrada;
    }

    public void setDiciplinaMinistrada(String diciplinaMinistrada) {
        this.diciplinaMinistrada = diciplinaMinistrada;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getQuantidadeDeTurmas() {
        return quantidadeDeTurmas;
    }

    public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }
}
