package br.convert;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * 
 * This final class work together with your mother class 
 * and is used to convert text to html character.<br>
 * 
 * ex.:<br>
 * ConverterCharacter converterCharacter = ConvertHTMLCode.getInstance();<br>
 * 
 * @author Mairon Costa
 * @since 03-03-2014
 * @version 1.0 - 03-03-2014
 * 
 * */
public final class ConvertHTMLCode extends ConverterCharacter {

	public ConvertHTMLCode() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String unconvertSpecialCharacter(String text) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return StringEscapeUtils.unescapeHtml(text);
	}

	@Override
	public String convertToCode(char letter) {
		// TODO Auto-generated method stub
		
		return StringEscapeUtils.escapeHtml(String.valueOf(letter));
	}
	
	@Override
	public String convertToCode(String text) {
		// TODO Auto-generated method stub
		return StringEscapeUtils.escapeHtml(text);
	}

}
