/*
Lesson _03
In this exercise, you will use for loops in order to print both even and odd numbers
The number of odd/even numbers will depend on the variable count.
If the value for count is 5, your exercise Result should look like the following:
Here are 5 even numbers:
2
4
6
8
10
Here are 5 odd numbers:
1
3
5
7
9
Good Luck Completing the exercise!
*/

/*
 * @author Surya
 */

public class Exercise_2
{
	public static void main(String[]args)
	{
		int count = 10;
		{
			{
				System.out.println("Here are 5 odd numbers:");
			}
			for(count =1; count<=9; count+=2)
			System.out.println(count);
		}
		{
			System.out.println();
			System.out.println("Here are 5 even numbers:");
		}
		for(count =2; count<=10;count+=2)
			System.out.println(count);
	}
}