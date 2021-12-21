package lab3.Sounds;

public abstract class MaterialSounds implements Sounds {
    protected String material;
    public abstract void setMaterial(String material);
    public abstract String getMaterial();
}
