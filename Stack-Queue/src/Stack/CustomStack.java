package Stack;

public class CustomStack {
    int [] data;
    int top;

    CustomStack(int size){
        this.data = new int[size];
        top = -1;
    }
    void push(int value){
        if(top == data.length-1){
            System.out.println("Stack is overflow");
            return;
        }
        top++;
        data[top] = value;
    }
    int pop() {
        if (top == -1) {
            System.out.println("Stack underFlow");
            return -1;
        }
        int value = data[top];
        top--;
        return value;
    }

    void display(){
        for(int i = top; i>= 0; i--){
            System.out.println(data[i]);
        }
    }

public static void main(String[] args) {
    CustomStack stack = new CustomStack(5);

    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);

    stack.display();

//    System.out.println(stack.pop());
//    System.out.println(stack.pop());
}
}
