package OOPS.StaticExample;

public class main {
    public static void main(String[] args) {
        Human rajeev = new Human(22, "aashka", false, 123456, 0);
        Human rahul = new Human(20, "suhani", false, 123456, 0);
        System.out.println("Total population: " + Human.population);
    }
}
