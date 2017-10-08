public class Greeter {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.greet());
    }

    public String greet() {
        return "おはようございます";
    }
}
