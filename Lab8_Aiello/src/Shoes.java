// Extends Garment abstract class overrides wear()
public class Shoes extends Garment {
    public Shoes(Variant variant) {
        super(variant, "Shoe");
    }

    @Override
    public void wear() {
        System.out.println("Wearing " + variant.getStyle() + " " + type);
    }
}
