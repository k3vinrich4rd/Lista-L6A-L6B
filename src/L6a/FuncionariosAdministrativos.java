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
         System.out.println("Informa��es sobre funcion�rio administrativo(a):");
         System.out.println("Nome : " + this.getNome() + "\nCpf: " + this.getCpf()
                 + "\nN�mero de registro: " + this.getNumeroRegistro() + "\n�rg�o de lota��o: " + this.getOorgaoDeLotacao()
                 + "\nSal�rio: " + this.getSalario() + "\nFun��o Administrativa: " +  this.getFuncaoAdm() +"\nSenioridade: " + this.getSinioridade());

         System.out.println();
     }







    @Override
    public void aumentoDeSalario() {
        this.setSalario(this.getSalario() * 0.01);

    }

}
