public class IntBag {
    int[] bag;

    public IntBag(){
        this.bag = new int[4];
        this.bag[bag.length-1] = -999;
    }

    public IntBag(int arrayLength){
        this.bag = new int[arrayLength];
        this.bag[bag.length-1] = -999;
    }

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
            System.out.println("Enter the correct parameters!!!!");
        }
    }

    public void remove(int idx){

        bag[idx] = bag[arraySize()-1];
        bag[arraySize()-1] = -999;
           
    }

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

    public int getIdx(int Index){
        return this.bag[Index];
    }



    public String toString(){
        String output = "";

        for(int i =0; i < this.bag.length; i++){
            if (i==this.bag.length-1){
                output+= this.bag[i];
            }
            else{
                output += this.bag[i]+ " , "; 
            }
        }
        return output;
    }


}