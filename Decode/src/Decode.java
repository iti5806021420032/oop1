import java.util.Scanner;
public class Decode {

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
		if(c=='E'){
		c='R';
		}
		else if(c=='R'){
		c='W';
		}
		else if(c=='W'){
		c='E';
		}
		System.out.print(c);
		}
		}
		}