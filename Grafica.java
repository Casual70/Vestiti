import java.awt.*;
import java.awt.Container;
import java.awt.event.*;

public class Grafica{
	
	private int x,y;
	
	
	public void setX(int x){
		this.x = x;
	}
	public int getX(){
		return this.x;
	}
	public void setY(int Y){
		this.y = y;
	}
	public int getY(){
		return this.y;
	}
	
	public void frameHome(){
		Frame f = new Frame("Home");
		f.setLayout(new GridLayout(1,3,10,10));
		f.setLocation(100,100);
		//
		Menu menu = new Menu("Inizio");
		
		//aggiungere item
	
		//
		Panel p = new Panel(new GridLayout(5,2));
		Panel lab = new Panel(new GridLayout(4,1));
		Panel text = new Panel(new GridLayout(4,1));
		//
		Button newCam = new Button("Nuova Camicia");
			newCam.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					System.out.println("FOFOFOFOF");
					GraficaNew a = new GraficaNew();
					a.frameNewArmadio();
				}
			});
		Button newMagl = new Button("Nuova Maglia");
			newMagl.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					//frameNewMaglia();
				}
			});
		Button exi = new Button("Premi per uscire");
			//Action
		
		/*MyActionListener alistener = new MyActionListener();
		ini.addActionListener(alistener);*/
		//
		f.add(p);
		p.add(newCam); p.add (newMagl);
		p.add(exi);
		p.setVisible(true);
		//
		f.add(lab);
		Label cam = new Label("Camicie"); lab.add(cam);
		Label magl = new Label("Maglie"); lab.add(magl);
		Label pant = new Label("Pantaloni"); lab.add(pant);
		Label cint = new Label ("Cinture"); lab.add(cint);
		//
		f.add(text);
		TextField textc = new TextField("Camicie"); text.add(textc);
		TextField textm = new TextField("Maglie"); text.add(textm);
		TextField textp = new TextField("Pantaloni"); text.add(textp);
		TextField textci = new TextField("Cinture"); text.add(textci);
		text.setVisible(true);
		//
		
		
		
		f.pack();
		f.setVisible(true);
	}
}