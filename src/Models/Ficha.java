package Models;

public class Ficha implements Interfaces.Ficha {

    String 	nome = "";
    String 	classe = "";
    int    	forca = 0;
    int 	resistencia = 0;
    int 	poderdefogo = 0;
    int 	habilidade = 0;
    int		armadura = 0;
    int 	hp = 0;
    int 	mp = 0;
    int 	xp = 0;

    @Override
    public void Ficha(String nome, String classe, int forca, int resistencia, int poderdefogo, int habilidade, int armadura, int hp, int mp, int xp) {
        this.nome = nome;
        this.classe = classe;
        this.forca = forca;
        this.resistencia = resistencia;
        this.poderdefogo = poderdefogo;
        this.habilidade = habilidade;
        this.armadura = armadura;
        this.hp = resistencia*5;
        this.mp = resistencia*5;
        this.xp = 0;
    }
}
