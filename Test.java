import java.util.*;
import java.util.Vector;
import java.lang.Math;

public class Test{
	public static void main (String args[]){
		//Grafica
		Grafica g = new Grafica();
		g.frameHome();
		//Creo vettori VestBase
		/*Armadio arma1 = new Armadio();*/
	
		// Creo oggetti camicia e li metto in un array camicia
		/*try {
			arma1.stackInd(new Camicia (30,	"","Strecth"));
			arma1.stackInd(new Camicia (35,"blu","Sportiva"));
			arma1.stackInd(new Camicia (40,"Rosso","Elegante"));
			arma1.stackInd(new Maglia ("rosso","Casual","T-Shirt"));
			arma1.stackInd(new Maglia ("Blu","Noir","Elegante"));
			arma1.stackInd(new Maglia ("Kaki","Leggera","Sportiva"));
			arma1.stackInd(new Cintura ("Nero","Casual","Doppia"));
			arma1.stackInd(new Cintura ("","Elegante","Singola"));
			arma1.stackInd(new Pantalone("Giallo","Elegante","Strech"));
			arma1.stackInd(new Pantalone("Verde","Casual","Regular"));
			arma1.stackInd(new Pantalone("","Elegante","Regular"));
		}
		catch(CamException x){
			System.out.println(x.getMessage());
		}
		catch(MaglException m){
			System.out.println(m.getMessage());
		}
		catch(CintException c){
			System.out.println(c.getMessage());
		}
		catch(PantException p){
			System.out.println(p.getMessage());
		}*/
	/*
		int cam = (int)(Math.random()*Camicie.length);
		int magl = (int)(Math.random()*Maglie.length);
		int cint = (int)(Math.random()*Cinture.length);
		int pant = (int)(Math.random()*Pantaloni.length);
		
			//Camicie[cam].stampa();

			if (Completo.isEmpty()){
			
				Completo.add(Camicie[cam]); Armadio.remove(Camicie[cam]);  //pur identificando l'oggetto tramite array il metodo funziona ugualmente
				Completo.add(Maglie[magl]); Armadio.remove(Maglie[magl]);
				Completo.add(Cinture[cint]); Armadio.remove(Cinture[cint]);
				Completo.add(Pantaloni[pant]); Armadio.remove(Pantaloni[pant]);
			
				System.out.println("Gli abiti del completo sono "+Completo.size()+" e sono ");
	
				Camicie[cam].stampa();
				Maglie[magl].stampa();
				Cinture[cint].stampa();
				Pantaloni[pant].stampa();
			
				System.out.println(Armadio.size()+" La dimensione dell'armadio"+"\n"+Armadio.capacity()+" La capacità dell'armadio");
		
			}
	
			
		//System.out.println(Armadio.size()+" La dimensione dell'armadio"+"\n"+Armadio.capacity()+" La capacità dell'armadio");
		
	//	assert (Armadio.size()>Completo.size()):"Abiti rimasti insufficenti per nuovo completo";
	*/
	}
}