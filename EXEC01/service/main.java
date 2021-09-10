package listaExerciciosIniciais.EXEC01.service;

public class main {
    public static void main(String[] args) {
        PessoaService pessoa = new PessoaService("Tulio", "01/01/2003", 1.73);
        pessoa.imprimeDados();
        System.out.println(pessoa.calcularIdade("01/01/2003"));
    }


}
