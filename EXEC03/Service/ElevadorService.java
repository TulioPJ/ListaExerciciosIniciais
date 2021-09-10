package listaExerciciosIniciais.EXEC03.Service;

import listaExerciciosIniciais.EXEC03.Model.Elevador;

public class ElevadorService{
    Elevador elevador;

    public ElevadorService() {
        elevador = new Elevador();
    }

    public void inicializa(Integer capacidadeDoElevador, Integer totalDeAndaresDoPredio){
        elevador.setCapacidadeDoElevador(capacidadeDoElevador);
        elevador.setTotalDeAndaresDoPredio(totalDeAndaresDoPredio);

    }
    public void entrarNoElevador(PessoaService pessoa){
        if(elevador.getLista().size() < elevador.getCapacidadeDoElevador()){
            elevador.getLista().add(pessoa.pessoa.getNome());
        } else{
            System.out.println( " Ja existem "+ elevador.getLista().size() +  " pessoas no elevador! Elevador cheio");
        }
    }
    public void removePessoa(String nome){
        if(elevador.getLista().get(0).equals(null)){
            System.out.println("Nao existem ninguem para remover");
        } else {
            elevador.getLista().remove(nome);
        }
    }
    public void sobeAndar(){
        if(elevador.getTotalDeAndaresDoPredio().equals(elevador.getAndarAtual())){
            System.out.println("Nao pode subir, pois ja está no ultimo andar");
        } else{
            System.out.println("Subiu um andar");
            elevador.setAndarAtual(elevador.getAndarAtual() + 1);
        }
    }
    public void desceAndar(){
        if(elevador.getAndarAtual() !=  0){
            System.out.println("Desceu um andar");
            elevador.setAndarAtual(elevador.getAndarAtual() - 1);
        } else{
            System.out.println("Não pode descer pois está no terreo");
        }
    }
    public int quantidadeDePessoasNoElevador(){
        return  elevador.getLista().size();
    }

}
