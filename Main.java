//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String []args) {
        FarmManagement animal1 = new FarmManagement("Pig");
        animal1.display();
        FarmManagement animal2 = new FarmManagement("Duck");
        animal2.display();
        FarmManagement animal3 = new FarmManagement("Fish");
        animal3.display();
    }
}