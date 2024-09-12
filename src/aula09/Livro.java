package aula09;

import java.util.Random;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public void detalhes(Pessoa leitor){
        System.err.println("Livro: " + titulo);
        System.err.println("Autor: " + autor);
        System.err.println("totPaginas: " + totPaginas);
        System.err.println("pagAtual: " + pagAtual);
        System.err.println("aberto: " + aberto);
        System.err.println("leitor: " + leitor);
    }

    public Livro(String titulo, String autor,int totPaginas, int pagAtual, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if (aberto) {
            System.err.println("Livro ja esta aberto!");
        } else {
            aberto = true;
            System.err.println("Livro aberto");
        }
    }

    @Override
    public void fechar() {
        if (aberto) {
            aberto = false;
            System.err.println("Livro fechado");
        } else {
            System.err.println("Livro ja esta fechado!");
        }
    }

    @Override
    public void folhear() {
        Random aleatorio = new Random();
        int pagRandom = aleatorio.nextInt(totPaginas);
        this.pagAtual = pagRandom;
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

    
    
}
