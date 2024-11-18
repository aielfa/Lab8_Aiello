// Extends Garment abstract class overrides wear()
class Top extends Garment {
    public Top(Variant variant) {
        super(variant, "Top");
    }

    @Override
    public void wear() {
        System.out.println("Wearing a " + variant.getStyle() + " " + type);
    }
}