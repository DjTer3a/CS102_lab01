import java.util.Arrays;
import java.util.Scanner;
import java.util.*; 

public class IntBag {
    int[] bag;
    
    public IntBag(){
        bag =new int[4];
    }

    public void addNumber(int Number){
       this.bag[bag.length-1]=(Number);
    }

    public void addNumber(int Number,int index){
        int lastIdx = bag.length-1;
        if(bag[lastIdx]<0)
        {
        int[] temp =new int[bag.length];
        int lengthOfArray = bag.length + temp.length;
        int[] arrayMerged = new int[lengthOfArray];
        int idx = 0;  
        for (int element : bag)
        {  
        arrayMerged[idx] = element;  
        idx++;               
        }  
        for (int element : temp)
        {  
            arrayMerged[idx] = element;  
            idx++;  
            }  
        }
        else{
            
        }
    }





    public static void main (String args[]) {
        IntBag bag = new IntBag();
        bag.addNumber(1);
        bag.addNumber(2);
        System.out.println(bag);

    }




}