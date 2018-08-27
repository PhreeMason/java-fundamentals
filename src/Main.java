public class Main {

    public static void main(String[] args) {
    // write your code here
        System.out.println("Hello World");
        int myNumber;
        myNumber = 100;
        int myOtherNumber = myNumber;
        float lastNumber = 14;
        System.out.println(myNumber);
        System.out.println(myOtherNumber);
        System.out.println(lastNumber);
        myNumber++;

        if (lastNumber < myNumber) {
            System.out.println("the bigger number is:");
            System.out.println(myNumber);
        } else {
            System.out.println("the bigger number is:");
            System.out.println(lastNumber);
        }
    }
}
