package ArraysDemo;

public class Main 
{
	public static void main(String[] args) 
	{
		String[] ogrenciler = new String[3];
		ogrenciler[0]="Emre";
		ogrenciler[1]="Fatih";
		ogrenciler[2]="Atakan";
		
		for(int i=0;i<ogrenciler.length;i++)
		{
			System.out.println(ogrenciler[i]);
		}
		
		//diğer for döngüsü
		for (String ogrenci:ogrenciler) 
		{
			System.out.println(ogrenci);
		}
		
	}
	
	

	
}
