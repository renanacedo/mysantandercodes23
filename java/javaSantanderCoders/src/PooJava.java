import Animais.Dog;
public class PooJava {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.setNome("Doguinho");
        dog1.setCor("Marrom");
        dog1.setRaca("Vira-lata");
        dog1.setAltura(30);
        dog1.setPeso(4.3);

        System.out.println(dog1.getNome());

        dog1.latir();
        System.out.println(dog1.pegar());

        System.out.println(dog1.interagir("saifora"));


    }
}
