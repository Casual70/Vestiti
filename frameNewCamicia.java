public void frameNewCamicia(){  /* trasportare nella sottoclasse come modello possibilmente con override e poi ovviamente andraà istaziata l'oggetto della sottoclasse GraficaNew */
		
		Frame ini = new Frame("Nuova Camicia");
		ini.setLayout(new GridLayout(3,1,10,10));
		ini.setLocation(120,120);
		Label a = new Label ("Misure Camicia"); ini.add(a);
			Panel c = new Panel(new GridLayout(3,3)); ini.add(c); ini.setVisible(true);
			Label c1 = new Label("Collo");TextField b1 = new TextField("Collo");
			Label c2 = new Label("Colore");TextField b2 = new TextField("Colore");
			Label c3 = new Label("Stile");TextField b3 = new TextField("Stile");
			ini.add(c);
			c.add(c1);c.add(b1);
			c.add(c2);c.add(b2);
			c.add(c3);c.add(b3);
		
		Button init = new Button("inserisci"); ini.add(init);
		// action
		init.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					arma1.stackInd(new Camicia (b1.getText(),	b2.getText(),b3.getText()));
				}
				catch(CamException x){
					System.out.println(x.getMessage());
					init.setLabel("Spazio per le camicie esaurito");
					init.setEnabled(false);
				}
				catch(MaglException m){
					System.out.println(m.getMessage());
				}
				catch(CintException c){
					System.out.println(c.getMessage());
				}
				catch(PantException p){
					System.out.println(p.getMessage());
				}
			}
		});
		
		//
		
		ini.setVisible(true);
		ini.pack();
		
	}