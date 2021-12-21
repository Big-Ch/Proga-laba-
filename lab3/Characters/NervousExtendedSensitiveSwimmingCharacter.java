package lab3.Characters;

public class NervousExtendedSensitiveSwimmingCharacter extends NormalExtendedSensitiveSwimmingCharacter{
    public NervousExtendedSensitiveSwimmingCharacter(String name) {
        super(name);
    }

    protected int stress=10;

    @java.lang.Override
    public void say(String s) {
        if (stress>=10) {
            System.out.println(name + " nervously said: \"" + s + "\"");
        }
        else {
            super.say(s);
        }
    }

    @Override
    public String toString() {
        return (super.toString() + " with stress " + stress);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NervousExtendedSensitiveSwimmingCharacter that = (NervousExtendedSensitiveSwimmingCharacter) o;
        if (this.getMaxHp()!=that.getMaxHp() || this.getHp()!=that.getHp() || this.stand!=that.stand) {return false;}
        if (this.maxPowerOfHolding!=that.maxPowerOfHolding || !this.holdenObject.equals(that.holdenObject)) { return false;}
        if (this.levelOfInspiring!=that.levelOfInspiring) {return false;}
        if (this.isWet!=that.isWet) {return false;}
        if (this.stress!=that.stress) {return false;}
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
        result+=7*(isWet ? 1:0);
        result+=1009*stress;
        return result;
    }
}
