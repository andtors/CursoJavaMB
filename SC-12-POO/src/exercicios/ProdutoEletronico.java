package exercicios;

import java.time.LocalDate;

public class ProdutoEletronico {

    private String nome;
    private double preco;
    private LocalDate garantia;

    public ProdutoEletronico(String nome, double preco, LocalDate garantia){
        this.nome = nome;
        this.preco = preco;
        this.garantia = garantia;
        System.out.println("Garantia do produto: " + this.nome + ", data: " + garantia);
    }

    public String aplicarDesconto(int porcentagem){
        double valorDesconto = calcularDesconto(porcentagem);
        this.preco -= valorDesconto;
        return "Porcentagem de desconto: " + porcentagem + ", valor desconto: " + valorDesconto + " total final: " + this.preco;
    }

    public double calcularDesconto(int porcentagem){
        return (this.preco * porcentagem) / 100;
    }

    // Ex5
}
