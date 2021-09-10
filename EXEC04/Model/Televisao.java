package listaExerciciosIniciais.EXEC04.Model;

public class Televisao {
    private Integer volume = 0;
    private Integer canal =  0;

    public Integer getVolume() {
        return volume;
    }
    public Integer getCanal() {
        return canal;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}

