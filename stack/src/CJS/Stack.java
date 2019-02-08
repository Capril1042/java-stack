package CJS;

import java.util.ArrayList;


public class Stack
{
    public static int max = 1000;
    int numberOfItems = 0;
    ArrayList<String> myStack;


    public Stack()
    {
        this.myStack = new ArrayList<String>();
        this.numberOfItems = 0;
        this.max = 1000;

    }

    public ArrayList<String> print()
    {
        return myStack;
    }

    public String pop(){
        if ( this.myStack.size() > 0)
        {
            String s = this.myStack.get(this.myStack.size()-1);
            int index = this.myStack.size()-1;
            this.myStack.remove(index);
            this.numberOfItems = this.numberOfItems - 1;
                return s;
        }
        else
        {
            return "Nothing left in stack";
        }
    }

    public void push(String s)
    {
        if(this.numberOfItems + 1 <= this.max)
        {
            this.myStack.add(s);
            this.numberOfItems = this.numberOfItems + 1;
        }

    }


    public String numOfItems()
    {
        if(this.myStack.size() > 0)
        {
            return  Integer.toString(this.myStack.size());
        }
        return "There are no items in your Stack";
    }
}
