import java.util.Scanner;

public class Kornislav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,num4,temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input num1 : ");
		num1=scan.nextInt();
		System.out.print("Input num2 : ");
		num2=scan.nextInt();
		System.out.print("Input num3 : ");
		num3=scan.nextInt();
		System.out.print("Input num4 : ");
		num4=scan.nextInt();
		if(num1>num2)
		{
			temp=num1;
			num1=num2;
			num2=temp;
		}
		if(num1>num3)
		{
			temp=num1;
			num1=num3;
			num3=temp;
		}
		if(num1>num4)
		{
			temp=num1;
			num1=num4;
			num4=temp;
		}
		if(num2>num3)
		{
			temp=num2;
			num2=num3;
			num3=temp;
		}
		if(num2>num4)
		{
			temp=num2;
			num2=num4;
			num4=temp;
		}
		if(num3>num4)
		{
			temp=num3;
			num3=num4;
			num4=temp;
		}
		System.out.print("\n Area = : "+""+num3+""+" * "+num1+" = "+num3*num1);
	}

}
