
public class IntBagTest{
    public static void main(String args[]){
        IntBag test = new IntBag();
        System.out.println(test.toString());


        IntBag test2 = new IntBag(10);
        System.out.println(test2.toString());

        test2.add(1);
        System.out.println(test2.toString());
        test2.add(2);
        System.out.println(test2.toString());
        test2.add(3);
        System.out.println(test2.toString());
        test2.add(4);
        System.out.println(test2.toString());
        test2.add(5);
        System.out.println(test2.toString());
        test2.add(6);
        System.out.println(test2.toString());
        test2.add(7);
        System.out.println(test2.toString());
        test2.add(2);
        System.out.println(test2.toString());
        test2.add(2);
        System.out.println(test2.toString());


        test.add(1,0);
        System.out.println(test.toString());
        test.add(2,1);
        System.out.println(test.toString());
        test.add(3,2);
        System.out.println(test.toString());
        test.add(4,3);
        System.out.println(test.toString());
        test.add(5,4);
        System.out.println(test.toString());
        test.add(6,5);
        System.out.println(test.toString());
        test.add(7,6);
        System.out.println(test.toString());
        test2.add(2,8);
        System.out.println(test.toString());
        test2.add(2,9);
        test.remove(0);
        System.out.println(test.toString());
        

        

        


    }
}
