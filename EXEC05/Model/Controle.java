package listaExerciciosIniciais.EXEC05.Model;

import java.util.Scanner;

public class Controle {
    public String leString(){
        Scanner scanString = new Scanner(System.in);
        String recebeString = scanString.nextLine();
        return recebeString;
    }
    public int leInteiro(){
        Scanner scanString = new Scanner(System.in);
        int recebeInteiro = scanString.nextInt();
        return recebeInteiro;
    }
}
