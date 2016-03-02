import java.util.Scanner;
public class Encode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;
		char c;
		int i=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter text : ");
		str1=scan.nextLine();
		str2=str1.toUpperCase();
		for(i=str2.length()-1;i>=0;i--)
		{
		c=str2.charAt(i);
		if(c=='R'){
		c='E';
		}
		else if(c=='W'){
		c='R';
		}
		else if(c=='E'){
		c='W';
		}
		System.out.print(c);
		}
		}
		}