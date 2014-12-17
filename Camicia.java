import java.util.*;

public class Camicia extends VestBase implements Colore {
	
	private String collo;
	private String colore="";
	private String stile;
	
	// costruttori
	public Camicia (String collo, String colore, String stile){
		this.setCollo(collo);
		this.setColore(colore);
		this.setStile(stile);  
		
	}
	
	// incap
	public void setCollo(String collo){
		this.collo = collo;
	}
	public String getCollo(){
		return this.collo;
	}
	public void setColore (String colore){
		if (colore.equals("")){
			colore = interSetColor();
		}else{
			colore = interSetColor(colore);
		}
		this.colore = colore;
	}
	public String getColore(){
		return this.colore;
	}
	public void setStile(String stile){
		this.stile = stile;
	}
	public String getStile(){
		return this.stile;
	}
	//interfaccia
	//Metodi
	
	public void stampa(){
		System.out.println("Camicia"+"\n"+"Collo : "+getCollo()+"\n"+"Colore : "+getColore()+"\n"+"Stile : "+getStile());
	}
}