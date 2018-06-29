package rulesets;

import java.awt.Component;

import gui.BookWindow;



/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		BookWindow bd = (BookWindow) ob;
		
		String isbn = bd.getTitleValue().trim();
		String title = bd.getTitleValue().trim();
		String sprice = bd.getPriceValue().trim();
		
		boolean tb = isbn==null||isbn.equals("")||title==null||title.equals("")||sprice==null||sprice.equals("");;
		if(tb) throw new RuleException("isbn title price should not be empty"); 
		int isbnInt = Integer.valueOf(isbn);
		if(isbn.length()==10) {
			int f=Integer.valueOf(isbn.substring(0, 1));
			if(f!=0||f!=1)throw new RuleException(" the first digit of isbn should be 0 or 1");
		}else if(isbn.length()==13) {
			String threeS= isbn.substring(0,3);
			if(!threeS.equals("978")||!threeS.equals("979")) throw new RuleException("the first three of the isbn should be 978 or 979");
		} else throw new RuleException();
		
		
		
		if(sprice.lastIndexOf('.')!=sprice.length()-2) throw new  RuleException("price should be a floating point number with two decimal places ");
		double dprice=Double.valueOf(sprice);
		if( dprice<=0.49) throw new  RuleException("price should be more than 0.49");
		
	}

}
