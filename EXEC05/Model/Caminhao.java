package listaExerciciosIniciais.EXEC05.Model;

import java.util.Comparator;

public class Caminhao {
    String tipoCaminhao;
    int capacidadeTotal;

    public void setCapacidadeTotal(Integer capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public String getTipoCaminhao() {
        return tipoCaminhao;
    }

    public void setTipoCaminhao(String tipoCaminhao) {
        this.tipoCaminhao = tipoCaminhao;
    }

    @Override
    public String toString() {
        return "Caminhao {" +
                "tipoCaminhao='" + tipoCaminhao +
                ", capacidadeTotal=" + capacidadeTotal +
                '}';
    }
}
