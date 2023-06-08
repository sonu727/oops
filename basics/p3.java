class p3{
    String name;
    int m1, m2, m3;

//      Student_2(int a=30; int b=30; int c=30){ //default argument cannot be passed
    p3(int a, int b, int c){
            name = "Supratick Mondal";
            this.m1 = a;
            this.m2 = b;
            this.m3 = c;
    }

    double getAverage(){
            return (m1+m2+m3)/3.0;
    }

    void display(){
            System.out.println("Name: " + name);
            System.out.println("OOS:" + m1 + "\tSE:" + m2 + "\tCN:" + m3);
    System.out.println("Total marks:" + (m1+m2+m3) + "\tAverage marks:" + getAverage());   // way 1 to get average 

    }

    public static void main(String args[]){
            p3 s1 = new p3(50,60,70);
            s1.display();
            /* way 2 
            double avg = s1.getAverage();
            System.out.println(avg);
            */

            System.out.println(s1);  // prints the address of the object (E.k)
    }
}