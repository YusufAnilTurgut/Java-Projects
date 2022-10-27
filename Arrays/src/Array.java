
public class Array {

	public static void main(String[] args) 
	{
		int[] array = {32, 27, 64, 18, 95, 14, 90, 70,60, 37};
		int temp;
		int len;
		len = array.length - 1;
		System.out.printf("%s%8s%n", "Index", "Value");
		for(int counter = 0; counter < array.length;counter++)
		{
			System.out.printf("%5d%8d%n",counter,array[counter]);
		}
		System.out.printf("%s%8s Reversed%n", "Index", "Value");
		for(int counter = 0; counter < len;counter++)
		{
			temp = array[counter];
			array[counter] = array[len];
			array[len] = temp;
			len--;
		}	
		for(int counter = 0; counter < array.length;counter++)
		{
			System.out.printf("%5d%8d%n",counter,array[counter]);
		}

	}

}
