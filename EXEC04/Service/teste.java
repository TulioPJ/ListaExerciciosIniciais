package listaExerciciosIniciais.EXEC04.Service;

import listaExerciciosIniciais.EXEC04.Model.Televisao;

public class teste {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        ControleRemotoService controleRemotoService = new ControleRemotoService(tv);
        controleRemotoService.aumentarVolume();
        controleRemotoService.aumentarCanal();
        controleRemotoService.diminuiVolume();
        controleRemotoService.diminuirCanal();
        controleRemotoService.consultarVolumeECanal();
        controleRemotoService.mudarCanal(10);
        controleRemotoService.consultarVolumeECanal();
    }
}
