package listaExerciciosIniciais.EXEC03.Service;

import listaExerciciosIniciais.EXEC03.Model.Pessoa;

public class PessoaService{
    Pessoa pessoa;
    public PessoaService(String nome){
        pessoa = new Pessoa(nome);
    }

    @Override
    public String toString() {
        return "Nome " + pessoa.getNome();
    }
}
