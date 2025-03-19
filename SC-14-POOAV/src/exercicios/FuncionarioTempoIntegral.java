package exercicios;

public class FuncionarioTempoIntegral extends Funcionario implements Beneficios{

    public FuncionarioTempoIntegral(String nome) {
        super(nome);
    }

    @Override
    public int calcularSalario(int salario){
        int beneficio = adicionarBeneficios();
        return salario + beneficio;
    }

    @Override
    public int adicionarBeneficios() {
        return 1000;
    }
}
