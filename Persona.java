abstract class Persona{
	
	private int eta;
	private double altezza;
	private String sesso;
	private boolean s;
	private int nScarpe;
	private String Taglia;
	
	public void setEta(int eta){
		this.eta = eta;
	}
	public int getEta(){
		return this.eta;
	}
	public void setAltezza (double altezza){
		this.altezza = altezza;
	}
	public double getAltezza (){
		return this.altezza;
	}
	public void setSesso(String sesso){
		if (sesso == "maschio" || sesso=="m"||sesso == "uomo"){
			this.s = true;
		}
		else if(sesso == "femmina" || sesso=="f" || sesso == "donna"){
			this.s = false;
		}
		else {
			System.out.println("Il sesso va specificato tra uomo o donna");
		}
	}
	public String getSesso(){
		if (s==true){
			this.sesso = "Uomo";
		}
		else if (s==false){
			this.sesso = "Donna";
		}
		return this.sesso;
	}
	public void setNScarpe(int scarpe){
		this.nScarpe = scarpe; 
	}
	public int getScarpe(){
		return this.nScarpe;
	}
	abstract void setTaglia();
	abstract String getTaglia();
	
}