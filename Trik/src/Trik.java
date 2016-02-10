import java.util.Scanner;

public class Trik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left=1,centor=0,right=0,temp,i;
		String swap;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Value : ");
		swap = scan.next();
		for(i=0;i<swap.length();i++){
		if(swap.charAt(i) == 'A' || swap.charAt(i) == 'a')
		{
			temp=left;
			left=centor;
			centor=temp;
		}
			else if(swap.charAt(i) == 'B' || swap.charAt(i) == 'b')
				{
					temp=centor;
					centor=right;
					right=temp;
				}
			else
				{
					temp=left;
					left=right;
					right=temp;
				}
		}
		
		if(left == 1) 
			System.out.println("Coin  in Left glass");
			else if(centor == 1) 
				System.out.println("Coin  in Centor glass");
				else 
					System.out.println("Coin  in Right glass");
	}

}
