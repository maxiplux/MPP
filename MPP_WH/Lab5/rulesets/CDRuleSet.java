package rulesets;

import java.awt.Component;

import gui.CDWindow;


/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		
			CDWindow cdr= (CDWindow) ob;
			boolean bnArt=cdr.getArtistValue()==null||cdr.getArtistValue().toString().equals("");
			boolean bnTitle=cdr.getTitleValue()==null||cdr.getTitleValue().toString().equals("");
			if( bnArt||bnTitle) throw new  RuleException("all field must be non empty");
			String pr= cdr.getPriceValue();
			if(pr.lastIndexOf('.')!=pr.length()-2) throw new  RuleException("price must be a floating point number with two decimal places");
			double dprice=Double.valueOf(pr);
			
			if(dprice<=0.4) throw new  RuleException("price should be greater than 0.49");
	
		
		
	}
	
}
