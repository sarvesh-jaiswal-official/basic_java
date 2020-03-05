public class Test5
{
  public static void main(String args[])
  {
    Integer num1 = 100;
    Integer num2 = 100;
    Integer num3 = 500;
    Integer num4 = 500;

    if(num1==num2) //Execute
      System.out.println("num1 == num2");
    else
      System.out.println("num1 != num2");
    if(num3==num4) //Not Execute bcoz Integer has range -128 to 127
      System.out.println("num3 == num4");
    else
      System.out.println("num3 != num4"); // Execute
  }
}
