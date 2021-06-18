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


public class IntBag {
    int[] bag;

    //Empty Constructor
    public IntBag(){
        this.bag = new int[4];
        this.bag[bag.length-1] = -999;
    }

    //Constructor
    public IntBag(int arrayLength){
        this.bag = new int[arrayLength];
        this.bag[bag.length-1] = -999;
    }

    /**
     * method to return array of non-zero elements in the array.
     *  @return int arraySize    
     */
    public int arraySize(){
        int arraySize=0;
        boolean check=true;
        while(arraySize < bag.length && check){
            if(getIdx(arraySize) != -999){
                arraySize++;                
            }
            else{
                check =false;
            }
        }
        return arraySize;
}


    /**
     * method to add one element to the end of the array.
     *  @return void    
     */
    public void add(int Number){
        
        if(arraySize() < this.bag.length-1)
        {
            this.bag[arraySize()] = Number;
            this.bag[arraySize()-1] = -999;
        }
        else if (arraySize() >= bag.length-1){

            int temp[];
            temp = new int[this.bag.length*2];

            for(int i=0; i<this.bag.length;i++){

                temp[i]=this.bag[i];
            }
            this.bag = temp;
            this.bag[arraySize()] = Number;
            this.bag[arraySize()-1] = -999;
        }
        else{
            System.out.println("Error wrong input!!!");
        }
    }

    /**
     * method to add an element to an index in the array.
     *  @return void  
     */
    public void add(int Number, int Idx){

        if(Idx<bag.length)
        {
            
            for(int i = bag.length-2; i>=Idx; i--){
                this.bag[i+1]= this.bag[i];
            }

            this.bag[Idx] = Number;
            this.bag[arraySize()-1] = -999;
        }
        else{

            int temp[];
            temp = new int[this.bag.length*2];

            for(int i=0; i<this.bag.length;i++){

                temp[i]=this.bag[i];
            }
            this.bag = temp;
            this.bag[Idx] = Number;
            for(int i = bag.length-2; i>=Idx; i--){
                this.bag[i+1]= this.bag[i];
            }
            this.bag[arraySize()-1] = -999;
        }
    }

    /**
     * method to remove an element at an index in the array.
     *  @return void  
     */
    public void remove(int idx){

        bag[idx] = bag[arraySize()-1];
        bag[arraySize()-1] = -999;
           
    }

    /**
     * method to remove elements from the array.
     *  @return void  
     */
    public void removeAll(int nums){
        int counter = 0;
        for(int i=0; i<arraySize();)
        {
            if(this.bag[i]==nums){
                    remove(i);
                    counter++;  
            }
            else{
               i++;
            }
        }
         if (counter<1){
             System.out.println("Number not found in bag!!!");
         }
         else if (counter==1){
            System.out.println("Please use remove method instead!!!");
        }
    }

    /**
     * method to get element at an index in the array.
     *  @return void  
     */
    public int getIdx(int Index){
        return this.bag[Index];
    }


    /**
     * method to print the array as a String representation.
     *  @return String output
     */
    public String toString(){
        String output = "";

        for(int i =0; i < this.bag.length; i++){
            if (i==this.bag.length-1){
                if (this.bag[i] == -999){
                    output += "end";
                }
                else{
                output+= this.bag[i];
                }
            }
            else{
                if (this.bag[i] == -999 || this.bag[i] == 0 ){
                    output += "";
                }
                else{
                    output += this.bag[i]+ " , "; 
                }
                
            }
        }
        return output;
    }


}