package br.convert;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * This final class work together with your mother class 
 * and is used to convert text to unicode character.<br>
 * 
 * ex.:<br>
 * 
 * ConverterCharacter converterCharacter = ConvertUnicode.getInstance();<br>
 * 
 * @author Mairon Costa
 * @since 03-03-2014
 * @version 1.0 - 03-03-2014
 * 
 * */
@SuppressWarnings({"unused"})
public final class ConvertUnicode extends ConverterCharacter {
	
/*	private static ConvertUnicode instance;
	
	private ConvertUnicode() {
		// TODO Auto-generated constructor stub
	}
	
	public static ConvertUnicode getInstance() {
		
		if (instance == null) {
		
			instance = new ConvertUnicode();
			
		}
		
		return instance;
	}*/
	
	protected ConvertUnicode() {
		// TODO Auto-generated constructor stub
	}

	public String unconvertSpecialCharacter(String text) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
		if (text == null) {
			
			throw new IllegalArgumentException("text is null");
			
		}

		Map<String, String> characters = this.getAllCharacters();
		
		StringBuilder sb = new StringBuilder(text);
		
		for (Map.Entry<String, String> character : characters.entrySet()) {
			
			 sb = new StringBuilder(sb.toString().replace(character.getKey(), character.getValue()));
			
		}
		
		this.finalizar();
		
		return sb.toString();
		
	}

	public String convertToCode(char letter) {
		
	    String hexa = Integer.toHexString((int)letter);

	    String prefix;
	    if( hexa.length() == 1 ) {
	        prefix = "\\u000";
	    } else if( hexa.length() == 2 ) {
	        prefix = "\\u00";
	    } else if( hexa.length() == 3 ) {
	        prefix = "\\u0";
	    } else {
	        prefix = "\\u";
	    }
	    
	    this.finalizar();

	    return prefix + hexa;
	}
	
	@Override
	public String convertToCode(String text) throws IllegalArgumentException {
		// TODO Auto-generated method stub

		if (text == null) {
			
			throw new IllegalArgumentException("text is null");
			
		}

		Map<String, String> charac = this.getAllCharacters();
		
		StringBuilder sb = new StringBuilder(text);
		
		for (Map.Entry<String, String> character : charac.entrySet()) {
			
			 sb = new StringBuilder(sb.toString().replace(character.getValue(), character.getKey()));
			
		}
		
	//	this.finalizar();
		
		return sb.toString();
	}

	private void finalizar() {
		
	//	System.gc();
		
	}

	private void autoCreateCaracteresEspeciais() {

		StringBuilder sb = new StringBuilder("·¡‡¿‚¬„√È…Ë»Í ÌÕÏÃÛ”Ú“ı’Ù‘˙⁄˘Ÿ¸‹");
		
		char[] s = sb.toString().toCharArray();
		for (int i = 0; i <= s.length - 1; i++) {
			
			try {
				
				System.out.println(this.convertToCode(s[i]) + " , " + String.valueOf(s[i]));

			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("ERRO: " + e.getMessage());
				continue;
			}

		}
		
	}
		
	/*
	characters.put("\u00e1", "·");
	characters.put("\u00c1", "¡");
	characters.put("\u00e0", "‡");
	characters.put("\u00c0", "¿");
	characters.put("\u00e2", "‚");
	characters.put("\u00e2", "‚");
	characters.put("\u00c2", "¬");
	characters.put("\u00e3", "„");
	characters.put("\u00c3", "√");
	characters.put("\u00e9", "È");
	characters.put("\u00c9", "…");
	characters.put("\u00e8", "Ë");
	characters.put("\u00c8", "»");
	characters.put("\u00ea", "Í");
	characters.put("\u00ca", " ");
	characters.put("\u00ed", "Ì");
	characters.put("\u00cd", "Õ");
	characters.put("\u00ec", "Ï");
	characters.put("\u00cc", "Ã");
	characters.put("\u00f3", "Û");
	characters.put("\u00d3", "”");
	characters.put("\u00f2", "Ú");
	characters.put("\u00d2", "“");
	characters.put("\u00f5", "ı");
	characters.put("\u00d5", "’");
	characters.put("\u00f4", "Ù");
	characters.put("\u00d4", "‘");
	characters.put("\u00fa", "˙");
	characters.put("\u00da", "⁄");
	characters.put("\u00f9", "˘");
	characters.put("\u00d9", "Ÿ");
	characters.put("\u00fc", "¸");
	characters.put("\u00dc", "‹");
	*/
	
}
