import java.io.FileWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;

public class LogProcessor {

    public static void processarLogs(Object objeto) throws Exception{

        Class<?> classe = objeto.getClass();

        String currentDir = System.getProperty("user.dir") + "\\SC-20-Annotations";

        for(Method metodo : classe.getDeclaredMethods()){

            if(metodo.isAnnotationPresent(Log.class)){

                // ativar a acessibilidade do campo privado
                metodo.setAccessible(true);

               try(FileWriter writer = new FileWriter(currentDir + "metodos_log.txt", true)){
                    writer.write("Executando o metodo " + metodo.getName() + "\n");
                    metodo.invoke(objeto);
               } catch (Exception e){
                   System.out.println("Erro: " + e.getMessage());
               }
            }
        }
    }
}
