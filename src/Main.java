import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner deger=new Scanner(System.in);
        int sayi=deger.nextInt();
        int basla =sayi;

for(int i=0;i<sayi;i++)
{ for(int j=0;j<=i;j++)
{

    System.out.print("*");


}

    System.out.println();

}

for(int i=sayi+1;i>0;i--)
{

    for (int j=0;j<i;j++)
    {
        System.out.print("*");


    }
    System.out.println();

}










    }
}