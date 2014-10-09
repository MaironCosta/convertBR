package br.convert;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public final class Converter {
	
	public Converter() {
		// TODO Auto-generated constructor stub
	}
	
	public static String criptografarMD5(String input) throws IllegalArgumentException{		

		if (input == null || "".equals(input)) {
			
			throw new IllegalArgumentException("input is null or is a empty string");
			
		}
		
		String md5 = null;

		MessageDigest digest;
		try {
			
			digest = MessageDigest.getInstance("MD5");
			digest.update(input.getBytes(), 0, input.length());
			
			md5 = new BigInteger(1, digest.digest()).toString(16);
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return md5;
	}	
	
	public static String moedaBR (BigDecimal valor, Locale locale) throws IllegalArgumentException{		

		if (valor == null) {
			
			throw new IllegalArgumentException("valor is null");
			
		}

		if (locale == null) {
			
			throw new IllegalArgumentException("locale is null");
			
		}
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		nf.setMinimumFractionDigits(2);
		nf.setCurrency(Currency.getInstance(locale));
		
		return nf.format(valor);
		
	}
	
}
