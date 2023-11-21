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
        System.out.printf("Olá, %s, hoje é %s, %dH %n%s. %n", nome, diaSemana, horaAgora, saudacao );

        // Laços numéricos
        // Váriavel que for (enquanto)
        /*for (int i = 0; i <= 5; i+=5){
            System.out.println(i);
        }
        // Laços aninhados para uma tabuada
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.println(j + " x " + i + " = " + j * i);
            }
        } comentei tudo para nao ficar extenso no display */


        // Vetores

    }
}