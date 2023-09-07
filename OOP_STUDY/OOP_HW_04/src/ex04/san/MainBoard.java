package ex04.san;

public class MainBoard {

    public static void main(String[] args) {

        Player player = new Player();

        player.getLevel();
        player.play(1);
        player.upgradeLevel(new LevelAdvanced());
        player.getLevel();
        player.play(2);
        player.upgradeLevel(new LevelSuper());
        player.getLevel();
        player.play(3);
    }

}
