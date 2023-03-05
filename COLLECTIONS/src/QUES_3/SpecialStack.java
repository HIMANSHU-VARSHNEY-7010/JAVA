package QUES_3;

class SpecialStack{
    private int top, temp, min_top;
    private int arr[], min_arr[];
    SpecialStack(int size){
        arr=new int[size];
        min_arr = new int[size];
        top=-1;
        min_top = -1;
    }

    public int getTop() {
        return top;
    }
    public int getSize() {
        return arr.length;
    }

    public void isEmpty(){
        if(top==-1) {
            System.out.println("Stack is Empty.");
        }
        else {
            System.out.println("Some values are present in the Stack.");
        }
    }
    public void isFull(){
        if(top==arr.length-1){
            System.out.println("Stack is Full.");
        }
        else {
            System.out.println("Stack is not Full.");
        }
    }
    public void push(int num){
        if(top==arr.length-1) {
            System.out.println("Stack is Full.");
        }
        arr[++top]=num;
        if(min_top==-1||num<=min_arr[min_top]){
            min_arr[++min_top]=num;
        }
    }
    public void pop(){
        if(top == -1){
            System.out.println("Stack is Empty.");
        }
        else {
            if(arr[top]==min_arr[min_top]){
                min_top--;
            }
            System.out.println("Element popped out is "+ arr[top--]);
        }
    }
    public void displayStack(){
        if(top == -1){
            System.out.println("Stack is Empty.");
        }
        else {
            System.out.println("Elements present in the Stack are :- ");
            for(int i = 0 ; i <= top ; i++){
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
    }
    public int getMin(){
            return min_arr[min_top];
    }

}
