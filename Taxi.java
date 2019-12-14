
package main;
    public class Taxi {
         
        private int x = 0;
        private int y = 0;
        private String plate = null;
        private int Destx = 0;
        private int Desty = 0;
   
    public Taxi (String plate){
        this.plate = plate;
    }
   
    public String getPlate(){
        return this.plate;
    }
   
    public int getX(){
        return this.x;
    }
   
    public int getY(){
        return this.y;
    } 
   
    public int getDestx(){
        return this.Destx;
    }
   
    public int getDesty(){
        return this.Desty;
    }
   
    public void run(String sen){
        int length = sen.length();
        for(int a = 0; a < length; a++){
            if(sen.charAt(a)=='L' || sen.charAt(a)=='l'){
            x--;
            }
   
            else if(sen.charAt(a)=='R' || sen.charAt(a)== 'r'){
            x++;
            }

            else if(sen.charAt(a)== 'U' || sen.charAt(a)== 'u'){
            y++;
            }

            else if(sen.charAt(a)== 'D' || sen.charAt(a)== 'd'){
            y--;
            }

        }
    }
   
    public void book(int x, int y){
        this.Destx = x;
        this.Desty = y;
    }
   
    public void reachedDestination(){
        if ( this.Destx == Destx && this.Desty == Desty ){
            System.out.println("True");
    }
    else{
            
        System.out.println("False");
        
        }
    }
   
    public void printCurrentLocation(){
        
        System.out.println("your location is " + this.x+ " " + this.y);
        
}
    public void plate(){
        System.out.println("Your Plate No. is " + plate);
    }
}
    

