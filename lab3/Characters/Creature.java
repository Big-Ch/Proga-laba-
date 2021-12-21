package lab3.Characters;

public abstract class Creature {
    protected int maxHp=100;
    protected int hp=maxHp;

    public abstract int getHp();
    public abstract void setHp(int hp);
    public abstract int getMaxHp();
    public abstract void setMaxHp(int hp);


}
