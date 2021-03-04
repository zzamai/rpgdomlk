package Interfaces;

public interface Ficha {
    String 	nome = "";
    String 	classe = "";
    int    	forca = 0;
    int 	resistencia = 0;
    int 	poderdefogo = 0;
    int 	habilidade = 0;
    int		armadura = 0;
    int 	Hp = 0;
    int 	Mp = 0;
    int 	Xp = 0;

    void Ficha(String nome, String classe, int forca, int resistencia, int poderdefogo, int habilidade, int armadura, int hp, int mp, int xp);
}
