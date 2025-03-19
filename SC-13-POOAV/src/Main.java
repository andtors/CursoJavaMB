public class Main {
    public static void main(String[] args) {

        // 1 - Object composition
        Motor motor1 = new Motor("V8", 450);

        Carro carro1 = new Carro("Ford", "Mustang", motor1);

        carro1.exibirInfo();

        carro1.motor.exibirInfo();

        // 2 - Herança
        Cachorro turca = new Cachorro("Turca");

        turca.emitirSom();
        turca.latir();

        Animal leao = new Animal("Atlas");

        leao.emitirSom();
        // subclasse tem acesso a tudo da superclasse
        // superclasse não tem acesso a classe filha

        // 3 - Object
        Pessoa matheus = new Pessoa("Matheus", 33);
        Pessoa pedro = new Pessoa("Pedro", 20);

        System.out.println(matheus.toString());

        System.out.println(matheus.equals(pedro));

        System.out.println(matheus.hashCode());

        // 4 - Override
        Quadrado q1 = new Quadrado(4);
        Circulo c1 = new Circulo(3.2);

        System.out.println(q1.calcularArea());
        System.out.println(c1.calcularArea());

        // 5 - Super
        Funcionario funcionario = new Funcionario("Carlos", 3000);

        Gerente gerente = new Gerente("Marcos", 5000, 1000);

        funcionario.exibirDetalhes();

        gerente.exibirDetalhes();

        System.out.println(funcionario.calcularBonus());

        System.out.println(gerente.calcularBonus());

        // 6 - Abstract
        InstrumentoMusical violao = new Violao("violão");

        InstrumentoMusical bateria = new Bateria("bateria");

        violao.exibirDetalhes();
        bateria.exibirDetalhes();

        violao.tocar();
        bateria.tocar();

        // 7 - Interfaces
        Pagamento cartao = new CartaoCredito();
        Pagamento transf = new TransferenciaBancaria();

        cartao.processarPagamento(100);
        cartao.exibirRecibo(100);

        transf.processarPagamento(50);
        transf.exibirRecibo(50);

        // 8 - Multiplas interfaces
        Documento doc = new Documento("Arquivo de texto");

        doc.salvar();

        doc.imprimir();

        doc.instrucaoParaSalvar();

        // 9 - Default methods em interfaces
        CalculadoraAvancada calc = new CalculadoraAvancada();

        System.out.println(calc.somar(2, 4));
        System.out.println(calc.multiplicar(2, 5));

        // 10 - Polimorfismo
        // classes abstratas ou interfaces -> sobrescrevendo os metodos destas superclasses
        InstrumentoMusical violino = new Violino("violino");

        violino.exibirDetalhes();

        violino.tocar();

        // 11 - Metodos e classes final
    }
}