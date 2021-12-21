package lab3.Characters;

public class NormalExtendedSensitiveCharacter extends NormalSensitiveCharacter {
    public NormalExtendedSensitiveCharacter(String name) {
        super(name);
    }
    protected int levelOfInspiring=0;

    public void extendedFeel(String f) {
        System.out.println(name +" felt " + f);
    }

    public int getLevelOfInspiring() {
        return levelOfInspiring;
    }

    public void setLevelOfInspiring(int x) {
        levelOfInspiring=x;
    }


    @Override
    public String toString() {
        return (super.toString() + " with inspiring level " + levelOfInspiring);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NormalExtendedSensitiveCharacter that = (NormalExtendedSensitiveCharacter) o;
        if (this.getMaxHp()!=that.getMaxHp() || this.getHp()!=that.getHp() || this.stand!=that.stand) {return false;}
        if (this.maxPowerOfHolding!=that.maxPowerOfHolding || !this.holdenObject.equals(that.holdenObject)) { return false;}
        if (this.levelOfInspiring!=that.levelOfInspiring) {return false;}
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
        result+=37*maxPowerOfHolding;
        result+=109*holdenObject.hashCode();
        result+=1007*levelOfInspiring;
        return result;
    }

}
