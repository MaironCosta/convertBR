package br.convert;
 
import java.util.Map;

 
public class BrConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		ConverterCharacter converterCharacter = ConverterCharacter.getInstance(ConverterCharacter.ConvertType.CONVERT_HTML);
	//	System.out.println(converterCharacter.convertToCode("í"));
		
		//teste
		converterCharacter.addCharacters('¨');
		
		for (Map.Entry<String, String> m : converterCharacter.getAllCharacters().entrySet()) {
			System.out.println(m);
		}
			
	}

}
