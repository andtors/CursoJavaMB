public class POO {
    public static void main(String[] args) {

        // 2 - Istanciando objetos
       Carro fusca = new Carro();
        fusca.marca = "VW";
        fusca.modelo = "Fusca";
        fusca.ano = 1964;
        // fusca.modelo = "Ferrari";

        // 3 - Metodos

        fusca.acelerar();
        fusca.exibirInfo();
        fusca.ligarMotor();

        fusca.aumentarVelocidade(10);
        fusca.aumentarVelocidade(20);
        fusca.aumentarVelocidade(30);

        Carro carro2 = new Carro();
        carro2.marca = "Fiat";
        carro2.modelo = "Palio";
        carro2.ano = 2012;

        carro2.acelerar();
        carro2.exibirInfo();
        carro2.aumentarVelocidade(100);

        // 4 - Criando propriedades

        Pessoa joao = new Pessoa();

        // Protegido - joao.nome = "Joao";
        joao.setNome("João");

        System.out.println("O nome do João é: " + joao.getNome());

        joao.setIdade(20);

        System.out.println("A idade do João é: " + joao.getIdade());

        // 5 - Setters
        ContaBancaria contaDaAna = new ContaBancaria();

        contaDaAna.setTitular("Ana");

        contaDaAna.setSaldo(1000);

        System.out.println(contaDaAna.toString());

        contaDaAna.getTitular();

        System.out.println(contaDaAna.getSaldo());

        // 6 - Logica em get e set
        Produto camisa = new Produto();

        camisa.setNome("Camisa regata");

        System.out.println(camisa.getNome());

        camisa.setPreco(25.9999999999);

        System.out.println(camisa.getPreco());

        // 7 - Metodo dentro de metodo
        System.out.println(camisa.getProdutoInfo());

        camisa.aplicarDesconto(10);

        // 8 - Construtores

        Livro meuLivro = new Livro("Harry Potter", "J K Rowling", 31.00);

        meuLivro.exibirInfo();
    }
}