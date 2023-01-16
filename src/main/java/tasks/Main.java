package tasks;

public class Main {
    public static void main(String[] args) {
        Stack stack1 = new Stack(1);
        Stack stack2 = new Stack(1);

        Integer value1 = 5;
        stack1.push(value1);

        Integer value2 = 5;
        stack2.push(value2);

        System.out.println(stack1.equals(stack2));
    }
}
