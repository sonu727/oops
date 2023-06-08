import java.util.*;

class Room {

    // Attributes 
private int h,l,b;   // instance variable 

   //default constructor :
    Room(){
          
      this.h = 0;
      this.l = 0;
      this.b = 0;

    }


    

    //parameterished constructor :
    Room(int a , int b , int c ){      // this is local variable .
          
      this.h = a ;
      this.l = b ;
      this.b = c;

    }
    
    // function  to calculate volume :
    int volume (){

        return (h*l*b);
    }


}


public class p2 {

    public static void main(String[] args) {
        
      // create object :

      Room ob1 = new Room (1,2,3); // -> parameterished constructor call karega 
      Room ob2 = new Room ();// -> default constructor is called .

      //what if we want user input : 
      Scanner sc = new Scanner (System.in);

      System.out.println("enter the length");           // following are the local variables .
      int l = sc.nextInt();
      System.out.println("enter the breadth");
      int b = sc.nextInt();
      System.out.println("enter the height");
      int h = sc.nextInt();

    Room ob3 = new Room(l,b,h);

    int vol1 = ob1.volume();
    int vol2 = ob2.volume();
    int vol3 = ob3.volume();

    System.out.println(vol1);     //6
    System.out.println(vol2);     //0
    System.out.println(vol3);


    }

}