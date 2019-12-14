
package main;

public class Main {


    public static void main(String[] args) {
        
       Taxi x =  new Taxi("GTX-1060");
       x.run("ru");
       x.printCurrentLocation();
       x.book(1,1);
       x.run("I am leaving on the taxi");
       x.reachedDestination(); 
       x.plate();
    }
    
}

