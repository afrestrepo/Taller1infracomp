import java.util.Scanner;

public class ThreadThread extends Thread {


	private String name;
	private static int numero;

	public ThreadThread(String name) {
		this.name = name;
	}

	public void run() {	
		try {
			for(int i = 1; i <= numero; i++) {			
				if(i%2 == 0 && name.equals("Thread 0")) {
					System.out.println(i);				
					Thread.sleep(50);
				}		

				else if(i%2 == 1 && name.equals("Thread 1")) {
					System.out.println(i);			
					Thread.sleep(50);
				}
			}	
		}
		catch(Exception e) {}
	}

	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);


		System.out.print("Introduzca un limite superior");
		numero  = teclado.nextInt();

		ThreadThread pares = new ThreadThread("Thread 0");
		ThreadThread impares = new ThreadThread("Thread 1");

		pares.start();
		impares.start();
	}

}
