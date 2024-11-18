// This abstract class will have the stored value
// of the variant of the
// wear and the type (shoes, top, etc.)
abstract class Garment {
    Variant variant;
    String type;

    public Garment(Variant variant, String type) {
        this.variant = variant;
        this.type = type;
    }

    public abstract void wear();
}
