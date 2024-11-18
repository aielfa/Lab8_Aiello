public class GarmentSimulator {
    public static void main(String[] args) {

        //Creates new instance of classes
        Variant professional = new ProfessionalWearVariant();
        Variant casual = new CasualWearVariant();
        Variant party = new PartyWearVariant();


        //Professional Garment Catalog
        Garment topProf = new Top(professional);
        topProf.wear(); // Outputs Wearing a Professional Top
        Garment pantProf = new Pants(professional);
        pantProf.wear(); // Outputs Wearing a Prof Pant
        Garment shoeProf = new Shoes(professional);
        shoeProf.wear(); // Outputs Wearing a Professional Shoe

        topProf.mixAndMatch("Pant", casual);  // Outputs Mixing a Professional Top with a Casual Pant.
        pantProf.mixAndMatch("Shoe", party); // Outputs Mixing a Casual Top with a Party Shoe.


        System.out.println("\n");

        //Casual Garment Catalog
        Garment topCas = new Top(casual);
        topCas.wear(); // Outputs Wearing a Casual Top
        Garment pantCas = new Pants(casual);
        pantCas.wear(); // Outputs Wearing a Casual Pant
        Garment shoeCas = new Shoes(casual);
        shoeCas.wear(); // Outputs Wearing a Casual Shoe

        topCas.mixAndMatch("Pant", party);  // Outputs Mixing a casual Top with a party Pant.
        pantCas.mixAndMatch("Shoe", professional); // Outputs Mixing a Casual Top with a professional Shoe.


        System.out.println("\n");

        //Party Garment Catalog
        Garment topPart = new Top(party);
        topPart.wear(); // Outputs Wearing a party Top
        Garment pantPart = new Pants(party);
        pantPart.wear(); // Outputs Wearing a party Pant
        Garment shoePart = new Shoes(party);
        shoePart.wear(); // Outputs Wearing a party Shoe

        topPart.mixAndMatch("Pant", casual);  // Outputs Mixing a party Top with a casual Pant.
        pantPart.mixAndMatch("Shoe", casual); // Outputs Mixing a party Top with a casual Shoe.

    }
}