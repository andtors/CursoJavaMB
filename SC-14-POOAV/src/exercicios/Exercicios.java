package exercicios;

public class Exercicios {

    public static void main(String[] args) {

        // Ex1
        Endereco endereco = new Endereco("Alfredo Pujol", 123, "São Paulo");
        Pessoa pessoa = new Pessoa("André", 24, endereco);

        pessoa.exibirInformacoes();

        // Ex2
        Carro carro = new Carro();
        Moto moto = new Moto();
        Principal principal = new Principal();

        carro.acelerar();
        moto.acelerar();
        principal.acelerar();

        // Ex3
        Cachorro cachorro = new Cachorro("Tommy", "Latido", "Salsicha");
        cachorro.exibirDetalhes();

        // Ex4
        Funcionario funcMp = new FuncionarioMeioPeriodo("Fulano MP");
        Funcionario funcTi = new FuncionarioTempoIntegral("Ciclano TI");

        System.out.println("O funcionario " + funcMp.getNome() + " teve um beneficio total somado ao salario de R$" + funcMp.calcularSalario(2000));

        System.out.println("O funcionario " + funcTi.getNome() + " teve um beneficio total somado ao salario de R$" + funcTi.calcularSalario(5000));

        // Ex5
        Pilotavel meuHidroAviao = new Hidroavio();
        Barco meuBarco = new Barco();
        Pilotavel meuAviao = new Aviao();

        meuAviao.pilotar();
        meuHidroAviao.pilotar();
        meuBarco.navegar();

        operarVeiculo(meuAviao);
        //operarVeiculo(meuHidroAviao);
        operarVeiculo(meuBarco);
    }

    public static void operarVeiculo(Object veiculo){
        if(veiculo instanceof  Pilotavel){
            System.out.println("Este veiculo é pilotavel!");
        }

        if(veiculo instanceof  Navegavel){
            System.out.println("Este veiculo é navegavel!");
        }
    }
}
