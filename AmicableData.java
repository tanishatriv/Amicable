import java.io.*;
import java.util.*;
public class AmicableData
{
	public static void main(String[] args)
	{
		File name = new File("Amicable.txt");
		ArrayList<String> numbers = new ArrayList<String>();
		ArrayList<Integer> integers = new ArrayList<Integer>();
		try
		{
			BufferedReader input = new BufferedReader(new FileReader(name));
			String text,output="";
			while((text=input.readLine())!= null)
			{
				output+=text +"\n";
				String[] arr = text.split(" ");
				numbers.add(arr[0]);
				numbers.add(arr[1]);
			}
			for(int i = 0; i < numbers.size(); i++)
			{
				String s = numbers.get(i);
				int str = Integer.valueOf(s);
				integers.add(str);
			}

			int s1 = 0;
			int s2 = 0;
			for (int i = 1; i <= integers.get(0); i++)
			{
				if(i != integers.get(0))
				{
					if(integers.get(0) % i == 0)
					{
						s1  = s1 + i;
					}
				}
			}
			System.out.println();
			for (int i = 1; i <= integers.get(1); i++)
			{
				if(i != integers.get(1))
				{
					if (integers.get(1) % i == 0)
					{
						s2 = s2 + i;
					}
				}
			}

			if((s1 == integers.get(1)) && (s2 == integers.get(0)))
			{
				System.out.println("\nThe numbers " + integers.get(0) + " and " + integers.get(1) + " are amicable.");
				System.out.print("Factors of " + integers.get(0) + " are ");
				for (int i = 1; i <= integers.get(0); i++)
				{
					if(i != integers.get(0))
					{
						if (integers.get(0) % i == 0)
						{
							System.out.print(i + " ");
						}
					}
				}
				System.out.print(". Sum is " + s1);
				System.out.println();

				System.out.print("Factors of " + integers.get(1) + " are ");
				for (int i = 1; i <= integers.get(1); i++)
				{
					if(i != integers.get(1))
					{
						if (integers.get(1) % i == 0)
						{
							System.out.print(i + " ");
						}
					}
				}
				System.out.print(". Sum is " + s2);
			}

			System.out.println();

			int s3 = 0;
			int s4 = 0;
			for (int i = 1; i <= integers.get(2); i++)
			{
				if(i != integers.get(2))
				{
					if(integers.get(2) % i == 0)
					{
						s3  = s3 + i;
					}
				}
			}
			System.out.println();
			for (int i = 1; i <= integers.get(3); i++)
			{
				if(i != integers.get(3))
				{
					if (integers.get(3) % i == 0)
					{
						s4 = s4 + i;
					}
				}
			}

			if((s3 != integers.get(2)) && (s4 != integers.get(3)))
			{
				System.out.println("\nThe numbers " + integers.get(2) + " and " + integers.get(3) + " are not amicable.");
				System.out.print("Factors of " + integers.get(2) + " are ");
				for (int i = 1; i <= integers.get(2); i++)
				{
					if(i != integers.get(2))
					{
						if (integers.get(2) % i == 0)
						{
							System.out.print(i + " ");
						}
					}
				}
				System.out.print(". Sum is " + s3);
				System.out.println();

				System.out.print("Factors of " + integers.get(3) + " are ");
				for (int i = 1; i <= integers.get(3); i++)
				{
					if(i != integers.get(3))
					{
						if (integers.get(3) % i == 0)
						{
							System.out.print(i + " ");
						}
					}
				}
				System.out.print(". Sum is " + s4);
			}

		}
		catch (IOException io)
		{
			System.err.println("Error reading file => "+io);
		}
	}
}


