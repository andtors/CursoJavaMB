package exercicios;

public class FuncionarioMeioPeriodo extends Funcionario implements Beneficios{

    public FuncionarioMeioPeriodo(String nome) {
        super(nome);
    }

    @Override
    public int adicionarBeneficios() {
        return 500;
    }

    @Override
    int calcularSalario(int salario) {
        return salario + adicionarBeneficios();
    }
}
