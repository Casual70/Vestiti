import java.util.*;

public class Maglia extends VestBase implements Colore{
	
	private String colore;
	private String stile;
	private String tipo;
	
	//Costrutt
	
	public Maglia (String colore, String stile,String tipo){
		this.setColore(colore);
		this.setStile(stile);
		this.setTipo(tipo);
	}
	
	//Incap
	
	public void setColore(String colore){
		if (colore==""){
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
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public String getTipo(){
		return this.tipo;
	}
	public void stampa(){
		System.out.println("Maglia"+"\n"+"Colore : "+getColore()+"\n"+"Stile : "+getStile()+"\n"+"Tipo : "+getTipo());
	}
}