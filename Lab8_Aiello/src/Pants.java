// Extends Garment abstract class overrides wear()
class Pants extends Garment {
    public Pants(Variant variant) {
        super(variant, "Pant");
    }

    @Override
    public void wear() {
        System.out.println("Wearing " + variant.getStyle() + " " + type);
    }
}
