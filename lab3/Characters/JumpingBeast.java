package lab3.Characters;

public class JumpingBeast extends CreatureWithName implements CanJump{
    @java.lang.Override
    public void jump() {
        System.out.println(name+" jumped");
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "jumping beast " + name.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JumpingBeast that = (JumpingBeast) o;
        if (this.getHp()==that.getHp() && this.getMaxHp()==that.getMaxHp()) {
            return name.equals(that.name);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result+=31*maxHp + 127*hp;
        return result;
    }
}
