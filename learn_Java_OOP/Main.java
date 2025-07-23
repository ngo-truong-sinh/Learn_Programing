public class Main 
{
	int x = 2;
	
	public static void main(String[] args)
	{
		Main myObj1 = new Main();
		Main myObj2 = new Main();
		myObj1.x = 10;
		System.out.println(myObj2.x);
		System.out.println(myObj1.x);
	}
}

// 2
// 10