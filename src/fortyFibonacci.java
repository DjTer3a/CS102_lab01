public class fortyFibonacci {
    public static void main (String [] args) {
        int temp =0;
        int temp1 =1;
        int result;
        System.out.println("The first 40 fibonnaci numbers are as follows fgdfgd:-");
        
        for(int i =2; i<40; i++){
            result = temp+temp1;
            temp=temp1;
            temp1=result;
            System.out.println(result);
        }
    }
}
