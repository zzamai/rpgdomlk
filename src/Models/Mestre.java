package Models;

import java.util.Scanner;

public class Mestre  {

	private Mesa mesa;
	private String nome;
	private ArrayNPC npcs;
	private final Dado dado;

	public Mestre () {
		dado = new Dado();
	}

	public Mestre(String nome) {
		super();
		this.nome = nome;
		dado = new Dado();
		npcs = new ArrayNPC();
		System.out.println("Mestre criado.");
	}

	public int jogaDado() {
		return dado.rodaDado();
	}

	public void gerenciarMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public void CriarNPC() {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Digite O Nome, A Classe e os Seguintes Atributos em Sequencia Força,Resistencia,Poder de Fogo,Habilidade e Armadura");	
		Ficha_NPC f1 = new Ficha_NPC(scanner1.nextLine(),scanner1.nextLine(),scanner1.nextInt(),scanner1.nextInt(),scanner1.nextInt(),scanner1.nextInt(),scanner1.nextInt());
		System.out.println("Nome:"+f1.getNome());
		System.out.println("Classe:"+f1.getClasse());
		System.out.println("Força:"+f1.getForca());
		System.out.println("Resistencia:"+f1.getResistencia());
		System.out.println("Poder de Fogo:"+f1.getPoderdefogo());
		System.out.println("Habilidade:"+f1.getHabilidade());
		System.out.println("Armadura:"+f1.getArmadura());
		System.out.println("Pontos de Vida:"+f1.getHp());
		System.out.println("Pontos de Magia:"+f1.getMp());
		npcs.addNPC(f1);
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

}
