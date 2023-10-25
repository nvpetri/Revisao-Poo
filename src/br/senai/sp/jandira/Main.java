package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Pessoas;

public class Main {
    public static void main(String[] args) {
        Pessoas pessoas = new Pessoas("João", 18);
        Pessoas pessoas1 = new Pessoas("Maria", 26);

        System.out.println("O nome é " + pessoas.getNome());
        System.out.println("O nome é " + pessoas1.getNome());

        pessoas.setNome("Nicolas");
        pessoas.setIdade(16);
        pessoas1.setIdade(19);

        System.out.println("O nome é " + pessoas.getNome());
        System.out.println("O nome é " + pessoas1.getNome());
    }
}
