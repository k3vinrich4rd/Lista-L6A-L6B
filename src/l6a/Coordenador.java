package l6a;


import java.util.List;

public class Coordenador extends Funcionarios {
    private List<String> professoresSuperVisionados;


    @Override
    public void aumentoDeSalario() {
        this.setSalario(this.getSalario() * 0.05);

    }

    //Get e set
    public List<String> getProfessoresSuperVisionados() {
        return professoresSuperVisionados;
    }

    public void setProfessoresSuperVisionados(List<String> professoresSuperVisionados) {
        this.professoresSuperVisionados = professoresSuperVisionados;
    }

    public void adicionarProfessor(Professor listaDeProfessores) {
        this.professoresSuperVisionados= (List<String>) listaDeProfessores;
    }

    public void statusCoordenador() {
        System.out.println();
        System.out.println("Informações sobre o coordenador: ");
        System.out.println("Nome do coordenador(a): " + this.getNome() + "\nCpf: " + this.getCpf() + "\nNúmero de registro: " + this.getNumeroRegistro() +
                "\nÓrgão de lotação: " + this.getOorgaoDeLotacao() + "\nSalário: " + this.getSalario() + "\nAumento Salário de 5%: R$ " + this.aumentoSalario() + "\n" +
                "Professores supervisionados: " + this.getProfessoresSuperVisionados());
        System.out.println();

    }

}

