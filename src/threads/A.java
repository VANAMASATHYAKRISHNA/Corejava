package threads;

public class A extends Thread 
{
public void run()
{
	int i=1;

	while(i<=10)
	{
		System.out.println("A");
		i++;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			
			e.printStackTrace();
		}
}
}
}