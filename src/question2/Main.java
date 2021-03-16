package question2;

public class Main {
    // just for test
    public static void main(String[] args) {
        Number number = new Number();
        View view = new View(number);
        Controller controller = new Controller(number, view);
        controller.display();
    }
}
