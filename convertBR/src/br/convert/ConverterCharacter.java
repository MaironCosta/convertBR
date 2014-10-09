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

		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		
		return charac;
		
	}	

	private Map<String, String> getOCharacters() {
		
		Map<String, String> charac = new HashMap<String, String>();

		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		
		return charac;
		
	}	

	private Map<String, String> getICharacters() {
		
		Map<String, String> charac = new HashMap<String, String>();

		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		
		return charac;
		
	}
	
	private Map<String, String> getECharacters() {
		
		Map<String, String> charac = new HashMap<String, String>();
		
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		
		return charac;
		
	}	
	
	private Map<String, String> getACharacters() { 

		Map<String, String> charac = new HashMap<String, String>();

		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");

		return charac;
		
	}

	private Map<String, String> getSpecialCharacters() {
		
		Map<String, String> charac = new HashMap<String, String>();

		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		charac.put(this.convertToCode('�'), "�");
		
		return charac;
		
	}	
	
}
