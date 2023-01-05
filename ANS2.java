public class Hello
{
    public static void main(String[] args){
        int even=0;
        int odd=0;
        for(int i=1;i<=100;i++)
        {
            even=even+i;
        }
        else
        {
            odd=odd+i;
        }
    }
    System.out.println("Sum of even elements = "+even);
    System.out.println("Sum of odd elements = "+odd);
}