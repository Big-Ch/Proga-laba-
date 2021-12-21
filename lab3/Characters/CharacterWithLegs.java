package lab3.Characters;

public class CharacterWithLegs extends Character implements CanStand {
    protected boolean stand;
    public CharacterWithLegs(String name) {
        super(name);
        this.stand=true;
    }
    @Override
    public void standUp() {
        this.stand=true;
    }
    @Override
    public boolean getStand() {
        return this.stand;
    }
    @Override
    public void fall() {
        this.stand=false;
    }

    @Override
    public String toString() {
        return ((this.stand ? "not standing" : "standing") + super.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CharacterWithLegs that = (CharacterWithLegs) o;
        if (this.getMaxHp()!=that.getMaxHp() || this.getHp()!=that.getHp() || this.stand!=that.stand) {return false;}
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result+=139*(dirt ? 1:0);
        result+=31*maxHp + 127*hp;
        if (this.getStand()) {
            result=109;
        }
        return result;
    }

}
