
package Project;

import javafx.scene.shape.Polygon;

public class Block{
    private String name ;
    private int SID ;
    private int leftTopX;
    private int leftTopY;
    private int rightButtomX;
    private int rightButtomY;
    private int length;
    private int width;
    private int branchX;
    private int branchY;

    public Block() {
    }
    
    public Block(String name , int SID,int leftTopX,int leftTopY,int rightButtomX,int rightButtomY,int branchX,int branchY){
        this.SID = SID ;
        this.leftTopX = leftTopX;
        this.leftTopY = leftTopY;
        this.rightButtomX = rightButtomX;
        this.rightButtomY = rightButtomY;
        this.branchX = branchX;
        this.branchY = branchY;
        }
    

    public int getLeftTopX() {
        return leftTopX;
    }

    public int getLeftTopY() {
        return leftTopY;
    }

    public int getRightButtomX() {
        return rightButtomX;
    }

    public int getRightButtomY() {
        return rightButtomY;
    }
    

    public String getName() {
        return name;
    }

    public int getSID() {
        return SID;
    }

    public void setBranchX(int branchX) {
        this.branchX = branchX;
    }

    public void setBranchY(int branchY) {
        this.branchY = branchY;
    }

    public int getBranchX() {
        return branchX;
    }

    public int getBranchY() {
        return branchY;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    public void setLeftTopX(int leftTopX) {
        this.leftTopX = leftTopX;
    }

    public void setLeftTopY(int leftTopY) {
        this.leftTopY = leftTopY;
    }

    public void setRightButtomX(int rightButtomX) {
        this.rightButtomX = rightButtomX;
    }

    public void setRightButtomY(int rightButtomY) {
        this.rightButtomY = rightButtomY;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getleftTopX(){
        return leftTopX;
    }
    public int getleftTopY(){
        return leftTopY;
    }
    public int getLength(){
        return rightButtomY - leftTopY ;
    }
    public int getWidth(){
        return rightButtomX - leftTopX ;
                }
    public int getStartPointX(){
        if(SID==5)           
            return rightButtomX ;
        else if(SID==1)      
            return rightButtomX;
        else if(SID==3)      
            return rightButtomX ;
        else                      
            return leftTopX ;                      
            
            
    }
    public int getStartPointY(){
         if(SID==5)           
            return rightButtomY - getLength()/2 ;
        else if(SID==1)      
            return  rightButtomY - getLength()/2;
        else if(SID==3)
            return  rightButtomY - getLength()/2;
        else
            return leftTopY + getLength()/2; 
    }
    
    
    public int getEndPointX(){
         if(SID==1)           
            return leftTopX;
        else if(SID==3)      
            return  leftTopX;
        else if(SID==7)
            return  leftTopX;
        else
            return rightButtomX; 
    }
    public int getEndPointY(){
        if(SID==1)           
            return leftTopY + getLength()/2 ;
        else if(SID==3)      
            return leftTopY + getLength()/5 ;
        else if(SID==7)
            return leftTopY + getLength()/2 ;
        else
            return rightButtomY - getLength()/2 ;  
    }
    
    public static Polygon getArrow(double x , double y){
        Polygon triangle = new Polygon();
        double TX = x-5;
        double TY = y-5;
        double BY=y+5;
           triangle.getPoints().addAll(new Double[]{
            TX, TY,
           (double)x,(double)y ,
            TX , BY});
           
   return triangle;
    }
}
