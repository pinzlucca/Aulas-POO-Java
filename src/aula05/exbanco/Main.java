package aula05.exbanco;

public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Joao");
        p1.abrirConta("CC");
        p1.depositar(50);

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("JULIA");
        p2.abrirConta("CP");
        p2.sacar(100);
        p2.pagarMensal();
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
