package listaExerciciosIniciais.EXEC01.model;

/*
@author Tulio Jeunon
*/

public class Pessoa {

    private String nome;
    private String dataNascimento;
    private double altura;

    public Pessoa(String nome, String dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNascimento() {
        return this.dataNascimento;
    }
    public void setDataNascimento( String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public double getAltura() {
        return this.altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}