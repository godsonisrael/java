package perimeterassign;

import edu.duke.*;
import java.io.*;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        int total = 0 ;
        for(Point curr : s.getPoints())
        {
            total = total +1;
        }
        
        return total;
    }

    public double getAverageLength(Shape s) {
        double average = (getPerimeter(s)/getNumPoints(s));
        
        return average;
    }

    public double getLargestSide(Shape s) {
        double large = 0.0;
        Point prevPt = s.getLastPoint();
        
        for(Point curr : s.getPoints()){
            
         double currDist = prevPt.distance(curr); 
         
         if(currDist > large){   
            large = currDist;
            }   
            
        }
        
        return large;
    }

    public double getLargestX(Shape s) {
        // Put code here
        double large = 0.0;
        
        for(Point curr : s.getPoints()){
            
         double currX = curr.getX();
         if(currX > large){   
            large = currX;
            }   
            
        }
        
        return large;
    }

    
    public double getLargestPerimeterMultipleFiles() {
        DirectoryResource dr = new DirectoryResource();
        double large = 0.0;
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            
            double largePerim = getPerimeter(s);
            
            if(largePerim > large){
            large = largePerim ; 
            
        }
        
           
      }
      return large;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;    
        DirectoryResource dr = new DirectoryResource();
        double large = 0.0;
        
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double largePerim = getPerimeter(s);
            
            if(largePerim > large ){
              temp = f ;  
            }
          
      }
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        int totalPoints= getNumPoints(s);
        double AverageLength = getAverageLength(s);
        double largestSide = getLargestSide(s);
        double largestX = getLargestX(s);
        
        System.out.println("perimeter = " + length);
        System.out.println("Total points = " + totalPoints);
        System.out.println("The Average = " + AverageLength );
        System.out.println("The largest Side = " + largestSide );
        System.out.println("The largest X= " + largestX );
    }
    
    public void testPerimeterMultipleFiles() {
        // Put code here
        double largestPerimeter = getLargestPerimeterMultipleFiles();
         System.out.println("Largest Perimeter among Multiple Files = " + largestPerimeter);
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
         String largestPerimeterFileName =getFileWithLargestPerimeter();
         System.out.println("Largest PerimeterFile Name = " + largestPerimeterFileName);
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}
