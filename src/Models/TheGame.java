package Models;

import Main.Principal;

import java.util.Scanner;

public class TheGame {

    Mestre mestre;

    public TheGame(Mestre mestre) {
        this.mestre = mestre;
    }

    public void start() {
        gerenciar();
    }

    public void gerenciar() {

        Scanner scanner = new Scanner(System.in);
        String op;

        do {
            System.out.println("1 - Jogar Dados");
            System.out.println("2 - Recriar Mesa");
            System.out.println("3 - Renomear Mesa");
            System.out.println("4 - Adicionar novo Jogador");
            System.out.println("5 - Nomear jogadores");
            System.out.println("6 - Sair");
            op = scanner.nextLine();
            switch (op) {
                case "1": startDado();
                    break;

                case "2": recriarMesa();
                    break;

                case "3": renomearMesa();
                    break;

                case "4": adicionarNovoJogador();
                    break;

                case "5": nomearJogadores();
                    break;

                default: System.out.println("Adios");
            }
        } while (!op.equals("6"));

    }

    private void nomearJogadores() {
        mestre.getMesa().getNomeJogadores();
    }

    private void adicionarNovoJogador() {
        Jogador personagem = new Jogador();
        personagem.CriarPersonagem();

        mestre.getMesa().addJogadores(personagem);
    }

    private void renomearMesa() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite o nome da mesa: ");
        String nome = scanner1.nextLine();

        mestre.getMesa().setNomeMesa(nome);
    }

    private void recriarMesa() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite o nome da mesa: ");
        String nome = scanner1.nextLine();

        mestre.setMesa(new Mesa(nome, Principal.idGen++, mestre.getMesa().getJogadores()));
    }

    public void startDado() {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String next;
        int atual;

        System.out.println("Digite 1 para rodar o dado, e 0 para finalizar o jogo");
        next = scanner.nextLine();

        while(!next.equals("0")) {

            System.out.println("Digite 0 para o Mestre, ou o número do jogador a lançar o dado: ");
            atual = scanner2.nextInt();

            if(atual == 0) {
                System.out.println(mestre.jogaDado());
            } else {
                System.out.println(mestre.getMesa().getJogadores().getJogador(atual).jogaDado());
            }

            System.out.println("Digite 1 para rodar o dado, e 0 para finalizar o jogo");
            next = scanner.nextLine();
        }
    }
}
