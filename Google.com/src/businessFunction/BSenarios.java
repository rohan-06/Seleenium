package businessFunction;

import genericFunctions.gfunctions;
import runClass.browserlaunch;

public class BSenarios extends gfunctions {
	
	
	public static void fill_form(){
		
		//browserlaunch.blaunch();
		gfunctions.radiobutton_mail_select();
		gfunctions.Checkbox_manual();
		gfunctions.Checkbox_automation();
		gfunctions.dropdown_Continents();
				
		
		
	}
	
	

}
