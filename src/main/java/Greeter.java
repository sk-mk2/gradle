
public class Greeter {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.greet());
    }

    public String greet() {
        Clock clock = new Clock();
        if(clock.isMorning()) {
            return "おはようございます";
        }
        if(clock.isAfternoon()) {
            return "こんにちは";
        }
        if(clock.isNight()) {
            return "こんばんは";
        }
        return "error";
    }
}
