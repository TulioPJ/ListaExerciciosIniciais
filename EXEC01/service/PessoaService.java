package listaExerciciosIniciais.EXEC01.service;

import listaExerciciosIniciais.EXEC01.model.Pessoa;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PessoaService{
    Pessoa pessoa;
    public PessoaService(String nome, String dataNascimento, double altura) {
        pessoa = new Pessoa(nome, dataNascimento, altura);
    }
    public void imprimeDados(){
        System.out.println("Esses são seus dados:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Altura :" + pessoa.getAltura());
        System.out.println("Idade : " + calcularIdade(pessoa.getDataNascimento()));
    }
    @Override
    public String toString() {
        return  "[Nome: "+ pessoa.getNome() + ", Idade: " + calcularIdade(pessoa.getDataNascimento()) + ", Altura: " + pessoa.getAltura() + "]" ;
    }
    public int calcularIdade(String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate d1 = LocalDate.parse(dataNascimento, formatter);
        LocalDate dataAtual = LocalDate.now();
        Period diferenca = Period.between(d1, dataAtual);
        return diferenca.getYears();
    }
}
