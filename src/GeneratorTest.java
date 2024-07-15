// class for testing
public class GeneratorTest {
    public static void main(String[] args) {
        // create and log the three different styles we created
        displayOutfit(new ProfessionalClothingGenerator());
        System.out.println();
        displayOutfit(new CasualClothingGenerator());
        System.out.println();
        displayOutfit(new PartyClothingGenerator());
    }

    // using given generator  create and display outfit
    private static void displayOutfit(ClothingGenerator generator) {
        Shirt shirt = generator.createShirt();
        Pants pants = generator.createPants();
        Shoes shoes = generator.createShoes();

        System.out.println("Created a matching set:");
        System.out.println(shirt.getDescription());
        System.out.println(pants.getDescription());
        System.out.println(shoes.getDescription() + '\n');

    }
}

