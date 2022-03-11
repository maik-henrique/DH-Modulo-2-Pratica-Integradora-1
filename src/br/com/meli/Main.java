package br.com.meli;

public class Main {

    public static void descrevePessoa(Pessoa pessoa) {
        int imc = pessoa.calcularImc();
        boolean eMaiorIdade = pessoa.ehMaiorIdade();

        String resultadoImc = getDescricaoImc(imc);

        System.out.printf("Resultado IMC: %s; É maior de idade: %s; Dados: %s", resultadoImc, eMaiorIdade, pessoa.toString());
    }

    private static String getDescricaoImc(int imc) {
        String resultadoImc = "Abaixo do peso";

        if (imc == 0)
            resultadoImc = "Peso saudável";

        if (imc == 1)
            resultadoImc = "Sobrepeso";
        return resultadoImc;
    }

    public static void main(String[] args) {
        Pessoa pessoaAnonima = new Pessoa();
        Pessoa joaoCleber = new Pessoa("João cléber", 41, "1231");
        Pessoa abideu = new Pessoa("Abideu Marach", 27, "3213", 60.42f, 1.65f);

        descrevePessoa(abideu);
    }
}
