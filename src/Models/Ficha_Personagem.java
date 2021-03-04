package Models;

public class Ficha_Personagem extends Ficha {

	private String 	nome;
	private String 	classe;
	private int    	forca;
	private int 	resistencia;
	private int 	poderdefogo;
	private int 	habilidade;
	private int		armadura;
	private int 	Hp;
	private int 	Mp;
	private int 	Xp;

	public Ficha_Personagem() {

	}

	public Ficha_Personagem(String nome, String classe, int forca, int resistencia, int poderdefogo, int habilidade,
			int armadura) {
		super();
		this.nome = nome;
		this.classe = classe;
		this.forca = forca;
		this.resistencia = resistencia;
		this.poderdefogo = poderdefogo;
		this.habilidade = habilidade;
		this.armadura = armadura;
		this.Hp = resistencia  * 5;
		this.Mp = resistencia * 5;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public int getPoderdefogo() {
		return poderdefogo;
	}

	public void setPoderdefogo(int poderdefogo) {
		this.poderdefogo = poderdefogo;
	}

	public int getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(int habilidade) {
		this.habilidade = habilidade;
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
	
	public int getXp() {
		return Xp;
	}
	
	public int getHp() {
		return Hp;
	}
	
	public int getMp() {
		return Mp;
	}
	
}
