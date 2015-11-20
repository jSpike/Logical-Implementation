package com.aravind.logic.workset;

import java.util.LinkedHashMap;

/**
 * For using this class we can find out first non repeatable character with
 * different java approch
 * 
 * @author Aravind
 *
 */
public final class FirstNonRepeatableCharacter {

	public FirstNonRepeatableCharacter() {

	}

	public final void getFirstNonRepeatableCharacter(String strValue) {
		/* For this approch using linked hashmap to find the charactor */
		LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for (char ch : strValue.toCharArray()) {
			charMap.put(ch, charMap.containsKey(ch) ? charMap.get(ch) + 1 : 1);
		}
		for (char ch : strValue.toCharArray()) {
			if (charMap.get(ch) == 1) {
				System.out.println("Non repearable charactor:: " + ch);
				break;
			}
		}
	}

}
