package aula07;

public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6]; 
        
        l[0] = new Lutador("Lucca", "BR", 20, 1.85f, 60.0f, 5, 2, 1);
        l[1] = new Lutador("Joao", "EUA", 25, 1.15f, 62.0f, 51, 21, 11);
        
        Luta ufc = new Luta();
        ufc.marcarLuta(l[0], l[1]);
        ufc.lutar();
        l[0].status();
    }
}
