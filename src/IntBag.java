

public class IntBag {
    int[] bag;

    public int sizeOfArray(){
        int size =0;
        boolean outOfBounds = false;
        while(size<bag.length && !outOfBounds ){
            if(bag[size] == -999){
                outOfBounds =false;
                size++;
            }
            else{
                outOfBounds =true;
            }  
        }
        return size;
    }
    
    public IntBag(){
        bag =new int[4];
        bag[0]=-999;
    }

    public IntBag(int lengthOfArray){
        bag = new int[lengthOfArray];
        bag[0]=-999;
    }

    public void removeNumber(int removalIndex){
        for(int i = removalIndex; i < sizeOfArray();i++)
        {
            bag[i]=bag[i+1];
        }
        bag[sizeOfArray()] = 0;
    }

    public void addNumber(int Number){
        int arraySize = sizeOfArray();

        if(arraySize < bag.length-1){
            bag[arraySize] = Number;
            bag[arraySize+1] = -999;
        }

        else if(arraySize == bag.length-1)
        {
            bag[arraySize] = Number;
        }

        else{
            int bigBag [] = new int[arraySize*2];
            for(int i = 0;i<bag.length;i++){
                bigBag[i] = bag[i];
            }
            bag = bigBag;
            bag[arraySize] = Number;
            bag[arraySize+1] = -999;
        }
    }

    public void addNumber(int Number,int index){
        int arraySize = sizeOfArray();
        if(index < sizeOfArray()){
            for(int i =bag.length-2; i>=index;i--){
                bag[i+1]=bag[i];
            }
            bag[index] = Number;
        }
        else{
            int bigBag [] = new int[arraySize*2];
            for(int i = 0;i<bag.length;i++){
                bigBag[i] = bag[i];
            }
            bag = bigBag;
            for(int i =bag.length-2; i>=index;i--){
                bag[i+1]=bag[i];
            }
            bag[index] = Number;
            bag[arraySize+1] = -999;
        }

    }

    public int getIdx(int Idx){
        return bag[Idx];
    }

    public void removeAllNumbers (int nums){
        int removed = 0;
        
        for (int i = 0; i<sizeOfArray();){
            if(bag[i] == nums){
                removeNumber(i);
                removed++;
            }
            else{
                i++;
            }
            if (removed==0){
                System.out.println("Number not in the bag");
            }
        }
    }

    public String toString(){
        String stringArray ="";
        boolean stopLooping = false;
        for(int i =0; i <= bag.length-1 && !stopLooping;i++){
            if(getIdx(i) != -999){
                stringArray += bag[i]+" , ";
                
            }
            else
            {
                stopLooping =true;
            }
        }
        return stringArray;
    }





    public static void main (String args[]) {
        IntBag bag = new IntBag();
        bag.addNumber(1);
        bag.addNumber(2);
        bag.addNumber(2);
        bag.addNumber(2);
        bag.addNumber(2);
        bag.addNumber(2);
        System.out.println(bag.toString());

    }




}