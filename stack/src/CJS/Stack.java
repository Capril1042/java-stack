package CJS;

import java.util.ArrayList;


public class Stack
{
    int max = 1000;
    int numberOfItems = 0;
    ArrayList<String> myStack = new ArrayList<String>();


    public Stack()
    {
        this.myStack = myStack;
        this.numberOfItems = numberOfItems;

    }

    public ArrayList<String> print(){

        return myStack;
    }
    public String pop(){
        String s = myStack.get(myStack.size()-1);
        myStack.remove(s);
        this.numberOfItems = numberOfItems--;
        return s;
    }

    public void push(String s){
         myStack.add(s);
         this.numberOfItems = numberOfItems++;
    }

/*    numOfItems - No items in on the stack,
      return the message “There are no items in your Stack
      , otherwise, return the number of items.*/
    public String numOfItems(){
        if(myStack.size() > 0){
            return  Integer.toString(myStack.size());
        }
        return "There are no items in your Stack";
    }
}
