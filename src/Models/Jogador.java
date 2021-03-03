package Models;

import java.util.Scanner;

public class Jogador {
	
	public Boolean BuscarMesa() {
		
		Scanner inputJ = new Scanner(System.in);
		System.out.println("Cacetao massivo de carne escura");
		
		return null;
	}
	
	public void CriarPersonagem() {
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
	

}
