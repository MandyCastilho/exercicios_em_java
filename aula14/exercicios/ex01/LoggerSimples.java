import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerSimples {

    private static final String ARQUIVO_LOG = "log.txt";

    public static void main(String[] args) {

        logInfo("Aplicação iniciada");

        try {
            int resultado = 10 / 0; // erro proposital
            logInfo("Resultado: " + resultado);

        } catch (Exception e) {
            logError("Erro ao executar operação: " + e.getMessage());
        }

        logWarning("Aplicação finalizada com aviso");
    }

    // INFO
    public static void logInfo(String mensagem) {
        escreverLog("INFO", mensagem);
    }

    // WARNING
    public static void logWarning(String mensagem) {
        escreverLog("WARNING", mensagem);
    }

    // ERROR
    public static void logError(String mensagem) {
        escreverLog("ERROR", mensagem);
    }

    // Método central de escrita
    private static void escreverLog(String nivel, String mensagem) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_LOG, true))) {

            String dataHora = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

            writer.write("[" + dataHora + "] [" + nivel + "] " + mensagem);
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Erro ao escrever log.");
        }
    }
}
