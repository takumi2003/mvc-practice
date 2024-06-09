public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View("initial text");
        Controller controller = new Controller(model, view);

        controller.setData("Hello, MVC!");
        controller.updateView();
    }
}
