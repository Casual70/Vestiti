public interface Taglia{
	
	int converter = 14;
	
	
	
	public default String tagliaCamicia(String taglia){
		String taglieMaglia[] = {"XXS","XS","S","M","L","XL","XXL"};
		String tagliadef="Taglia Inesistente";
		for (int i =0; i<taglieMaglia.length;i++){
			if (taglieMaglia[i]==taglia){
				tagliadef = taglia;
			}
		}
		return tagliadef;
	}
}