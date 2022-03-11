package br.com.meli;

public class Pessoa {

    private String nome;
    private int idade;
    private String id;
    private double peso;
    private double altura;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularImc() {
        double imc =  peso /  Math.pow(altura, 2);
        int resultado = -1;

        if (imc >= 20 && imc <= 25)
            resultado = 0;

        if (imc > 25)
            resultado = 1;

        return resultado;
    }

    public boolean ehMaiorIdade() {
        return idade >= 18;
    }
}
