import java.util.*;

class p1 {

    int a , b ;
    String name ;

    p1(String a ){

        this.name = a;
    }

   // empty constructor -> from one constructor we are calling another constructor .

    p1(){

        this(12,6);

    }

    p1(int a , int b ){

        this.a = a ;
        this.b = b ;
    }

    void display(){

        System.out.println(a + " " + b);
    }



    public static void main(String[] args) {
      
       p1 ob1 = new p1 ();

    //   ob1.dispaly();
        ob1.display();

        final p1 ob2 = new p1 ("Sonu");

        ob2.name = "baidurya";        // i can change the instance variable value of the object but i can't change object.
        
        System.out.println(ob2.name);

    //cannot assign a value to final variable ob2
    //    ob2 = new p1("rahul");   // error message 


    };



}