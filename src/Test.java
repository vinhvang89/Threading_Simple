public class Test {
    public static void main(String[] args) {
        NumberGenerator number1 = new NumberGenerator("Alo");
        NumberGenerator number2 = new NumberGenerator("Aloha");

        Thread a = new Thread(number1);
        Thread b = new Thread(number2);
        a.start();
        b.start();
    }
}
