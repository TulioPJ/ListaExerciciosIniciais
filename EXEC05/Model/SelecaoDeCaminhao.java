package listaExerciciosIniciais.EXEC05.Model;

import java.util.*;

public class SelecaoDeCaminhao extends Controle{

    List<Caminhao> caminhoes = new ArrayList<>();
    Map<String, Integer> caminhoesHashMap = new HashMap<>();
    List<String> tipoDePluviometros = new ArrayList<>();

    public List<Caminhao> getCaminhoes() {
        return caminhoes;
    }

    public void setCaminhoes(List<Caminhao> caminhoes) {
        this.caminhoes = caminhoes;
    }

    public Map<String, Integer> getCaminhoesHashMap() {
        return caminhoesHashMap;
    }

    public void setCaminhoesHashMap(Map<String, Integer> caminhoesHashMap) {
        this.caminhoesHashMap = caminhoesHashMap;
    }

    public List<String> getTipoDePluviometros() {
        return tipoDePluviometros;
    }

    public void setTipoDePluviometros(List<String> tipoDePluviometros) {
        this.tipoDePluviometros = tipoDePluviometros;
    }

}
