public class Pantalone extends VestBase implements Colore{
	
	private String colore="";
	private String stile;
	private String taglio;
	
	//costrut
	
	public Pantalone(String colore, String stile, String taglio){
		this.setColore(colore);
		this.setStile(stile);
		this.setTaglio(taglio);
	}
	
	//incap
	
	public void setColore(String colore){
		if (colore == ""){
			colore=interSetColor();
		}else{
			colore = interSetColor(colore);
			
		}
		this.colore=colore;
	}
	public void setStile(String stile){
		this.stile = stile;
	}
	public void setTaglio(String taglio){
		this.taglio = taglio;
	}
	public String getColore(){
		return this.colore;
	}
	public String getStile(){
		return this.stile;
	}
	public String getTaglio(){
		return this.taglio;
	}
	public void stampa(){
		System.out.println("Pantalone"+"\n"+"Colore : "+getColore()+"\n"+"Stile : "+getStile()+"\n"+"Taglio : "+getTaglio());
	}
	
}