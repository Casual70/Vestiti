import java.lang.Math;

public interface Colore {

	public String arrColor[] = {"Giallo","Arancio","Rosso","Rosa","Viola","Azzurro","Blu","Turchese","Verde","Marrone","Bianco","Nero"};
	
	public default  String interSetColor(){
		return arrColor[(int)(Math.random()*12)];
	}
	public default  String interSetColor(String color){
		String end = "Colore non disponibile";
		for (int i = 0 ; i<arrColor.length ; i++){
			if (color==arrColor[i]){
				end = color;
			}
		}
		return end;
	}
}