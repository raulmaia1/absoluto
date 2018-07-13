package br.com.ossystem.util;

public class ZeroEsquerda {
	
	public String zeroEsquerda(String value){
		int x = value.length();
		String string = value;
		for (int i = x; i < 4; i++) {
			string = "0" + string;
		}
		
		return string;
	}
	
}
