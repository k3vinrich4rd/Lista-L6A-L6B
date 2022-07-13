package L6a;

public class FuncionariosAdministrativos extends Funcionarios {
    private String funcaoAdm;
    private String senioridade;
    public FuncionariosAdministrativos(){
        super();
    }
    public String getFuncaoAdm(){
        return funcaoAdm;
    }
    public void setFuncaoAdm(String funcaoAdm){
        this.funcaoAdm = funcaoAdm;
    }
     public String getSinioridade(){
        return senioridade;
     }
     public void setSinioridade(String senioridade){
        this.senioridade = senioridade;
     }
     public void statusFuncAdm(){
         System.out.println();
         System.out.println("Informações sobre funcionário administrativo(a):");
         System.out.println("Nome : " + this.getNome() + "\nCpf: " + this.getCpf()
                 + "\nNúmero de registro: " + this.getNumeroRegistro() + "\nÓrgão de lotação: " + this.getOorgaoDeLotacao()
                 + "\nSalário: " + this.getSalario() + "\nFunção Administrativa: " +  this.getFuncaoAdm() +"\nSenioridade: " + this.getSinioridade());

         System.out.println();
     }







    @Override
    public void aumentoDeSalario() {
        this.setSalario(this.getSalario() * 0.01);

    }

}
