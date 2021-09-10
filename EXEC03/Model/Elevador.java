package listaExerciciosIniciais.EXEC03.Model;

import listaExerciciosIniciais.EXEC01.model.Pessoa;
import listaExerciciosIniciais.EXEC03.Service.ElevadorService;

import java.util.ArrayList;

public class Elevador{
    private Integer andarAtual = 0;
    private Integer totalDeAndaresDoPredio;
    private Integer capacidadeDoElevador;
    ArrayList lista = new ArrayList<String>();

    public Integer getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(Integer andarAtual) {
        this.andarAtual = andarAtual;
    }

    public Integer getTotalDeAndaresDoPredio() {
        return totalDeAndaresDoPredio;
    }

    public void setTotalDeAndaresDoPredio(Integer totalDeAndaresDoPredio) {
        this.totalDeAndaresDoPredio = totalDeAndaresDoPredio;
    }

    public Integer getCapacidadeDoElevador() {
        return capacidadeDoElevador;
    }

    public void setCapacidadeDoElevador(Integer capacidadeDoElevador) {
        this.capacidadeDoElevador = capacidadeDoElevador;
    }
    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

}
