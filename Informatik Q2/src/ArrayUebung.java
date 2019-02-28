import java.util.ArrayList;
import java.util.List;


public class ArrayUebung
{
	static List <String> wochentage= new ArrayList<String>();
	static List <String> monate= new ArrayList<String>();
	static List <String> monatsTage= new ArrayList<String>();
	
	public static void main(String[] args) 
	{
		
		aufgabe2();
		aufgabe3();
		aufgabe4();
	}
	
	
	public static void aufgabe2()
	{
		wochentage.add("Montag");
		wochentage.add("Dienstag");
		wochentage.add("Mittwoch");
		wochentage.add("Donnerstag");
		wochentage.add("Freitag");
		wochentage.add("Samstag");
		wochentage.add("Sonntag");
		
		System.out.println(wochentage.get(0));
	
	}
	
	public static void aufgabe3()
	{
		
		wochentage.get(4);
		wochentage.set(4,"NochNichtFreitag");
		System.out.println(wochentage.get(4));
		
		
	}
	
	public static void aufgabe4()
	{
		for (int i=0; i<wochentage.size();i++)
		{
			System.out.println(wochentage.get(i));
		}
		
		
	}
	
	public static void aufgabe5()
	{
		monate.add("Januar");
		monate.add("Februar");
		monate.add("März");
		monate.add("April");
		monate.add("Mai");
		monate.add("Juni");
		monate.add("Juli");
		monate.add("August");
		monate.add("September");
		monate.add("Oktober");
		monate.add("november");
		monate.add("Dezember");
		
		System.out.println(monate.get(0));
	}
	
	
}


