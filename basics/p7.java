class C {

}

class B{
     
    int a ;
    int b ;
private int c ;

    B(int a , int b ){

        this.a =a ;
        this.b = b;    
    
    }
    
    void display(){
    System.out.println("In B");
    }

}

class p7 {

    public static void main(String[] args) {
        
        System.out.println("In class A");

        B ob1 = new B (10,20);

        ob1.display();
        System.out.println(ob1.a); // we can  access this since private package access modifier helps to access instance variable under same package of different class .
//        System.out.println(ob1.c); --> you cannot do this since it can be accessed only from same class .

        ob1.a = 30 ;
        System.out.println(ob1.a);

    }
}