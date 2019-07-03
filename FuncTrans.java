import java.io.BufferedReader;
import java.io.InputStreamReader;



public class FuncTrans {
	
	
	private String [][] dicci;
	private int N;
	
	public FuncTrans(){		
		N=1;
		dicci=new String[2][100];
		dicci[0][0]="perro";
		dicci[1][0]="dog";
	}
	
	public void TradEI(String palabra)throws Exception {
		InputStreamReader isr=new InputStreamReader(System.in); // En este caso el br readline es local porque son datos diferentes.
		BufferedReader br=new BufferedReader(isr); 
		
		for(int i=0;i<N;i++) {
			if(palabra.equals(dicci[0][i])){ // Comprueba que son exactamente iguales.
				System.out.println(dicci[1][i]); // Si la encuentro muestro la traducción.
				return;
			}
		}		
		
		dicci[0][N]=palabra; // Si no la encuentro la meto dentro del array y pido traducción para guardarla.
		System.out.print("traduce:");
		dicci[1][N]=br.readLine();
		N++;
	}
	
	public void TradIE(String palabra)throws Exception {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr); 
		
		for(int i=0;i<N;i++) {
			if(palabra.equals(dicci[1][i])){ 
				System.out.println(dicci[0][i]); 
				return;
			}
		}		
		
		dicci[1][N]=palabra;
		System.out.print("translate:");
		dicci[0][N]=br.readLine();
		N++;
	}

}