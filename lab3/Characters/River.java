package lab3.Characters;

public class River {

    static public class Moisture implements CanInspiringBySwim {
        TemperatureOfMoisture type;

        public enum TemperatureOfMoisture {
            cool,
            cold,
            hot,
            worm,
            freezing,
            boiling,
            normal
        }

        public Moisture(TemperatureOfMoisture t) {
            type=t;
        }

        public void inspiring(NormalExtendedSensitiveSwimmingCharacter c) {
            c.setLevelOfInspiring(c.getLevelOfInspiring() + 1);
            if (c.getLevelOfInspiring() >= 2) {
                c.extendedFeel("that this is the real life for " + c.getName());
            }
        }

        public TemperatureOfMoisture getTemperature() {
            return type;
        }

        @Override
        public String toString() {
            return type+" moisture";
        }

    }

    static public class Flow implements CanInspiringBySwim {
        boolean vector; // 0 = down; 1 = up

        public Flow(boolean t) {
            vector=t;
        }

        public void inspiring(NormalExtendedSensitiveSwimmingCharacter c) {
            c.setLevelOfInspiring(c.getLevelOfInspiring() + 1);
            if (c.getLevelOfInspiring() >= 2) {
                c.extendedFeel("that this is the real life for " + c.getName());
            }
        }

        public boolean getVector() {
            return vector;
        }

        @Override
        public String toString() {
            return (vector ? "up" : "down" + "stream");
        }

    }


}
