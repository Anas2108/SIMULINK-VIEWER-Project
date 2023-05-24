package Project;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class readMDLfile {
          static Point[]points=new Point[3];
          static Block[] block = {new Block(),new Block(),new Block(),new Block(),new Block()};
        
          int data_counter=0;
          int obj_counter=0;
          private int blockCounter = 0;
          private int positionCounter = 0;
          private int pointCounter = 0;
          private int srcCounter = 0;
          private int destCounter = 0;
    public readMDLfile(String fileName) throws  IOException{
      
        File file =new File(fileName);
        FileInputStream input=new FileInputStream(file);
        int counter ;
        StringBuilder stringBuilder=new StringBuilder();
        
        while ((counter=input.read())!=-1){
        stringBuilder.append((char)counter); //to convert int to char 
        
        }
        String MDLdata=stringBuilder.toString();
       // System.out.println(MDLdata); for test 
        
        Scanner scanner =new Scanner(MDLdata);
       // ArrayList<Block>blocks
        while(scanner.hasNextLine()){
        String lineCheck =scanner.nextLine();
        
        if(lineCheck.contains("__MWOPC_PART_BEGIN__ /simulink/systems/system_root.xml")){
            
           while(scanner.hasNextLine()){
               
              lineCheck=scanner.nextLine();
              if(lineCheck.contains("<Block")){
               String Name= lineCheck.substring(lineCheck.indexOf("Name")+6, lineCheck.indexOf("SID")-2);    
                  block[blockCounter].setName(Name);
                //System.out.println("Block Name:"+Name);
                   
              String sid= lineCheck.substring(lineCheck.indexOf("SID")+5, lineCheck.indexOf(">")-1);
                int SID =Integer.parseInt(sid);
                // System.out.println("SID:"+SID);
                block[blockCounter].setSID(SID);
               blockCounter++;
              }
              
              if(lineCheck.contains("<P")){
                if(lineCheck.contains("Position")){
                    
                try{
                  String positionString = lineCheck.substring(lineCheck.indexOf("n")+3, lineCheck.indexOf("</P>"));
                 String[] coordinates = positionString.substring(1, positionString.length() - 1).split(", ");
                    int x1 = Integer.valueOf(coordinates[0]);
                    int y1 = Integer.valueOf(coordinates[1]);
                    int x2 = Integer.valueOf(coordinates[2]);
                    int y2 = Integer.valueOf(coordinates[3]); 
                block[positionCounter].setLeftTopX(x1);
                block[positionCounter].setLeftTopY(y1);
                block[positionCounter].setRightButtomX(x2);
                block[positionCounter].setRightButtomY(y2);
                // System.out.println("position["+x1+","+yl+","+x2+","+y2+"]");
                positionCounter++;
                
                }
               catch (NumberFormatException e) {}
                  
                }
                 

              }
                
                   
                
                 
                 if(lineCheck.contains("Src")){
                       String Src= lineCheck.substring(lineCheck.indexOf("\">")+2, lineCheck.indexOf("#")); 
                     //System.out.println("Src:"+Src);
                    }
                  if(lineCheck.contains("Dst")){
                       String Dst= lineCheck.substring(lineCheck.indexOf("\">")+2, lineCheck.indexOf("#")); 
                       
                       if(Dst.equals("4")||lineCheck.contains("in:2"))
                           continue;
                       //System.out.println("Dst:"+Dst);
                     
                    }
                
                 if(lineCheck.contains("Points")){
                   String Points= lineCheck.substring(lineCheck.indexOf("\">")+2, lineCheck.indexOf("</"));
                   String[] coordinates = Points.substring(1, Points.length() - 1).split(", ");
                  
                  
                   if(data_counter%2==0){
                      int x = Integer.valueOf(coordinates[0]);
                      points[obj_counter]=new Point(x, 0);
                      
                      
                   }
                   
                   else{
                    int y = Integer.valueOf(coordinates[1]);
                      points[obj_counter].setY(y);
                      obj_counter++;
                    
                 }
                   data_counter++;

           
                   
                     
                   
                   

                   
            }
                  
        }

        
    }
               
        
 }

    

 }
}