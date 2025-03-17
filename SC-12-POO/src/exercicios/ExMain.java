package exercicios;

import java.time.LocalDate;

public class ExMain {

    public static void main(String[] args) {

        // Ex1
        Celular celular1 = new Celular("Motorola", "Moto G1");

        Celular celular2 = new Celular("Apple", "Iphone 16");

        celular1.ligar();
        celular1.ligacao();
        celular1.ligacao();
        celular1.ligacao();

        celular2.desligar();
        celular2.ligacao();

        // Ex2
        Aluno aluno1 = new Aluno("", 123456, 43);

        Aluno aluno2 = new Aluno("André", 654321, 99);

        Aluno aluno3 = new Aluno("Fulano", 123456, 101);

        System.out.println(aluno2.toString());

        // Ex3

        ContaCorrente conta1 = new ContaCorrente("André", 10000.00, 200.00);

        ContaCorrente conta2 = new ContaCorrente("Fulano", 500.00, 400.00);

        System.out.println(conta1.depositar(200));
        System.out.println(conta1.saque(100));
        System.out.println(conta1.exibirSaldo());

        System.out.println(conta2.saque(500));

        // Ex4

        LocalDate date = LocalDate.now().plusYears(2);
        ProdutoEletronico produto1 = new ProdutoEletronico("Headset", 400.00, date);

        System.out.println(produto1.aplicarDesconto(20));

        //Ex5

        LivroBiblioteca livro1 = new LivroBiblioteca("Senhor dos Anéis - A sociedade do anel", "JRR. Tolkien");
        LivroBiblioteca livro2 = new LivroBiblioteca("Harry Potter e o Enigma do principe", "JK Rowling");

        livro1.pegarEmprestado();
        livro1.pegarEmprestado();

        livro2.devolverLivro();

    }
}
