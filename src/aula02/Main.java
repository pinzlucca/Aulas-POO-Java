package aula02;
public class Main {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.tampar();
        c1.rabiscar();
        c1.status();
    }
}