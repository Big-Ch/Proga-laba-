package lab3.Characters;

import lab3.Kucha_mala.Event;
import lab3.Sounds.Sounds;

import java.lang.Object;
public class Character extends CreatureWithName implements CanBeDirt {
    public Character(String name) {
        this.name=name;
    }
    protected boolean dirt =false;

    public class Mind {

        public void thinkAboutEvent(Event ... event) {
            System.out.println("Suddenly " + Character.this.getName() + " started imagining ");
            for (int i=0; i<event.length; i++) {
                System.out.print("How ");
                event[i].happen();
            }
            System.out.println(Character.this.getName() + " finished imagining ");

        }

        public void thinkAboutSound(Sounds sounds) {
            sounds.sound();
        }

        public Opinion MakeOpinion(String opinionObject, boolean f, Object object2) {
            class GoodOrBadOpinion implements Opinion {
                String opinionSubject=object2.toString();
                boolean isGood=f;
                @Override
                public String sound() {
                    return (name + " thinks " + opinionObject+" is "+ (isGood ? "good " : "quite another matter ") + "for " + opinionSubject);
                }
            }
            return new GoodOrBadOpinion();
        }

    }

    @Override
    public boolean isDirt() {
        return dirt;
    }
    @Override
    public void becomeClear() {
        dirt =false;
    }
    @Override
    public void becomeDirt() {
        dirt =true;
    }

    @Override
    public String getName() {return this.name;}

    @Override
    public String toString() {
        return name.toString() + " with HP: " + hp + "/" + maxHp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Character that = (Character) o;
        if (this.getMaxHp()!=that.getMaxHp() || this.getHp()!=that.getHp()) {return false;}
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result+=139*(dirt ? 1:0);
        result+=31*maxHp + 127*hp;
        return result;
    }
}
