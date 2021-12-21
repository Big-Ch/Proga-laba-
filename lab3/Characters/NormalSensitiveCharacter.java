package lab3.Characters;

public class NormalSensitiveCharacter extends NormalCharacter implements Sensitive {
    public NormalSensitiveCharacter(String name) {
        super(name);
    }

    @Override
    public void feel(Feellings f) {
        System.out.println("Suddenly "+ name +" felt how "+f+" it was");
    }

    @Override
    public String toString() {
        return ("sensitive " + super.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NormalSensitiveCharacter that = (NormalSensitiveCharacter) o;
        if (this.getMaxHp()!=that.getMaxHp() || this.getHp()!=that.getHp() || this.stand!=that.stand) {return false;}
        if (this.maxPowerOfHolding!=that.maxPowerOfHolding || !this.holdenObject.equals(that.holdenObject)) { return false;}
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
        return result;
    }

}
