package listaExerciciosIniciais.EXEC03.Service;


public class teste {
    public static void main(String[] args) {
        ElevadorService elevador = new ElevadorService();
        elevador.inicializa(5,2);
        elevador.sobeAndar();
        elevador.sobeAndar();
        elevador.sobeAndar();
        elevador.desceAndar();
        elevador.desceAndar();
        System.out.println(elevador.elevador.getTotalDeAndaresDoPredio());
        System.out.println(elevador.elevador.getAndarAtual());
    }
}
