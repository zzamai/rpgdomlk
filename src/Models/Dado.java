package Models;

import java.util.Random;

public class Dado {

    public Dado() {

    }

    public int rodaDado() {
        Random aleatorio = new Random();
        return aleatorio.nextInt(6)+1;
    }

}
