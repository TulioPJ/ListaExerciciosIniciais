package listaExerciciosIniciais.EXEC04.Model;

public interface IControle {
    abstract void aumentarVolume();
    abstract void diminuiVolume();
    abstract void aumentarCanal();
    abstract void diminuirCanal();
    abstract void consultarVolumeECanal();
    abstract void mudarCanal(Integer canal);
}
