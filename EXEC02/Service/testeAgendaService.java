package listaExerciciosIniciais.EXEC02.Service;

import listaExerciciosIniciais.EXEC02.Model.Pessoa;

public class testeAgendaService {
    public static void main(String[] args) {
        AgendaService agendaService = new AgendaService();
        PessoaService n = new PessoaService("Tulio", 12, 1.72);
        agendaService.armazenaPessoa(n);
        System.out.println(agendaService.getAgenda());
        agendaService.removePessoa("Tulio");
        System.out.println(agendaService.getAgenda());
    }
}
