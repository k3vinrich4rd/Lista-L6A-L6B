package l6a;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Kleber");
        professor.setCpf("777. 777. 777 - 63 ");
        professor.setNumeroRegistro("1654");
        professor.setOorgaoDeLotacao("Secret�ria da Educa��o - Sp");
        professor.setSalario(20000);
        professor.setNivelDeGraduacao("Licenciatura");
        professor.setDiciplinaMinistrada("F�sica");
        professor.setQuantidadeDeAlunos(125);
        professor.setQuantidadeDeTurmas(5);
        professor.aumentoDeSalario();
        professor.statusProf();

        Coordenador coordenador = new Coordenador();
        coordenador.setNome("Ilda");
        coordenador.setCpf("333. 333. 333 - 33");
        coordenador.setNumeroRegistro("4253");
        coordenador.setOorgaoDeLotacao("Secret�ria da Educa��o");
        coordenador.setSalario(5000);
        coordenador.setProfessoresSuperVisionados(professor.getNome());
        coordenador.statusCoordenador();
        coordenador.aumentoDeSalario();

        FuncionariosAdministrativos funcionariosAdministrativos = new FuncionariosAdministrativos();
        //funcionariosAdministrativos.setNome("");
       // funcionariosAdministrativos.setCpf("");
        //funcionariosAdministrativos.setNumeroRegistro();
       // funcionariosAdministrativos.setSalario();
        //funcionariosAdministrativos.setFuncaoAdm();
        //funcionariosAdministrativos.setSinioridade();
        funcionariosAdministrativos.statusFuncAdm();

    }
}
