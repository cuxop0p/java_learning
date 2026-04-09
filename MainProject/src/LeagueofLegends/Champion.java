package LeagueofLegends;

public class Champion {
    int hp;
    int mana;
    String type;

    public Champion(int hp, int mana, String type) {
        this.hp = hp;
        this.mana = mana;
        this.type = type;

    }

    public void Info() {
        System.out.println("Im a " + type + " and i have " + hp + " hp and " + mana + " mana.");
    }
}
