package Nina_Mujezinovic;

public class Odd_Even_Numbers {

    public static void Odd_Even_Numbers(int number) {
        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");

        }
    }

    public static void main(String[] args) {
        Odd_Even_Numbers(10);
    }
}