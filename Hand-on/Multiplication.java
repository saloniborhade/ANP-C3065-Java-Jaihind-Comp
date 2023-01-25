//WAP to print any multiplication table by using  exception handling and call Thread.Sleep method.
package corejava;

public class Multiplication extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 1 ; i <= 10; i++) //printing no.'s from 1 to 20
			{
				Thread.sleep(1500);	// sleep method of Thread Class
				System.out.println(i*3); 
			}
		}
		catch(Exception e)
		{
			System.out.println(e); //catching the exception
		}

	}

	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		m.start();
	}

	

}
