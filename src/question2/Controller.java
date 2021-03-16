package question2;

public class Controller {
    private Number number;
    private View view;

    Controller(Number number, View view) {
        this.number = number;
        this.view = view;
    }

    public void display() {
        view.getjButton1().addActionListener(actionEvent -> {
            number.setValue(number.getValue() + 1);
        });
        view.getjButton2().addActionListener(actionEvent -> {
            number.setValue(number.getValue() - 1);
        });
        view.getjTextField().addActionListener(actionEvent -> {
            int value = Integer.parseInt(view.getjTextField().getText());
            number.setValue(value);
        });
    }
}
