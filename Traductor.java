import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Traductor {
	static InputStreamReader isr=new InputStreamReader(System.in);
	static BufferedReader br=new BufferedReader(isr);
	public static void main(String[] args)throws Exception{
		
		String palabra;
		int op;
		FuncTrans t=new FuncTrans();
		
		do {
			System.out.println("0.-Salir:");
			System.out.println("1.-Español / Inglés");
			System.out.println("2.-English / Spanish");
			System.out.println("opcion:");
			op=Integer.parseInt(br.readLine());
			
			switch(op) {
			case 1:		
				do {
				System.out.print("palabra:");
				palabra=br.readLine();
				}while(palabra.contentEquals(""));				
				t.TradEI(palabra);
				break;			
			case 2:	
				do {
					System.out.print("word:");
					palabra=br.readLine();
				}while(palabra.equals(""));
				t.TradIE(palabra);
				break;
				
			}
			
		}while(op!=0);			
	}	
}

