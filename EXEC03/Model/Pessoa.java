package listaExerciciosIniciais.EXEC03.Model;

import listaExerciciosIniciais.EXEC03.Service.PessoaService;

public class Pessoa{
    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
