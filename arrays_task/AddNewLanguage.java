package arrays_task;

import java.util.Arrays;

/*
Add Language at Start 
Scenario: Languages: {"Java", "Python"} — add "JavaScript" at start.
Task:
Method: addLanguageAtStart(String[] langs, String newLang)
Return a new String[] with newLang at index 0.
If newLang is null/empty, return same array.

 */
public class AddNewLanguage {
	public static String[] addLanguageAtStart(String[] langs, String newLang) {
		if(langs.length==0 || langs==null) {
			return langs;
		}
		String[] newLangs=new String[langs.length+1];
		newLangs[0]=newLang;
		for(int i=0;i<langs.length;i++) {
			newLangs[i+1]=langs[i];
		}
		return newLangs;
	}
	
	
	public static void main(String[] args) {
		String[]Languages= {"Java","Python"};
		System.out.println(Arrays.toString(addLanguageAtStart(Languages, "JavaScript")));
		//[JavaScript, Java, Python]

	}

}
