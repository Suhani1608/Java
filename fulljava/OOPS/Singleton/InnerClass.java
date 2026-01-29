package OOPS.StaticExample;

public class InnerClass {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Suhani");
        Test b = new Test("Dhruv");

        System.out.println("Test a: " + a.name);
        System.out.println("Test b: " + b.name);
        System.out.println("Test b object: " + b);
    }
}
