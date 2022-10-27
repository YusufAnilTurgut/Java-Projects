import java.util.Scanner;

public class Questions {

	public static void main(String[] args) 
	{
		int i = 0;
		int res = 0;
		String z;
		String[][]q = {{"1. Hangi ulke en çok sera gazı yaymaktadır? \nA = China \nB = Hindistan \nC = Amerika \nD = Japonya \n","a"} , 
				{"2. Hangi gezegenin atmosferi kuresel isinma ile yok edilmektedir ? \nA =Jupiter \nB = Venus \n", "b"},
				{"3. Hangi tur ampul en az enerjiyi tuketir \n A =Akkor Amblem \nB = Halojen Ampul \nC = Kompakt Florasan Ampul \n", "c"}, 
				{"4. iklim degisikligi nedeniyle yilda kac kişi olmektedir? \nA = 1500 \nB = 100.000 \nC = 150.000 \n", "c"},
				{"5. Kuresel isinmaya karsi en savunmasız hayvan hangisidir? \nA = Kar Leopari \nB = Kutup Ayisi \nC = Deniz gergedani \n", "a"}};
		String[] a = {"a","b","c", "d","e"}; 
		Scanner input2 = new Scanner (System.in);
		
		for(int counter = 0; counter < 5;counter++)
		{	
			
			System.out.printf("%s", q[counter]);
			
			System.out.printf("Cevabi giriniz ::");
			z = input2.next();
			
			if(q[counter][1].equals(z))
			{
				System.out.printf("Dogru Cevap \n");
				res++;
			}
			else
				System.out.printf("Yanlis Cevap \n");
		}
		if(res == 5)
			System.out.printf("Mukemmel");
		else if(res == 4)
			System.out.printf("Cok iyi");
		else if (res <= 3)
			System.out.printf("Bilgilerinizi tazeleyin");
			
		
		

	}

}
