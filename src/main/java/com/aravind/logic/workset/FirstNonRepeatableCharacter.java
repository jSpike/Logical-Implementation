package com.aravind.logic.workset;

import java.util.LinkedHashMap;

public final class FirstNonRepeatableCharacter {

	public FirstNonRepeatableCharacter() {
		
	}
	public final void getFirstNonRepeatableCharacter(String strValue){
		LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for(char ch: strValue.toCharArray()){
			charMap.put(ch, charMap.containsKey(ch)? charMap.get(ch)+1 : 1);
		}
		for(char ch: strValue.toCharArray()){
			if(charMap.get(ch) == 1){
				System.out.println("Non repearable charactor:: "+ch);
				break;
			}
		}
	}

}
