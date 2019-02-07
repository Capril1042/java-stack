package CJS;

public class Main
{
    public static void main(String[] args)
    {
//        Make a new stack
        Stack aNewStack = new Stack();
//        Report number of items on the stack
        System.out.println(aNewStack.numOfItems());
//        Push first
        aNewStack.push("first");
//        Push second
        aNewStack.push("second");
//        Push third
        aNewStack.push("third");
//        Report number of items on the stack
        System.out.println(aNewStack.numOfItems());
//        Print the stack
        System.out.println(aNewStack.print());
//        Pop the stack
        aNewStack.pop();
//        Print the stack
        System.out.println(aNewStack.print());
//        Pop the stack
        aNewStack.pop();
//        Print the stack
        System.out.println(aNewStack.print());
//        Pop the stack
        aNewStack.pop();
//        Print the stack
        System.out.println(aNewStack.print());
//        Report number of items on the stack
        System.out.println(aNewStack.numOfItems());
    }
}