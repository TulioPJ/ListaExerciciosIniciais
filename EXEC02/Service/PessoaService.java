package listaExerciciosIniciais.EXEC02.Service;

import listaExerciciosIniciais.EXEC02.Model.Pessoa;

public class PessoaService extends Pessoa {
    public PessoaService(String nome, Integer idade, Double altura) {
        super(nome, idade, altura);
    }
    @Override
    public String toString() {
        return "Pessoa[" +
                "nome " + this.getNome()+
                ", idade " + this.getIdade()+
                ", altura " + this.getAltura()+
                ']';
    }
}
