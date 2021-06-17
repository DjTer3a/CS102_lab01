import java.util.*;

public class IntBagMenu {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        IntBag test = null;
        int choice;

        do{
            System.out.println("1 Create a new empty collection(any previous values are lost!)");
            System.out.println("2 Read a set of positive values into the collection (use zero to indicate all the values have been entered2)");
            System.out.println("3 Print the collection of values.");
            System.out.println("4 Add a value to the collection of values at a specified location");
            System.out.println("5 Remove the value at a specified location from the collection of values");
            System.out.println("6 Remove all instances of a value within the collection");
            System.out.println("7 Quit the program.");
            choice = scan.nextInt();

            if(choice == 1){
                test= new IntBag(4);
            }
            else if(choice == 2){
                int number = scan.nextInt();

                while(number != 0){
                    if (number <0){
                        System.out.println("Negative integers not accepted");
                        number = 0;
                    }
                    else
                        test.add(number);
                        number = scan.nextInt();
                    }
                }
            else if(choice == 3){
                System.out.println(test);
            }
            else if(choice ==4){
                System.out.println("Enter Number :- ");
                int number =scan.nextInt();
                if(number<0){
                    System.out.println("Negative integers not accepted");
                }
                else{
                    System.out.println("Enter Index :- ");
                    int idx = scan.nextInt();
                    test.add(number,idx);
                    System.out.println(test.toString());
                }
            }
            else if(choice ==5){
                System.out.println("Enter Index :- ");
                int idx = scan.nextInt();
                test.remove(idx);
                System.out.println(test.toString());
            }
            else if(choice ==6){
                System.out.println("Enter the number you want to delete :- ");
                int nums = scan.nextInt();
                
                test.removeAll(nums);
                System.out.println(test.toString());
            }
        }
        while(choice !=7);
        System.out.println("Have a good day and thanks for using this program!!!");

    }
}
