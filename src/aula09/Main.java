package aula09;

public class Main {
        public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2]; 
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Lucca", 11, "M");
        p[1] = new Pessoa("JOAO", 21, "M");
  
        l[0] = new Livro("SHOW", "CARLOS", 500, 10, p[0]);
        l[1] = new Livro("Triangulo", "Lucas", 60, 55, p[1]); 

        l[0].abrir();
        l[0].folhear();
        l[0].fechar();
        System.out.println("__________________________________________");
        l[0].detalhes(p[0]);
        System.out.println("__________________________________________");

        l[1].abrir();
        l[1].folhear();
        l[1].fechar();
        System.out.println("__________________________________________");
        l[1].detalhes(p[1]);
        System.out.println("__________________________________________");  
    }
}
