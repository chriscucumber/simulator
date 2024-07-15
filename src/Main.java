// article types
interface Shirt {
    String getDescription();
}

interface Pants {
    String getDescription();
}

interface Shoes {
    String getDescription();
}

// professional clothing pieces
class ProfessionalShirt implements Shirt {
    public String getDescription() {
        return "Professional Shirt";
    }
}

class ProfessionalPants implements Pants {
    public String getDescription() {
        return "Professional Pants";
    }
}

class ProfessionalShoes implements Shoes {
    public String getDescription() {
        return "Professional Shoes";
    }
}

//  asual clothing pieces
class CasualShirt implements Shirt {
    public String getDescription() {
        return "Casual Shirt";
    }
}

class CasualPants implements Pants {
    public String getDescription() {
        return "Casual Pants";
    }
}

class CasualShoes implements Shoes {
    public String getDescription() {
        return "Casual Shoes";
    }
}

// party clothing pieces
class PartyShirt implements Shirt {
    public String getDescription() {
        return "Party Shirt";
    }
}

class PartyPants implements Pants {
    public String getDescription() {
        return "Party Pants";
    }
}

class PartyShoes implements Shoes {
    public String getDescription() {
        return "Party Shoes";
    }
}

// helper classes to generate clothing
interface ClothingGenerator {
    Shirt createShirt();
    Pants createPants();
    Shoes createShoes();
}

class ProfessionalClothingGenerator implements ClothingGenerator {
    public Shirt createShirt() {
        return new ProfessionalShirt();
    }
    public Pants createPants() {
        return new ProfessionalPants();
    }
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}

class CasualClothingGenerator implements ClothingGenerator {
    public Shirt createShirt() {
        return new CasualShirt();
    }
    public Pants createPants() {
        return new CasualPants();
    }
    public Shoes createShoes() {
        return new CasualShoes();
    }
}

class PartyClothingGenerator implements ClothingGenerator {
    public Shirt createShirt() {
        return new PartyShirt();
    }
    public Pants createPants() {
        return new PartyPants();
    }
    public Shoes createShoes() {
        return new PartyShoes();
    }
}