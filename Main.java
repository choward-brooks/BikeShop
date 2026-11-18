public class Main {
    public static void main(String[] args) {
        int id = 1;
        Bicycle bike1 = new Bicycle("Bill", "Race", 300);
        Bicycle bike2 = new Bicycle("Bob", "Mountain", 600);
        toString(bike1 + bike2);
    }
}