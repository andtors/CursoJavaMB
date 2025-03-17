import java.lang.reflect.Array;
import java.util.Arrays;

public class POO2 {

    public static void main(String[] args) {
        // 1 - Niveis de acesso
        Funcionario funcionario1 = new Funcionario("Matheus", 2000, "teste123");

        System.out.println(funcionario1.toString());

        funcionario1.nome = "Teste";
        funcionario1.salario = 1500;

        //funcionario1.senha = "teste4321";

        System.out.println(funcionario1.toString());

        funcionario1.aumentarSalario(10);

        // System.out.println(funcionario1.verificarSenha());

        if(funcionario1.autenticar("teste123")){
            System.out.println("Usuario entrou no sistema!");
        }

        // 2 - Classe imutavel
        PessoaImutavel joaquim = new PessoaImutavel("Joaquim", 23);

        System.out.println(joaquim.getNome());
        System.out.println(joaquim.getIdade());

        //joaquim.nome = "teste";

        // 3 - Arrays em classes
        String[] meusAlunos = {"Matheus", "João", "Maria"};

        Turma novaTurma = new Turma(meusAlunos);

        System.out.println(Arrays.toString(novaTurma.getAlunos()));

        String[] outrosAlunos = {"Aluno 1", "Aluno 2"};

        novaTurma.setAlunos(outrosAlunos);

        System.out.println(Arrays.toString(novaTurma.getAlunos()));
    }
}
