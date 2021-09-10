package listaExerciciosIniciais.EXEC02.Model;

/*
@author Tulio Jeunon
*/

import java.util.*;

public class Agenda{
    private List<Pessoa> listaDePessoas = new ArrayList<>();
    private Map<Integer , Pessoa> numeroParaPessoa = new HashMap<>();
    private Map<String, Integer> nomeParaPessoa = new HashMap<>();

    public List<Pessoa> getListaDePessoas() {
        return listaDePessoas;
    }

    public void setListaDePessoas(List<Pessoa> listaDePessoas) {
        this.listaDePessoas = listaDePessoas;
    }

    public Map<Integer, Pessoa> getNumeroParaPessoa() {
        return numeroParaPessoa;
    }

    public void setNumeroParaPessoa(Map<Integer, Pessoa> numeroParaPessoa) {
        this.numeroParaPessoa = numeroParaPessoa;
    }

    public Map<String, Integer> getNomeParaPessoa() {
        return nomeParaPessoa;
    }

    public void setNomeParaPessoa(Map<String, Integer> nomeParaPessoa) {
        this.nomeParaPessoa = nomeParaPessoa;
    }
}
