import java.util.Vector;
import java.util.Stack;

public class Armadio{
	//costanti
	private int N_MAX_CAMICIE = 5;
	private int N_MAX_MAGLIE = 5;
	private int N_MAX_CINTURE = 2;
	private int N_MAX_PANTALONI = 4;
	private String NOME="";
	//variabili
	private int nCamicie,nMaglie,nCinture,nPantaloni;
	
	//costruttori
	public Armadio(String nome, int maxCam, int maxMaglie, int maxCinture, int maxPantaloni){
		this.NOME = nome;
		this.N_MAX_CAMICIE = maxCam;
		this.N_MAX_MAGLIE = maxMaglie;
		this. N_MAX_CINTURE = maxCinture;
		this.N_MAX_PANTALONI = maxPantaloni;
	}
	//
	
	Vector<Armadio>Arm = new Vector<Armadio>();
	Stack<Camicia>camicie = new Stack<Camicia>();
	Stack<Maglia>maglie = new Stack<Maglia>();
	Stack<Cintura>cinture = new Stack<Cintura>();
	Stack<Pantalone>pantaloni = new Stack<Pantalone>();
	
	//incap
	public void setNCamicie(int nCamicie){
		this.nCamicie = nCamicie;
	}
	public int getNCamicie(){
		return this.nCamicie;
	}
	public void setNMaglie(int nMaglie){
		this.nMaglie = nMaglie;
	}
	public int getNMaglie(){
		return this.nMaglie;
	}
	public void setNCinture(int nCinture){
		this.nCinture = nCinture;
	}
	public int getNCinture(){
		return this.nCinture;
	}
	public void setNPantaloni(int nPantaloni){
		this.nPantaloni = nPantaloni;
	}
	public int getNPantaloni(){
		return this.nPantaloni;
	}
	//metodi
	public void stackInd(Object ob) throws CamException, MaglException,CintException,PantException{
		if (ob instanceof Camicia){
			if (camicie.size()>=N_MAX_CAMICIE){
				throw new CamException();
			}
			camicie.push((Camicia)ob);
		}
		if (ob instanceof Maglia){
			if (maglie.size()>=N_MAX_MAGLIE){
				throw new MaglException();
			}
			maglie.push((Maglia)ob);	
		}
		if(ob instanceof Cintura){
			if (cinture.size()>=N_MAX_CINTURE){
				throw new CintException();
			}
			cinture.push((Cintura)ob);
		}
		if (ob instanceof Pantalone){
			if (pantaloni.size()>=N_MAX_PANTALONI){
				throw new PantException();
			}
			pantaloni.push((Pantalone)ob);
		}
	}
}