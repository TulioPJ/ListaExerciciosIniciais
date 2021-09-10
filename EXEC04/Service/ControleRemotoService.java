package listaExerciciosIniciais.EXEC04.Service;

import listaExerciciosIniciais.EXEC04.Model.ControleRemoto;
import listaExerciciosIniciais.EXEC04.Model.IControle;
import listaExerciciosIniciais.EXEC04.Model.Televisao;

public class ControleRemotoService implements IControle {
    ControleRemoto controleRemoto;
    ControleRemotoService(Televisao televisao){
        controleRemoto = new ControleRemoto(televisao);
    }
    @Override
    public void aumentarVolume(){
        controleRemoto.getTelevisao().setVolume(controleRemoto.getTelevisao().getVolume() + 1);
    }

    @Override
    public void diminuiVolume() {
        controleRemoto.getTelevisao().setVolume(controleRemoto.getTelevisao().getVolume() - 1);
    }

    @Override
    public void aumentarCanal() {
        controleRemoto.getTelevisao().setCanal(controleRemoto.getTelevisao().getCanal()+ 1);
    }

    @Override
    public void diminuirCanal() {
        controleRemoto.getTelevisao().setCanal(controleRemoto.getTelevisao().getCanal()- 1);
    }

    @Override
    public void consultarVolumeECanal(){
        System.out.println("canal " + controleRemoto.getTelevisao().getCanal() +
                ", volume: " + controleRemoto.getTelevisao().getVolume());
    }

    @Override
    public void mudarCanal(Integer canal) {
        controleRemoto.getTelevisao().setCanal(canal);
    }

}
