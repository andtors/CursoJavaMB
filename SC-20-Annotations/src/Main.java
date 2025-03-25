import java.lang.reflect.Field;

public class Main {

    // funcao para validar campos anotados
    public static void validarCampos(Object objeto) throws IllegalAccessException{

        // Pegar a classe, pegar os campos, verificar se tem annotations
        Class<?> classe = objeto.getClass();

        for(Field campo : classe.getDeclaredFields()){

            if(campo.isAnnotationPresent(NotEmpty.class)){

                //saber o valor de msg de cada campo
                NotEmpty anotacao = campo.getAnnotation(NotEmpty.class);

                // ativar a acessibilidade do campo privado
                campo.setAccessible(true);

                try {
                    Object valor = campo.get(objeto);

                    // validando campo
                    if(valor == null || valor.toString().isEmpty()){
                        System.out.println(anotacao.message());
                    }

                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }


    public static void main(String[] args) throws IllegalAccessException {

        // 1 - Annotations pre definidas
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();

        cachorro.mover();

        cachorro.testeMover();

        // 2 - Annotation customizada
        Exemplo exemplo = new Exemplo();

        // Anotações geralmente vão precisar de try catch

        // loop em cada um dos metodos
        for(var metodo : exemplo.getClass().getDeclaredMethods()){
            System.out.println(metodo);

            // verifica se a anotação está presente no metodo
            if(metodo.isAnnotationPresent(Executar.class)){

                Executar anotacao = metodo.getAnnotation(Executar.class);

                // loop baseado em qts vezes tem que executar
                for(int i = 0; i < anotacao.vezes(); i++){

                    // invocando metodo -> mostrarMensagem
                    try {
                        metodo.invoke(exemplo);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }


                }
            }
        }

        // 3 - Annotation para validar campos
        Usuario usuario = new Usuario("", "jorge@email.com");

        validarCampos(usuario);

        Usuario usuario2 = new Usuario("", "");

        validarCampos(usuario2);

        // 4 -Annotation com processador

        Servico servico = new Servico();

        try {
            LogProcessor.processarLogs(servico);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}