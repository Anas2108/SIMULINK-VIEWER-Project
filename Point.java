
package Project;


public class Point {
 
    private double x_point;
    private double y_point ;
    
    // No arg constructor
    Point(){}
    // Arg Const
    Point(double x , double y){
    this.x_point = x ;
    this.y_point = y ;
    }
    
    public void setX(double x){
  x_point=x;
}
   
     public void setY(double y){
  y_point=y;
}
     public void Print(){
    System.out.println("X = "+ x_point + " Y = "+ y_point+"\n");
    
     }
     
     public double getX(){return this.x_point;}
      public double getY(){return this.y_point;}
     
     public double distance(Point p2){
      
        double px = p2.getX() - this.getX();
        double py = p2.getY() - this.getY();
        
        return Math.sqrt(px * px + py * py);
}

     public void add(double dx,double dy){
     this.x_point+=dx;
     this.y_point+=dy;
     
     }
     
}


