import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        float nota = 90;
        String graduacao;

        if (nota >= 70 && nota < 90) {
            graduacao = "B";
        } else if (nota >= 90) {
            graduacao = "A";
        } else {
            graduacao = "C";
        }
        switch (graduacao) {
            case "A":
                System.out.println("Aprovado com maestria!");
                break;
            case "B":
                System.out.println("Aprovado!");
                break;
            case "C":
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Inválido");
        }
        // Aula 6 manipulação de strings e data
        // Puxando dados
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        LocalDateTime agora = LocalDateTime.now();
        // Definindo variaveis
        String nome = "Renan";
        int horaAgora = agora.getHour();
        String diaSemana = hoje.getDayOfWeek() .getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        // Aplicação
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        } else {
            saudacao = "Boa madrugada";
        }

        System.out.printf("Olá, %s, hoje é %s, %dH %n%s.", nome, diaSemana, horaAgora, saudacao );

    }
}