package lab3.Characters;

public class CharacterWithLegsAndHands extends CharacterWithLegs implements CanShakeOff, CanGrope, CreatureCanPickUp, CanHoldOnTo, CanCrawl, CabHelpToStanUp {
    protected String holdenObject="";
    protected int maxPowerOfHolding=10;
    public CharacterWithLegsAndHands(String name) {
        super(name);
    }

    public enum SpeedOfCrawling {
        slowly_slowly{public String toString() {return "slowly slowly";}},
        slow,
        normal,
        fastly,
        fastly_fastly{public String toString() {return "fastly fastly";}}
    }

    @Override
    public void pickUp(CharacterWithLegs character, CharacterWithLegsAndHands... characters) {
        if (this.equals(characters[0])) {
            //something
        }
        character.stand=true;
    }

    @Override
    public void holdOnTo(String object, int power) {
        holdenObject=object;
        System.out.print(name + " held on to the " + holdenObject);
        if (power==maxPowerOfHolding) {
            System.out.print(" with all his might");
        }
        System.out.println("");
    }

    @Override
    public void helpToStandUp(CharacterWithLegs character) throws AlreadyStandException {
        if (character.getStand()) {
            throw new AlreadyStandException(character.getName()+" already stand");
        }
        System.out.println(name + " helped " + character.getName() + " to stand up");
        character.standUp();
    }

    @Override
    public void shakeOff(Character character) throws AlreadyClearException {
        if (!character.isDirt()) {
            throw new AlreadyClearException(character.getName() + " already clear");
        }
        System.out.println(name + " shook the dust off " + character.getName());
        character.becomeClear();
    }

    @Override
    public void grope(Character character, boolean isCarefull) {
        if (isCarefull) {
            System.out.println(name + " carefully groped " + character.getName());
        }
        else {
            System.out.println(name + " groped " + character.getName());
            character.setHp(character.getHp()-1);
        }
        if (character.getHp()!=character.getMaxHp()) {
            System.out.println(name + " find injury in " + character.getName());
        }
    }

    @Override
    public void crawl(SpeedOfCrawling speed) {
        if (holdenObject=="") {
            //something
        }
        System.out.println(name + " " + speed + " crawls along the " + holdenObject);
    }

    @Override
    public int getMaxPowerOfHolding() {
        return maxPowerOfHolding;
    }

    @Override
    public String toString() {
        return (super.toString()+ " with max power of holding = " + maxPowerOfHolding + " that holds " + holdenObject);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CharacterWithLegsAndHands that = (CharacterWithLegsAndHands) o;
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
