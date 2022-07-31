package ex04.san;

public abstract class PlayerLevel {

    public PlayerLevel(){}

    abstract public void    run();
    abstract public void    jump();
    abstract public void    turn();
    abstract public void    showLevelMessage();

//    public void go(int level) {
//    }
}
