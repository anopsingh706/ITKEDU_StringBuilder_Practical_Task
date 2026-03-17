public class Main {
    public static void main(String[] args) {
        MyStringBuilder msb = new MyStringBuilder();

        msb.append("Hello");
        msb.append(" World");

        System.out.println(msb); // Hello World

        msb.undo();
        System.out.println(msb); // Hello

        msb.undo();
        System.out.println(msb); // ""
    }
}