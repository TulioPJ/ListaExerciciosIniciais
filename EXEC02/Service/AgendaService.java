package listaExerciciosIniciais.EXEC02.Service;

import listaExerciciosIniciais.EXEC02.Model.Agenda;
import listaExerciciosIniciais.EXEC02.Model.Pessoa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgendaService extends Agenda {
    private List<Pessoa> listaDePessoas = new ArrayList<>();
    private Map<Integer , Pessoa> numeroParaPessoa = new HashMap<>();
    private Map<String, Integer> nomeParaPessoa = new HashMap<>();

    public List<Pessoa> getAgenda() { // TUDO OK
        return getListaDePessoas();
    }

    public void armazenaPessoa(Pessoa pessoa){
        if(getListaDePessoas().size() < 10){
            this.getListaDePessoas().add(pessoa);
        } else{
            System.out.println("Não pode adicionar, Agenda está cheia...");
        }
        this.getNumeroParaPessoa().put(getListaDePessoas().indexOf(pessoa), pessoa);
        this.getNomeParaPessoa().put(pessoa.getNome(), getListaDePessoas().indexOf(pessoa));
    }
    public int buscaPessoa(String nome){
        return getNomeParaPessoa().get(nome);
    }

    public void removePessoa(String nome){
        if(getListaDePessoas().size() == 0){
            System.out.println("Não existe nenhuma pessoa na lista...");
        }
        int pessoaASerRemovida = buscaPessoa(nome);
        getListaDePessoas().remove(pessoaASerRemovida);
    }

    public Pessoa imprimePessoa(int pessoa){ // TUDO OK
        return getNumeroParaPessoa().get(pessoa);
    }

}
