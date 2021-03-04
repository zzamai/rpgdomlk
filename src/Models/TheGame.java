package Models;

import java.util.Scanner;

public class TheGame {

    Mestre mestre;

    public TheGame(Mestre mestre) {
        this.mestre = mestre;
    }

    public void start() {

        Scanner scanner = new Scanner(System.in);
        String next;

        System.out.println("Digite 1 para rodar o dado, e 0 para finalizar o jogo");
        next = scanner.nextLine();

        while(!next.equals("0")) {



            next = scanner.nextLine();
        }

    }

}
