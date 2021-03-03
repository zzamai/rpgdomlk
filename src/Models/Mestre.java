package Models;

import java.util.Scanner;

public class Mestre  {	

	public void CriarNPC() {
		Scanner input2 = new Scanner(System.in);
		System.out.println("Digite O Nome, A Classe e os Seguintes Atributos em Sequencia Força,Resistencia,Poder de Fogo,Habilidade e Armadura");	
		Ficha_Personagem f1 = new Ficha_Personagem(input2.nextLine(),input2.nextLine(),input2.nextInt(),input2.nextInt(),input2.nextInt(),input2.nextInt(),input2.nextInt());
		System.out.println("Nome:"+f1.getNome());
		System.out.println("Classe:"+f1.getClasse());
		System.out.println("Força:"+f1.getForca());
		System.out.println("Resistencia:"+f1.getResistencia());
		System.out.println("Poder de Fogo:"+f1.getPoderdefogo());
		System.out.println("Habilidade:"+f1.getHabilidade());
		System.out.println("Armadura:"+f1.getArmadura());
		System.out.println("Pontos de Vida:"+f1.getHp());
		System.out.println("Pontos de Magia:"+f1.getMp());
	}
		
	public void CriaMesa() {
		Scanner input = new Scanner(System.in);
		System.out.println("Crie o Nome da Mesa  o Id da sala e o Numero de Jogadores");
		Mesa m1 = new Mesa (input.nextLine(),input.nextInt(),input.nextInt());
		System.out.println(""+m1.getNomemesa());
		System.out.println(""+m1.getTamanho());
		System.out.println(""+m1.getIdmesa());
	}
}
