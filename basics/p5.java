/* Implement a class for stack of integers using an array. Please note that the operations defined for a stack data structure are as follows: “push”, “pop”, “print”. 
There should be a constructor to create an array of integers; the size of the array is provided by the user.
Write a main() function to (i) create a stack to hold maximum of 30 integers; (ii) push the numbers 10, 20, 30, 15, 9 to the stack; (iii) print the stack; (iii) pop thrice and (iv) print the stack again.
*/
class p5{
    int size;
    int arr[];
    int top;

 private p5(int s){       // since it is called from same class so no effect is seen.
            size = s;
            top = -1;
            arr = new int[size];
    }

public void push(int p){
            if(top>=size){
                    System.out.println("Stack overflow!");
            }
            top=top+1;
            arr[top]=p;
    }
    void pop(){
            if(top<=-1){
                    System.out.println("Stack underflow!");
            }
            arr[top]=arr[top-1];
            top--;
    }
    void print(){
            System.out.println("Printing the stack: ");
            for(int i=0; i<=top; i++){
                    System.out.println(arr[i]);
            }
    }
    public static void main(String args[]){
            p5 s = new p5(30);

            s.push(10);
            s.push(20);
            s.push(30);
            s.push(15);
            s.push(9);

            s.print();
            
            s.pop();
            s.pop();
            s.pop();

            s.print();
    }

}