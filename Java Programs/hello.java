import java.util.Scanner;
class hello
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Character :");
		char ch = input.next().charAt(0);			
		if(ch>='a' && ch<='z')
		{
			System.out.println("This is a Lowercase Alphabet");
		}
		else
		{
			System.out.println("This is a Uppercase Alphabet");
      
		}
      input.close();
	}
}