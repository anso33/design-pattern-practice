package ex04.san;

public class Player {

        public static final int BEGINNER_LEVEL = 1;
        public static final int ADVANCED_LEVEL = 2;
        public static final int SUPER_LEVEL = 3;

        private PlayerLevel level;


        public Player() {
            level = new LevelBegin();
        }

        public Player(int l) {

            if (l == BEGINNER_LEVEL)
                level = new LevelAdvanced();
            else if (l == ADVANCED_LEVEL)
                level = new LevelAdvanced();
            else if (l == SUPER_LEVEL)
                level = new LevelSuper();
        }

        public void play(int time) {
            level.run();
            level.jump();
            level.turn();
        }

        public void upgradeLevel(PlayerLevel level) {
            this.level = level;
        }

        public void getLevel(){
            level.showLevelMessage();
        }
}
