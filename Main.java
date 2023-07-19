public class Main {
    public static void main(String[] args) {

        Cat lonelyCat = new Cat();
        Cat[] groupOfCats = {
                lonelyCat,
                new Cat("Pixy", "female", "persian", "white", true, 3.6, 4),
                new Cat("Redpaw", "male", "bengal", "ginger", false, 4.7, 7)
        };

        lonelyCat.setName("Garbagetail");
        lonelyCat.setGender("male");
        lonelyCat.setBreed("homeless");
        lonelyCat.setColour("black");
        lonelyCat.setSterilized(false);
        lonelyCat.setWeight(3.2);
        lonelyCat.setAge(14);

        for (int i = 0; i < groupOfCats.length; i++) System.out.println(groupOfCats[i].toString(i + 1));

        System.out.println("Statistics:");
        System.out.println(Cat.getGenderQuantity(groupOfCats));
        System.out.println("The largest age of " + groupOfCats.length + " cats is " + Cat.getLargestAge(groupOfCats) + " years.");
        System.out.printf("The average age of " + groupOfCats.length + " cats is %.2f kilograms", Cat.getAverageWeight(groupOfCats));

    }
}