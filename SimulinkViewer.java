package Project;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
public class SimulinkViewer extends Stage {
  
    public SimulinkViewer()  { 
       Block block1 = readMDLfile.block[0]; //ADD
       Block block2 = readMDLfile.block[2]; //Sat
       Block block3 = readMDLfile.block[1]; //Constant
       Block block4 = readMDLfile.block[3]; // scope
       Block block5 = readMDLfile.block[4]; // delay
       
      Pane pane = new Pane();
      block1.setBranchX((int)readMDLfile.points[1].getX());
      block1.setBranchY((int)readMDLfile.points[1].getY());
      block2.setBranchX((int)readMDLfile.points[0].getX());
      block2.setBranchY((int)readMDLfile.points[0].getY());
      
       //readMDLfile.points[0].Print();
     ////////// BLOCK CONTENTS ///////////////////
      
      Label labelConst = new Label("1");
      labelConst.setLayoutX(block3.getleftTopX()+10);
      labelConst.setLayoutY(block3.getleftTopY()+5);
      
      Label labelDelay1 = new Label("1");
      labelDelay1.setLayoutX(block5.getleftTopX()+13);
      labelDelay1.setLayoutY(block5.getleftTopY());
      
      Label labelDelay2 = new Label("__");
      labelDelay2.setLayoutX(block5.getleftTopX()+12);
      labelDelay2.setLayoutY(block5.getleftTopY()+5);
      
      Label labelDelay3 = new Label("z");
      labelDelay3.setLayoutX(block5.getleftTopX()+14);
      labelDelay3.setLayoutY(block5.getleftTopY()+17);
      
       
       Rectangle scopeContent = new Rectangle();
       scopeContent.setLayoutX(block4.getleftTopX()+5);
       scopeContent.setLayoutY(block4.getleftTopY()+5);
       scopeContent.setHeight(12);
       scopeContent.setWidth(20);
       scopeContent.setArcHeight(6);
       scopeContent.setArcWidth(6);
       scopeContent.setFill(Color.WHITE);
       scopeContent.setStroke(Color.BLACK);
       
       
       Line add1 = new Line(block1.getEndPointX()+5,block1.getEndPointY(),block1.getEndPointX()+10,block1.getEndPointY());
       Line add2 = new Line(block1.getEndPointX()+7.5,block1.getEndPointY()-2.5,block1.getEndPointX()+7.5,block1.getEndPointY()+2.5);
       
       Line add3 = new Line(block1.getEndPointX()+5,block1.getEndPointY()+10,block1.getEndPointX()+10,block1.getEndPointY()+10);
       Line add4 = new Line(block1.getEndPointX()+7.5,block1.getEndPointY()+7.5,block1.getEndPointX()+7.5,block1.getEndPointY()+12.5);
       
       Line add5 = new Line(block1.getEndPointX()+5,block1.getEndPointY()+20,block1.getEndPointX()+10,block1.getEndPointY()+20);
       Line add6 = new Line(block1.getEndPointX()+7.5,block1.getEndPointY()+17.5,block1.getEndPointX()+7.5,block1.getEndPointY()+22.5);
       
        Line vertical = new Line (block2.getleftTopX()+block2.getWidth()/2 ,block2.getleftTopY()+3 ,block2.getleftTopX()
                +block2.getWidth()/2 ,block2.getleftTopY()-3 +block2.getLength());
         Line horizontal = new Line (block2.getleftTopX()+3 ,block2.getleftTopY()
                 +block2.getLength()/2 ,block2.getleftTopX()+block2.getWidth()-3 
                 , block2.getleftTopY()+block2.getLength()/2);
         vertical.setStrokeWidth(0.2);
         horizontal.setStrokeWidth(0.2);
         
         Line func = new Line((block2.getleftTopX()+block2.getWidth()/2)+3,
         block2.getleftTopY()+6,
         (block2.getleftTopX()+block2.getWidth()/2)-3,
         block2.getleftTopY()-6+block2.getLength());
            
         Line NR = new Line ((block2.getleftTopX()+block2.getWidth()/2)+3, 
        block2.getleftTopY()+6,
          (block2.getleftTopX()+block2.getWidth()/2)+10,
         block2.getleftTopY()+6);
          
         Line NL = new Line((block2.getleftTopX()+block2.getWidth()/2)-3,
         block2.getleftTopY()-6+block2.getLength(),
         (block2.getleftTopX()+block2.getWidth()/2)-9,
         block2.getleftTopY()-6+block2.getLength());
         
         func.setStrokeWidth(0.3);
         NL.setStrokeWidth(0.3);
         NR.setStrokeWidth(0.3);

   
       
     ///////////////  BLOCK NAMES  /////////////////
       Label add = new Label("Add");
       add.setLayoutX(block1.getleftTopX()+5);
       add.setLayoutY(block1.getleftTopY()+block1.getLength()+5);
       add.setTextFill(Color.SKYBLUE);
       
       Label sat = new Label("Saturation");
       sat.setLayoutX(block2.getleftTopX()-10);
       sat.setLayoutY(block2.getleftTopY()+block2.getLength()+5);
       sat.setTextFill(Color.SKYBLUE);
       
       Label constant = new Label("Constant");
       constant.setLayoutX(block3.getleftTopX()-7);
       constant.setLayoutY(block3.getleftTopY()+block3.getLength()+5);
       constant.setTextFill(Color.SKYBLUE);
       
       Label scope = new Label("Scope");
       scope.setLayoutX(block4.getleftTopX()-2);
       scope.setLayoutY(block4.getleftTopY()+block4.getLength()+5);
       scope.setTextFill(Color.SKYBLUE);
       
       Label delay = new Label("Unit Delay");
       delay.setLayoutX(block5.getleftTopX()-10);
       delay.setLayoutY(block5.getleftTopY()+block5.getLength()+5);
       delay.setTextFill(Color.SKYBLUE);
       /////////////////// ARROWS  ////////////////////
       Polygon arrow1 = Block.getArrow(block2.getEndPointX(), block2.getEndPointY());
       Polygon arrow2 = Block.getArrow(block1.getEndPointX(), block1.getEndPointY());
       Polygon arrow3 = Block.getArrow(block4.getEndPointX(), block4.getEndPointY());
      
       
       //////////////////////BRANCHES/////////////////////
       Line satBranch1 = new Line(block2.getStartPointX()+block2.getBranchX(),
       block2.getStartPointY(),block2.getStartPointX()+block2.getBranchX(),
       block2.getStartPointY()+block2.getBranchY());
       satBranch1.setStroke(Color.BLACK);
       satBranch1.setFill(Color.BLACK);
       
       Line satBranch2 = new Line(block2.getStartPointX()+block2.getBranchX(),
       block2.getStartPointY()+block2.getBranchY(),
       block2.getStartPointX()+block2.getBranchX()+31,block2.getStartPointY()+block2.getBranchY());
       satBranch2.setStroke(Color.BLACK);
       satBranch2.setFill(Color.BLACK);
       Polygon arrow4 = Block.getArrow(block2.getStartPointX()+block2.getBranchX()+31
               ,block2.getStartPointY()+block2.getBranchY());
       
       Line addBranch1 = new Line(block1.getStartPointX()+block1.getBranchX(),
    block1.getStartPointY(),block1.getStartPointX()+block1.getBranchX(),
       block1.getStartPointY()+block1.getBranchY());
       addBranch1.setStroke(Color.BLACK);
       addBranch1.setFill(Color.BLACK);
        
        Line addBranch2 = new Line(block1.getStartPointX()+block1.getBranchX(),
        block1.getStartPointY()+block1.getBranchY(),block1.getStartPointX()+block1.getBranchX()-34
                , block1.getStartPointY()+block1.getBranchY());
        addBranch2.setStroke(Color.BLACK);
        addBranch2.setFill(Color.BLACK);
        Polygon arrow5 = Block.getArrow(block1.getStartPointX()+block1.getBranchX()-30
                , block1.getStartPointY()+block1.getBranchY());
        arrow5.setRotate(180);
         
        Line delayBranch1 = new Line(block5.getStartPointX(),
       block5.getStartPointY(),block5.getStartPointX()-8,
       block1.getStartPointY()+block1.getBranchY());
       delayBranch1.setStroke(Color.BLACK);
       delayBranch1.setFill(Color.BLACK);
       
       Line delayBranch2 = new Line(block5.getStartPointX()-8,
       block1.getStartPointY()+block1.getBranchY(),
       block5.getStartPointX()-8,block1.getStartPointY()+block1.getBranchY()-65);
       delayBranch2.setStroke(Color.BLACK);
       delayBranch2.setFill(Color.BLACK); 
       
       Line delayBranch3 = new Line( block5.getStartPointX()-8,
       block1.getStartPointY()+block1.getBranchY()-65,
       block5.getStartPointX()-8+7 ,
       block1.getStartPointY()+block1.getBranchY()-65);
       delayBranch3.setStroke(Color.BLACK);
       delayBranch3.setFill(Color.BLACK);
       Polygon arrow6 = Block.getArrow(block5.getStartPointX() ,
       block1.getStartPointY()+block1.getBranchY()-65);
       ////////////////////// LINES ////////////////////////////
       Line l1 = new Line(block3.getStartPointX(),block3.getStartPointY(),block2.getEndPointX(),block2.getEndPointY());
       l1.setStroke(Color.BLACK);
       l1.setFill(Color.BLACK);
       
       
       
       Line l2 = new Line(block2.getStartPointX(),block2.getStartPointY(),block1.getEndPointX(),block1.getEndPointY());
       l2.setStroke(Color.BLACK);
       l2.setFill(Color.BLACK);
       
       Line l3 = new Line(block1.getStartPointX(),block1.getStartPointY(),block4.getEndPointX(),block4.getEndPointY());
       l3.setStroke(Color.BLACK);
       l3.setFill(Color.BLACK);
       
     
      
       
       //////////////////////// BLOCK SHAPES /////////////////////
       Rectangle rect1 = new Rectangle();
       rect1.setHeight(block1.getLength());
       rect1.setWidth(block1.getWidth());
       rect1.setFill(Color.WHITE);
       rect1.setStroke(Color.BLACK);
      
       rect1.setLayoutX(block1.getleftTopX());
       rect1.setLayoutY(block1.getleftTopY());
       
       Rectangle rect2 = new Rectangle();
       rect2.setHeight(block2.getLength());
       rect2.setWidth(block2.getWidth());
       rect2.setFill(Color.WHITE);
       rect2.setStroke(Color.BLACK);
      
       rect2.setLayoutX(block2.getleftTopX());
       rect2.setLayoutY(block2.getleftTopY());
       
       Rectangle rect3 = new Rectangle();
       rect3.setHeight(block3.getLength());
       rect3.setWidth(block3.getWidth());
       rect3.setFill(Color.WHITE);
       rect3.setStroke(Color.BLACK);
      
       rect3.setLayoutX(block3.getleftTopX());
       rect3.setLayoutY(block3.getleftTopY());
       
       Rectangle rect4 = new Rectangle();
       rect4.setHeight(block4.getLength());
       rect4.setWidth(block4.getWidth());
       rect4.setFill(Color.WHITE);
       rect4.setStroke(Color.BLACK);
      
       rect4.setLayoutX(block4.getleftTopX());
       rect4.setLayoutY(block4.getleftTopY());
       
       Rectangle rect5 = new Rectangle();
       rect5.setHeight(block5.getLength());
       rect5.setWidth(block5.getWidth());
       rect5.setFill(Color.WHITE);
       rect5.setStroke(Color.BLACK);
      
       rect5.setLayoutX(block5.getleftTopX());
       rect5.setLayoutY(block5.getleftTopY());
       
         
       pane.getChildren().addAll(rect1,rect2,rect3,rect4,rect5,l1,l2,l3,arrow1,arrow2,arrow3);
       pane.getChildren().addAll(add,sat,constant,scope,delay);
       pane.getChildren().addAll(labelConst,labelDelay1,labelDelay2,labelDelay3);
       pane.getChildren().addAll(scopeContent);
       pane.getChildren().addAll(add1,add2);
       pane.getChildren().addAll(add3,add4);
       pane.getChildren().addAll(add5,add6);
       pane.getChildren().addAll(horizontal,vertical,func,NR,NL);
       pane.getChildren().addAll(satBranch1,satBranch2,arrow4);
       pane.getChildren().addAll(addBranch1,addBranch2,arrow5);
       pane.getChildren().addAll(delayBranch1,delayBranch2,delayBranch3,arrow6);
       
      Scene scene=new Scene(pane, 1920, 900);
      this.setScene(scene);
      this.getIcons().add(new Image("Project/Images/Icon.png"));
    
      this.show();
       
    }

   
  
}



 
     


    
    
    
    
    
    

