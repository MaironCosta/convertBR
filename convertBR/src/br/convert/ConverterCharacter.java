package br.convert;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * This abstract class is used to convert text to special character.<br>
 * 
 * ex.:<br>
 * 
 * ConverterCharacter.getInstance(ConverterCharacter.getConvertUNICODE());<br>
 *		or <br>
 * ConverterCharacter.getInstance(ConverterCharacter.getConvertHTML());		<br>
 * 
 * @author Mairon Costa
 * @since 03-03-2014
 * @version 1.0 - 03-03-2014
 * 
 * */
public abstract class ConverterCharacter {
	
	private Map<String, String> characters = new HashMap<String, String>();;
	
	public enum ConvertType {
		
		CONVERT_HTML(new ConvertHTMLCode()),
		CONVERT_UNICODE(new ConvertUnicode());
		
		private ConverterCharacter converterCharacter;
		
		public ConverterCharacter getConverterCharacter(){
			return converterCharacter;
		}
		
		private ConvertType (ConverterCharacter converterCharacter) {
			this.converterCharacter = converterCharacter;
		}
		
	}
	
	public static ConverterCharacter getInstance(ConvertType convertType) throws IllegalArgumentException {
		
		if (convertType == null) {
			
			throw new IllegalArgumentException("ConvertType not find");
			
		} else {
			
			return convertType.getConverterCharacter();
			
		}
				
	}
	
	public static ConvertType getConvertHTML () {
		return ConvertType.CONVERT_HTML;
	}
	
	public static ConvertType getConvertUNICODE () {
		return ConvertType.CONVERT_UNICODE;
	}

	/**
	 *  This method convert special character to simple character. 
	 *  
	 *  @throws IllegalArgumentException - If parameter equals null 
	 *  is throw IllegalArgumentException
	 * 
	 * */
	public abstract String unconvertSpecialCharacter(String text) throws IllegalArgumentException;

	/**
	 *  This method convert simple character to special character. 
	 *  
	 *  @throws IllegalArgumentException - If parameter equals null 
	 *  is throw IllegalArgumentException
	 * 
	 * */
	public abstract String convertToCode(String text) throws IllegalArgumentException;

	/**
	 *  This method convert a char to special character. 
	 *  
	 * */
	public abstract String convertToCode(char letter);	
	
	/**
	 *  This method add a char to list. 
	 *  
	 * */
	public void addCharacters (char letter) {
		
		characters.put(this.convertToCode(letter), String.valueOf(letter));
		
	}

	/**
	 *  This method get all characters that are available in moment to convert. If
	 *  return equals a empty instance is because get all possible characters. 
	 *  
	 * */
	public Map<String, String> getAllCharacters() {
		// TODO Auto-generated method stub

		characters.putAll(this.getACharacters());
		characters.putAll(this.getECharacters());
		characters.putAll(this.getICharacters());
		characters.putAll(this.getOCharacters());
		characters.putAll(this.getUCharacters());
		characters.putAll(this.getSpecialCharacters());		
		
		return characters;
	}

	private Map<String, String> getUCharacters() {
		
		Map<String, String> charac = new HashMap<String, String>();

		charac.put(this.convertToCode('ú'), "ú");
		charac.put(this.convertToCode('Ú'), "Ú");
		charac.put(this.convertToCode('ù'), "ù");
		charac.put(this.convertToCode('Ù'), "Ù");
		charac.put(this.convertToCode('ü'), "ü");
		charac.put(this.convertToCode('Ü'), "Ü");
		
		return charac;
		
	}	

	private Map<String, String> getOCharacters() {
		
		Map<String, String> charac = new HashMap<String, String>();

		charac.put(this.convertToCode('ó'), "ó");
		charac.put(this.convertToCode('Ó'), "Ó");
		charac.put(this.convertToCode('ò'), "ò");
		charac.put(this.convertToCode('Ò'), "Ò");
		charac.put(this.convertToCode('õ'), "õ");
		charac.put(this.convertToCode('Õ'), "Õ");
		charac.put(this.convertToCode('ô'), "ô");
		charac.put(this.convertToCode('Ô'), "Ô");
		
		return charac;
		
	}	

	private Map<String, String> getICharacters() {
		
		Map<String, String> charac = new HashMap<String, String>();

		charac.put(this.convertToCode('í'), "í");
		charac.put(this.convertToCode('Í'), "Í");
		charac.put(this.convertToCode('ì'), "ì");
		charac.put(this.convertToCode('Ì'), "Ì");
		
		return charac;
		
	}
	
	private Map<String, String> getECharacters() {
		
		Map<String, String> charac = new HashMap<String, String>();
		
		charac.put(this.convertToCode('é'), "é");
		charac.put(this.convertToCode('É'), "É");
		charac.put(this.convertToCode('è'), "è");
		charac.put(this.convertToCode('È'), "È");
		charac.put(this.convertToCode('ê'), "ê");
		charac.put(this.convertToCode('Ê'), "Ê");
		
		return charac;
		
	}	
	
	private Map<String, String> getACharacters() { 

		Map<String, String> charac = new HashMap<String, String>();

		charac.put(this.convertToCode('á'), "á");
		charac.put(this.convertToCode('Á'), "Á");
		charac.put(this.convertToCode('à'), "à");
		charac.put(this.convertToCode('À'), "À");
		charac.put(this.convertToCode('â'), "â");
		charac.put(this.convertToCode('Â'), "Â");
		charac.put(this.convertToCode('ã'), "ã");
		charac.put(this.convertToCode('Ã'), "Ã");

		return charac;
		
	}

	private Map<String, String> getSpecialCharacters() {
		
		Map<String, String> charac = new HashMap<String, String>();

		charac.put(this.convertToCode('ª'), "ª");
		charac.put(this.convertToCode('º'), "º");
		charac.put(this.convertToCode('ç'), "ç");
		charac.put(this.convertToCode('Ç'), "Ç");
		
		return charac;
		
	}	
	
}
