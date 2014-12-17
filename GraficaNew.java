import java.awt.*;
import java.awt.Container;
import java.awt.event.*;
import java.lang.Integer;

public class GraficaNew extends Grafica {
	
	public void frameNewArmadio(){
		
		Frame nuovoArmadio = new Frame("Nuovo Armadio");
		nuovoArmadio.setLayout(new GridLayout(1,2,10,10));
		
		Panel label = new Panel(new GridLayout(2,5)); nuovoArmadio.add(label);
		Panel button = new Panel(new GridLayout(2,1)); nuovoArmadio.add(button);
		
		Label nome = new Label("Nome"); TextField nometext = new TextField("");
		Label MC = new Label("Max Camicie");TextField MCtext = new TextField("0");
		Label MM = new Label("Max Maglie");TextField MMtext = new TextField("0");
		Label MCi =new Label ("Max Citure");TextField MCitext = new TextField("0");
		Label MP = new Label ("Max Pantaloni");TextField MPtext = new TextField("0");
		Button inserisci = new Button("OK");
			inserisci.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
				Armadio arma1 = new Armadio(nome.getText(),Integer.parseInt(MCtext.getText()),Integer.parseInt(MMtext.getText()),Integer.parseInt(MCitext.getText()),Integer.parseInt(MPtext.getText()));
				System.out.println("creato un nuovo armadio di nome "+ nometext.getText());
				}
			});
		
		
		label.add(nome);label.add(MC);label.add(MM);label.add(MCi);label.add(MP);
		label.add(nometext);label.add(MCtext);label.add(MMtext);label.add(MCitext);label.add(MPtext);
		button.add(inserisci);
	
		nuovoArmadio.setVisible(true);
		nuovoArmadio.pack();
	}
}