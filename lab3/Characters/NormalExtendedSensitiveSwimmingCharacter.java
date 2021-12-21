package lab3.Characters;

public class NormalExtendedSensitiveSwimmingCharacter extends NormalExtendedSensitiveCharacter implements CanSwimOnTheBack, CanDive{
    public NormalExtendedSensitiveSwimmingCharacter(String name) {
        super(name);
    }
    protected boolean isWet=false;

    @java.lang.Override
    public void swimOnTheBack(River.Flow flow) {
        isWet=true;
        System.out.println(this.getName() + " swims on the back " + flow.toString());
        if (!flow.getVector()) {
            flow.inspiring(this);
        }
    }

    @java.lang.Override
    public void dive(River.Moisture moisture) {
        isWet=true;
        System.out.println(this.getName() + " funny dives in the " + moisture.toString());
        if (moisture.getTemperature()==River.Moisture.TemperatureOfMoisture.cool) {
            moisture.inspiring(this);
        }
    }

    @Override
    public String toString() {
        return ((isWet ? "wet ": "dry ") + super.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NormalExtendedSensitiveSwimmingCharacter that = (NormalExtendedSensitiveSwimmingCharacter) o;
        if (this.getMaxHp()!=that.getMaxHp() || this.getHp()!=that.getHp() || this.stand!=that.stand) {return false;}
        if (this.maxPowerOfHolding!=that.maxPowerOfHolding || !this.holdenObject.equals(that.holdenObject)) { return false;}
        if (this.levelOfInspiring!=that.levelOfInspiring) {return false;}
        if (this.isWet!=that.isWet) {return false;}
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
        return result;
    }
}
