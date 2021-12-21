package lab3.Characters;

public class SwimmingBeast extends CreatureWithName implements CanSwim {
    @java.lang.Override
    public void swim() {
        System.out.println(name+" swim");
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "swimming beast " + name.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SwimmingBeast that = (SwimmingBeast) o;
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
