package listaExerciciosIniciais.EXEC05.Service;

import listaExerciciosIniciais.EXEC05.Model.Caminhao;
import listaExerciciosIniciais.EXEC05.Model.Controle;
import listaExerciciosIniciais.EXEC05.Model.SelecaoDeCaminhao;

import java.util.Locale;

public class SelecaoDeCaminhaoService {
    private SelecaoDeCaminhao selecaoDeCaminhao;
    public SelecaoDeCaminhaoService(){
        selecaoDeCaminhao = new SelecaoDeCaminhao();
    }
    public void selecionarCaminhaoMaisApto(){

        while (true) {
            Caminhao caminhao = new Caminhao();
            System.out.println("Digite o tipo do caminhão (ALFA OU BETA) e Quantidade de pluviometros! Digite FIM para parar ----");
            caminhao.setTipoCaminhao(selecaoDeCaminhao.leString().toUpperCase(Locale.ROOT));
            if(caminhao.getTipoCaminhao().equals("FIM")){
                break;
            }
            caminhao.setCapacidadeTotal(selecaoDeCaminhao.leInteiro());
            selecaoDeCaminhao.getCaminhoes().add(caminhao);
            selecaoDeCaminhao.setCaminhoes(selecaoDeCaminhao.getCaminhoes());
            selecaoDeCaminhao.getCaminhoesHashMap().put(caminhao.getTipoCaminhao(), caminhao.getCapacidadeTotal());
        }
        System.out.println( " O caminhão mais apto é, [" + selecaoDeCaminhao.getCaminhoesHashMap().entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get()
                + "], agora digite os tipos dos pluviometros que esse caminhão irá transportar");
        String tipoPluviometro =  selecaoDeCaminhao.leString();
        selecaoDeCaminhao.getTipoDePluviometros().add(tipoPluviometro);
        System.out.println("Lista de tipo de pluviometros que o caminhão irá transportar = " + selecaoDeCaminhao.getTipoDePluviometros());
    }
}
