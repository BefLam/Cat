public class Cat {

    private String name, gender, breed, colour;
    private boolean sterilized;
    private double weight;
    private int age, feet = 1 + (int) (Math.random() * ((4 - 1) + 1));

    public Cat(String name, String gender, String breed, String colour, boolean sterilized, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.breed = breed;
        this.colour = colour;
        this.sterilized = sterilized;
        this.weight = weight;
        this.age = age;
    }

    public Cat() {
    }

    public String checkFeet() {
        String word = this.feet == 1 ? " foot" : " feet";
        return this.feet < 4 ? "The cat is an invalid because it has only " + this.feet + word : "A lucky bastard! The cat has all feet.";
    }

    public static int getLargestAge(Cat[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) if (max < array[i].getAge()) max = array[i].getAge();
        return max;
    }

    public static double getAverageWeight(Cat[] array) {
        double average = 0.0;
        for (int i = 0; i < array.length; i++) average += array[i].getWeight();
        return average / array.length;
    }

    public static String getGenderQuantity(Cat[] array) {
        int male = 0, female = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getGender().equals("female")) female++;
            else male++;
        }
        return "Male: " + male + "\nFemale: " + female;
    }

    public String toString(int number) {
        String temp = this.sterilized ? "Yes" : "No";
        return "Cat's number: " + number + "\n" +
                "Name: " + name + "\n" +
                "Gender: " + gender + "\n" +
                "Breed: " + breed + "\n" +
                "Colour: " + colour + "\n" +
                "Sterilized: " + temp + "\n" +
                "Weight: " + weight + "\n" +
                "Age: " + age + "\n" +
                checkFeet() + "\n";
    }

    /**
     * Default Getters and Setters
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFeet() {
        return feet;
    }
}