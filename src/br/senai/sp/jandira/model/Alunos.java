package br.senai.sp.jandira.model;

public class Alunos extends Pessoas{

    private int matricula;

    public Alunos(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public void passarTempo() {
        System.out.println("O aluno está jogando futebol society...");
    }
}
