package avancando;

import java.lang.reflect.*;

public class POO2 {

    public static void main(String[] args) {

        // 1 - Classes com final
        ContaBancaria conta = new ContaBancaria(500);

        System.out.println("Saldo: R$" + conta.getSaldo());

        // 2 - Reflection API
        try {
            Class<?> classePessoa = Class.forName("avancando.Pessoa.java");

            Constructor<?> construtor = classePessoa.getConstructor(String.class, int.class);

            Object pessoa = construtor.newInstance("João", 25);

            Method metodoDizerOla = classePessoa.getMethod("dizeOla");

            metodoDizerOla.invoke(pessoa);

            Field campoNome = classePessoa.getDeclaredField("nome");

            campoNome.setAccessible(true);

            campoNome.set(pessoa, "Maria");

            metodoDizerOla.invoke(pessoa);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
