package aula04;

public class Main {
    public static void main(String[] args){
        Caneta c1 = new Caneta("BIC", "VERMELHO", 0.4f);
        Caneta c2 = new Caneta("X", "Y", 1.0f);
        c1.status();
        c2.status();
    }
}