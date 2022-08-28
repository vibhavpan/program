package myfirst;

import java.util.TreeSet;
import java.util.List;
import java.util.Collection;
import java.util.SortedSet;

public class MyFirst<T>
{
   public static class Point implements Comparable
   {
       int x;
       int y;
       
       public Point(int x,int y)
       {
           this.x=x;
           this.y=y;
       }
       
       @Override
       
       public String toString()
       {
           return " x= "+x+" y= "+y;
           
       }
       @Override
       
       public int compareTo(Object o)
       {
           Point p=(Point) o;
           
           //if second point's x's value is greater then return -1
           if(this.x<p.x)
               return -1;
           
           // if second point's x's value is lesser then return 1
           if(this.x>p.x)
               return 1;
           
           //if second point's x's value equal then check for y
           else
           {
               //if second point's y's value is greater then return -1
           if(this.x<p.x)
               return -1;
           
           // if second point's y's value is lesser then return 1
           if(this.x>p.x)
               return 1;
           
           //if second point's y's value equal then check for y
           else
               return 0;
           }
       }
       
   }
    public static void main(String []args)
    {
        TreeSet<Point> ts=new TreeSet<>();
        
        ts.add(new Point(1,2));
        ts.add(new Point(2,2));
        ts.add(new Point(1,2));
        ts.add(new Point(3,3));
        
        System.out.println(ts);
    }
    
}


        
