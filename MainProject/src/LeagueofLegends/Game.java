package LeagueofLegends;

public class Game {

    public void Run(){
        System.out.println("League of Legends");
        CreatePlayers();
    }

    public void CreatePlayers() {
        Champion player = new Champion(100, 100, "Mage");
        Champion enemy = new Champion(100, 100, "Tank");


        player.Info();
        enemy.Info();
    }

}
