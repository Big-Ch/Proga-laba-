package lab3.Characters;

public class NormalCharacter extends CharacterWithLegsAndHands implements CanShout, CanSpeak, CanBeSilent, CanAsk{
    public NormalCharacter(String name) {
        super(name);
    }

    @Override
    public void say(String s) {
        System.out.println(name + " said: \"" + s + "\"");
    }

    @Override
    public void beSilent() {
        System.out.println(name + " didn't say anything for a long time ");
    }

    @Override
    public void ask(String s) {
        System.out.println(name + " asked: " + s);
    }

    @Override
    public void shout(String s) {
        System.out.println(name + " shouted: \"" + s + "\"");
    }

    @Override
    public String toString() {
        return ("normal " + super.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NormalCharacter that = (NormalCharacter) o;
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
