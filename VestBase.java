abstract class VestBase {
	
	private Camicia camicia;
	private Maglia maglia;
	private Cintura cintura;
	private Pantalone pantalone;
	
	public void setCamicie(Camicia camicia){
		this.camicia = camicia;
	}
	public Camicia getCamicia(){
		return this.camicia;
	}
	public void setMaglia (Maglia maglia){
		this.maglia=maglia;
	}
	public Maglia getMaglia(){
		return this.maglia;
	}
	public void setCintura(Cintura cintura){
		this.cintura=cintura;
	}
	public Cintura getCintura(){
		return this.cintura;
	}
	public void setPantalone(Pantalone pantalone){
		this.pantalone = pantalone;
	}
	public Pantalone getPantalone(){
		return this.pantalone;
	}
}