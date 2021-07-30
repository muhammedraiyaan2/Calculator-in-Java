import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the calculator");
    System.out.println("Enter the first number");
    Scanner inpu=new Scanner(System.in);
    int input=inpu.nextInt();
    System.out.println("Enter the second number");
        Scanner inpu2=new Scanner(System.in);
    int input2=inpu2.nextInt();
    System.out.print("The sum of number is ");
    System.out.println(input+input2);
    System.out.print("The subratation of number is ");
    System.out.println(input-input2);
    System.out.println("The multiplcation of the two number is "+input*input2);
    System.out.println("The division of two number is "+ input/input2);
  }
}
