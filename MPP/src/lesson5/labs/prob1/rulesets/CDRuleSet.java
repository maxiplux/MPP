package lesson5.labs.prob1.rulesets;

import java.awt.Component;



import lesson5.labs.prob1.gui.CDWindow;

/**
 * Rules: 1. All fields must be nonempty 2. Price must be a floating point
 * number with two decimal places 3. Price must be a number greater than 0.49.
 */

public class CDRuleSet implements RuleSet {

	private CDWindow cdwindow;
	

	@Override
	public void applyRules(Component ob) throws RuleException {

		cdwindow = (CDWindow) ob;
		isEmptyFieldsRule(); //All fields must be nonempty
		isFloatPriceRule(); //Price must be a floating point
		isPriceGratherThat049(); //Price must be a number greater than 0.49.

	}
	public boolean isvalid(String value) {
		if (value==null)
		{
			return false;
		} 
		return !value.isEmpty();
	}


	private void isEmptyFieldsRule() throws RuleException {	
		
		if (!(this.isvalid(cdwindow.getArtistValue()) && this.isvalid(cdwindow.getTitleValue())
				&& this.isvalid(cdwindow.getPriceValue()))) 
		{
			
			throw new RuleException("All fields must be non-empty!");
		}

	}

	private void isPriceGratherThat049() throws RuleException {
		// TODO Auto-generated method stub
		String price = cdwindow.getPriceValue().trim();
		if (!(Float.parseFloat(price) >= 0.49)) {
			throw new RuleException("Price must be a floating point number with two decimal places more greather that 0.49");

		}

	}

	private void isFloatPriceRule() throws RuleException {
		// TODO Auto-generated method stub

		try {
			Float.parseFloat(cdwindow.getPriceValue().trim());
		} catch (Exception e) {
			throw new RuleException("Price must be a floating point number with two decimal places ");
		}

		if (!cdwindow.getPriceValue().trim().matches("[-+]?[0-9]*\\.[0-9]{2}")) {
			throw new RuleException("Price must be a floating point number with two decimal places ");

		}

	}

}
