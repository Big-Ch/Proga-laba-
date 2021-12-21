package lab3.Characters;

public abstract class CreatureWithName extends Creature {
    protected String name;
    public abstract String getName();

    @Override
    public int getHp() {
        return hp;
    };
    @Override
    public void setHp(int hp){
        this.hp=hp;
    };

    @Override
    public int getMaxHp() {
        return maxHp;
    };

    @Override
    public void setMaxHp(int hp){
        this.maxHp=hp;
    };
}
