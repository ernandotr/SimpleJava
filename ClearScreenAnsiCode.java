public class ClearScreenAnsiCode {
    public final static void main(String... args) {
        System.out.println("Hello!");
        // System.out.print("\033c");
        System.out.print("\033c[H\033[2J");
        System.out.println("Hello!!");

    }
}
