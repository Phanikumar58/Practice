import java.util.Scanner;
class Concept
{
void add(int x, int y)
{
System.out.println("Sum of two numbers:" +(x+y));
}
void add(float x, float y)
{
System.out.println("Sum of two float numbers" +(x+y));
}
}
class MethodOverloading
{
public static void main(String args[])
{
Concept cp= new Concept();
Scanner sc= new Scanner(System.in);
System.out.println("Enter the interger numbers");
int a =sc.nextInt();
int b =sc.nextInt();
cp.add(a,b);
System.out.println("Enter the float numbers");
float p= sc.nextFloat();
float q =sc.nextFloat();
cp.add(p,q);

}
}
