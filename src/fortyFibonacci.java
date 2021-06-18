/**
 * Lab01 Instructions found on moodle
 * 
 * Style guidlines URL:-
 * http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm
 * 
 * 
 * @author Mostafa Higazy
 * @version 18/06/2021
 */
public class fortyFibonacci {
    
    
    //Main program to print first forty fibonacci numbers.
    public static void main (String [] args) {
        int temp =0;
        int temp1 =1;
        int result;
        IntBag bag = null;
        bag = new IntBag(41);
        System.out.println("The first 40 fibonnaci numbers are as follows :- ");
        

        //for loop to print the fibonnaci numbers
        for(int i =2; i<40; i++){


            //changing temp to fit the fibonacci formula.
            result = temp+temp1;
            temp=temp1;
            temp1=result;
            bag.add(result,i-2);
            
        }
        System.out.println("0 , " + bag.toString());
    }
}
