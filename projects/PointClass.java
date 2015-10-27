/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointclass;



import java.util.Scanner;
 
public class PointClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("please input the x Coordinate that defines the virtical line ");
    
    int xP = in.nextInt();
    
    System.out.println("please input the first y Coordinate that defines the first point on the virtical line ");
    
    int yp1 = in.nextInt();
            
    System.out.println("please input the second y  Coordinate that defines the second point on the virtical line ");
    
    int yp2 = in.nextInt();

    int random1 = 1 + (int)(Math.random()*20); 
    
    int random2 = 1 + (int)(Math.random() * 20);
    
    double slope = (random1/random2);
    
    Point p2 = new Point(xP,yp2);
    
    Point p1 = new Point(xP, yp1);
    
    dynamicPoint a = new dynamicPoint(p1, p2, slope);
    
    boolean answer = a.SlopeCheck();
    
    if (answer = true){
        
        System.out.println("The slope Passes your desired points");
        
    }else if (answer = false)
        
        System.out.println("The slope does not Pass your dedired points");
    
     
    }
    
    public static class Point {
        public int x;
        public int y;

        public Point(int x1, int y1){
        
                x = x1;
                y = y1 ;
      
            }
    }
    
    
    public static class dynamicPoint {
        
            public Point point1;
            public Point point2;
            public double slope;
            
            
        public dynamicPoint(Point p1, Point p2, double s){
            point1 = p1;
            point2 = p2;
            slope = s;
            
            }
        
       public boolean SlopeCheck(){
           double idx = point1.x * slope;
           
           if(idx >= point1.y || idx >= point2.y){
               return true;
           }else 
               return false;
                 
            }
           
 
    }
    

}
    



    
