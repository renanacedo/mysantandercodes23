package Animais;

public class Dog {

    //Caracteristicas (era publico)
    private String nome;
    private String cor;
    private String raca;
    private int altura;
    private double peso;
    private String humor;

    // Construtores


    //Gets e Sets
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHumor() {
        return humor;
    }

    //Métodos
    public void comer() {
    }

    public void latir() {
        System.out.println("HUF HUF");
    }

    public String pegar() {
        return "bolinha";
    }

    public String interagir(String acao){
        switch (acao){
            case "carinho" : this.humor = "feliz";
            break;
            case "saifora" : this.humor = "bravo";
            break;
            case "abraça" : this.humor = "maravilhado";
            break;
            default: this.humor = "neutro";
            break;
        }
        return this.humor;
    }

//    public String interagir(String acao) {
//        if (acao.equals("carinho")){ //compara o parametro "acao" com um parametro pré definido
//            this.humor = "feliz"; //retorna outro parametro á caracterista "humor"
//        } else if (acao.equals("saifora")){
//            this.humor = "bravo";
//        } else {
//            this.humor = "neutro";
//        }
//        return humor;
//    }




}


