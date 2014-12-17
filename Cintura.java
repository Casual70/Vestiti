import java.util.*;

public class Cintura extends VestBase implements Colore{
	
	private String colore ="";
	private String stile;
	private String tipoFibbia;
	
	//costrut
	
	public Cintura (String colore,String stile,String tipoFibbia){
		this.setColore(colore);
		this.setStile(stile);
		this.setTipoFibbia(tipoFibbia);
	}
	
	//incap
	
	public void setColore(String colore){
		if (colore == ""){
			colore = interSetColor();
		}else{
			colore = interSetColor(colore);
		}
		this.colore = colore;
	}
	public void setStile(String stile){
		this.stile = stile;
	}
	public void setTipoFibbia(String fibbia){
		this.tipoFibbia = fibbia;
	}
	public String getColore(){
		return this.colore;
	}
	public String getStile(){
		return this.stile;
	}
	public String getTipoFibbia(){
		return this.tipoFibbia;
	}
	public void stampa(){
		System.out.println("Cintura"+"\n"+"Colore : "+getColore()+"\n"+"Stile : "+getStile()+"\n"+"Fibbia : "+getTipoFibbia());
	}
} 