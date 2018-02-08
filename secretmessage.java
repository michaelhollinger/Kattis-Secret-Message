import java.util.*;

public class secretmessage
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int numMessages = Integer.parseInt(stdin.nextLine());

		while(stdin.hasNextLine())
		{
			int counter = 0;
			String temp = stdin.nextLine();
			int len = temp.length();

			int arrLen = (int) Math.sqrt(len);
			char[] input = temp.toCharArray();

			while(arrLen*arrLen != len)
			{
				len++;
				arrLen = (int) Math.sqrt(len);
			}

			char[][] message = new char[arrLen][arrLen];
			
			for(int i = 0; i < arrLen; i++)
			{
				for(int j = 0; j < arrLen; j++)
				{
					if(counter < input.length)
					{
						message[i][j] = input[counter];
						counter++;
					}

					else
					{
						message[i][j] = '*';
					}
				}
			}
			
			String result = "";

			for(int i = 0; i < arrLen; i++)
			{
				for(int j = 0; j < arrLen; j++)
				{
					if(message[arrLen - j - 1][i] != '*')
					{
						result += message[arrLen - j - 1][i];
					}
				}
			}
			System.out.println(result);
		}
	}
}