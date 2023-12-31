package br.senai.sp.jandira.model;

public class Pessoas extends Conta{

    private String nome;
    private int idade;

    public void passarTempo(){
        System.out.println("A pessoa está passando o tempo...");
    }

    public Pessoas(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirInformacao(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(getSaldo());
    }
}

