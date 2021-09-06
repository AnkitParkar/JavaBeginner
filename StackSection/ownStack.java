package StackSection;

public class ownStack {
    public static void main(String[] args) {
        /*arrayStack stack=new arrayStack(10);
        stack.push(new Employee("Jane","Jones",123));
        stack.push(new Employee("John","Doe",4567));
        stack.push(new Employee("Mary","Smith",22));
        stack.push(new Employee("Mike","Wilson", 3245));
        stack.push(new Employee("Bill","End",78));
        //stack.printStack();
        System.out.println(stack.pop());
        stack.push(new Employee("Seb","Vettel",5));
        stack.printStack();*/

        LinkedStack stack = new LinkedStack();
        stack.push(new Employee("Jane","Jones",123));
        stack.push(new Employee("John","Doe",4567));
        stack.push(new Employee("Mary","Smith",22));
        stack.push(new Employee("Mike","Wilson", 3245));
        stack.push(new Employee("Bill","End",78));
        stack.printStack();
    }
}
