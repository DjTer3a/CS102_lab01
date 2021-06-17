import java.util.*;

public class IntBagTest{
    public static void main(String args[]){
        IntBag test = new IntBag(10);
        System.out.println(test.toString());
        Scanner scan = new Scanner(System.in);

        
        

        
        boolean check=true;
        do{
            System.out.println("Enter cos omak");
            int input = scan.nextInt();
            System.out.println("Enter cos abok");
            int index = scan.nextInt();
            test.add(input,index);
            System.out.println(test);
            if(input == 0 ){
                check = false;
            }
            else{
                check=true;
                System.out.println("Enter cos omak");
                input = scan.nextInt();
                System.out.println("Enter cos abok");
                index = scan.nextInt();
                test.add(input,index);
                System.out.println(test);
            }
        }
        while(check == true);
        System.out.println(test);
        
        boolean check2=true;
        do{
            test.remove(1);
            System.out.println(test);
            test.removeAll(2);
            System.out.println(test);
            check2=false;
        }
        while(check2 == true);

    }
}
