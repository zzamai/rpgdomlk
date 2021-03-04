package Models;

import java.util.ArrayList;

public class ArrayNPC {

    private final ArrayList<Ficha_NPC> npcs;

    public ArrayNPC() {
        npcs = new ArrayList<Ficha_NPC>();
    }

    public ArrayList<Ficha_NPC> getNPC() {
        return this.npcs;
    }

    public String getNomeNPC() {
        StringBuilder sb = new StringBuilder();
        for (Ficha_NPC npc :
                npcs) {
            sb.append("\nNome: "+npc.getNome());
        }
        return sb.toString();
    }

    public void addNPC(Ficha_NPC npc) {
        this.npcs.add(npc);
    }

    public void removeNPC(Ficha_NPC npc) {
        this.npcs.remove(npc);
    }

    public void apagaNPC() {
        this.npcs.clear();
    }

}
