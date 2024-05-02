package SingleResponsibilityPrinciple;
public class PetMain
{
    public static void main(String[] args)
    {
        Pet dog = new Pet("Enzo", "Sam");

        PetEating petEat = new PetEating();
        PetSound petSound = new PetSound();

        System.out.print("\nName: " + dog.getPetName() + " - Owner: " + dog.getOwner());
        System.out.print("\n");
        petEat.eat(dog," eats rice with gravy");
        petSound.makeSound(dog, " sounds 'Awoo!'");

    }
}
