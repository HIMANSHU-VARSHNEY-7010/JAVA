package QUES_3;
//    3) Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(),
//          isEmpty(), isFull() and an additional operation getMin() which should return minimum element
//          from the SpecialStack. (Expected complexity O(1))

import java.util.Scanner;

public class QUES_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the Stack: ");
        int Option = scn.nextInt();
        SpecialStack stack=new SpecialStack(Option);
        do{
            System.out.println("MENU :-");
            System.out.println("1. Push an Element in the Stack");
            System.out.println("2. Pop an Element from the Stack");
            System.out.println("3. Get the Minimum Element from the Stack");
            System.out.println("4. Check whether the Stack is Empty or not");
            System.out.println("5. Check whether the Stack is Full or not");
            System.out.println("6. Display the Stack");
            System.out.println("7. EXit");
            System.out.print("Choose an Option from the Menu : ");
            Option = scn.nextInt();
            switch(Option){
                case 1 :
                    if((stack.getTop()+1) == stack.getSize()){
                        System.out.println("Stack is Full.");
                    }
                    else {
                        System.out.print("Enter the Element to be pushed into the Stack : ");
                        stack.push(scn.nextInt());
                    }
                    break;
                case 2 :
                    stack.pop();
                    break;
                case 3 :
                    if(stack.getTop()==-1){
                        System.out.println("Stack is Empty.");
                    }
                    else {
                        System.out.println("Minimum Element in the stack is "+stack.getMin());
                    }
                    break;
                case 4 :
                    stack.isEmpty();
                    break;
                case 5 :
                    stack.isFull();
                    break;
                case 6 :
                    stack.displayStack();
                    break;
                case 7 :
                    break;
                default:
                    System.out.println("Enter a valid Option.");

            }
        }while(Option != 7);
    }
}
