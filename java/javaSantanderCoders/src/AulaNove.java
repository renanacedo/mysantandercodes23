public class AulaNove {
    public static void  main(String[] args) {
        String nomeRecebido = "Renan";
        saudacao(nomeRecebido);

        int resultado = soma(2,3);
        System.out.println(resultado);
    }

    //aprendendo como trabalhar com funções
    //ela pode ter parametros ou não (o que fica entre parenteses)
    public static int soma(int a, int b) {
        return a + b;
    }
    public static void saudacao(String nomeParametro){
        System.out.println("Hello, " + nomeParametro);
    }
}
