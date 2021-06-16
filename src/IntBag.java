/**
 * Design and implement a class, IntBag, that allows a variable-sized collection of non-negative 
 * integer values to be stored. Your class should have a single property, an int array called this.bag that will hold the values of the collection. 
 * The values themselves must be stored contiguously starting from the beginning of the array. The last value is followed by a negative (sentinel) value. 
 * The class should have one constructor which creates an empty collection (with room for up to 4 values). 
 * 
 * Provide methods to add a value to the end of the collection and to add a value at a particular index location i within it 
 * (moving other values "up" to make room, after checking i is within bounds). If there is no room for another value, the array should expand so that its size is doubled. 
 * 
 * Also, write methods to remove the value at a given index (placing the last element of the array into that index) 
 * and another to test whether the collection contains a given value or not. Provide a toString method that returns a String representation of the collection, 
 * a method, size, that returns the number of values currently in the collection, 
 * and finally, a method that will allow you to get the value at location i within the collection.
 */




public class IntBag {
    int[] bag;

    public IntBag(){
        this.bag = new int[5];
        this.bag[this.bag.length-1]=-999;
    }

    public IntBag(int arrayLength){
        this.bag = new int[arrayLength];
        this.bag[this.bag.length-1]=-999;
    }

    public int arraySize(int[] bag){
        int arraySize=0;
        for(int i=0; i<this.bag.length;i++)
        {
            if(this.bag[i]<0){
                arraySize+=i;
            }
            else
            {
                i=this.bag.length;
            }
        }
        return arraySize;
    }

    public int[] add(int Number){
        if(this.bag[this.bag.length-1]<0)
        {
            int temp[];
            temp = new int[(this.bag.length-1)*2];
            for(int i=0; i<this.bag.length;i++){
                temp[i]=this.bag[i];
            }
            temp[this.bag.length] = Number;
            temp[this.bag.length+1] = -999;
            this.bag = temp;
        }
        else{
            for(int i=0; i<this.bag.length;i++){
                if(i==this.bag.length-2 && this.bag[this.bag.length-1]<0){
                    this.bag[i]= Number;
                    this.bag[this.bag.length-1]=-999;
                }
                else{
                    this.bag[i]=bag[i];
                }
            }
        }
        return this.bag;
    }

    public int[] add(int Number, int Idx){

        int temp[];
        int temp2[];
        temp = new int[(this.bag.length-1)*2];
        temp2 = new int[(this.bag.length-1)*2];

        if(this.bag[this.bag.length-1]<0 && Idx<bag.length)
        {
            for(int i=0; i<this.bag.length;i++){
                temp[i]=this.bag[i];
            }
            for(int j=Idx; j<this.bag.length;j++){
                temp[j] = temp2[j+1];
            }
            temp2[Idx] = Number;
            
            temp2[this.bag.length+1] = -999;
            this.bag = temp2;
        }
        else if(Idx<bag.length){
            for(int i=0; i<this.bag.length;i++){
                if(i==this.bag.length-2 && this.bag[this.bag.length-1]<0){

                    for(int z=0; i<this.bag.length;z++){
                        temp[z]=this.bag[z];
                    }
                    for(int j=Idx; j<this.bag.length;j++){
                        temp[j] = temp2[j+1];
                    }
                    temp2[Idx] = Number;
                    
                    temp2[this.bag.length+1] = -999;
                    this.bag = temp2;
                }
                else{
                    this.bag[i]=bag[i];
                }
            }
        }
        else if (Idx>=bag.length){
            for(int i=0; i<this.bag.length;i++){
                temp[i]=this.bag[i];
            }
            for(int j=Idx; j<this.bag.length;j++){
                temp[j] = temp2[j+1];
            }
            
            temp2[this.bag.length+1] = -999;
            this.bag = temp2;
            add(Number, Idx);
        }

        else{
            System.out.println("Enter the correct parameters!!!!");
        }

        return this.bag;
    }

    public void remove(int idx){
        int lastIdx=0;
        if(this.bag.length>1){
            for(int i = this.bag.length-1; i>0; i--){
                if(i<0){
                lastIdx=i;
                i=this.bag.length;
                }
                else{
                    lastIdx=0;
                }
            }
            this.bag[idx]=this.bag[lastIdx-1];
            this.bag[lastIdx-1]=-999;
            this.bag[lastIdx]=0;
        }
        else{
            System.out.println("Array length can't be 1!!!");
        }    
    }

    public void removeAll(int nums){
        int idxToRemove;
        int count =1;
        for(int i=0; i<this.bag.length; i++)
        {
            if(this.bag[i]==nums){
                idxToRemove=i;
                for(int j=idxToRemove; j<this.bag.length;j++)
                {
                    this.bag[i]=this.bag[j+1];
                    count++;  
                }
                this.bag[this.bag.length-count]=0;
            }
            else{
                System.out.println("Error index out of bounds or not found!!!");
            }
        }
        
    }

    public int getIdx(int Index){
        return this.bag[Index];
    }



    public String toString(){
        String output = "";

        for(int i =0; i < this.bag.length; i++){
            output += this.bag[i]+ " , "; 
        }
        return output;
    }


}
