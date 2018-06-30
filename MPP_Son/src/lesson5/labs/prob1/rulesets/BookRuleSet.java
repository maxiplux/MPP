package lesson5.labs.prob1.rulesets;

import java.awt.Component;

import lesson5.labs.prob1.gui.BookWindow;

/**
 * Rules: 1. All fields must be nonempty 2. Isbn must be numeric and consist of
 * either 10 or 13 characters 3. If Isbn has length 10, the first digit must be
 * 0 or 1 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price
 * must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	BookWindow bw;

	@Override
	public void applyRules(Component ob) throws RuleException {
		bw = (BookWindow) ob;
		nonEmpty();
		checkIsbn();
		checkIsbn();
	}

	private void nonEmpty() throws RuleException {
		if (bw.getIsbnValue().isEmpty() || bw.getTitleValue().isEmpty() || bw.getTitleValue().isEmpty())
			throw new RuleException("Empty Field");
	}

	private void checkIsbn() throws RuleException {
		String isbn = bw.getIsbnValue();
		try {
			Integer.parseInt(isbn);
			if (isbn.length() == 10) {
				char firstChar = isbn.charAt(0);
				if (firstChar != '1' || firstChar != '0')
					throw new RuleException("ISBN with 10 digits must start with 0 or 1");
			} else if (isbn.length() == 13) {
				String digits = isbn.substring(0, 2);
				if(!digits.equals("978") || !digits.equals("979"))
					throw new RuleException("ISBN with 13 digits must start with 978 or 979");
			} else
				throw new RuleException("ISBN must be 10 or 13 digits");
		} catch (NumberFormatException e) {
			throw new RuleException("ISBN is not numberic");
		}
	}

	private void checkPrice() throws RuleException {
		String price = bw.getPriceValue();
		try {
			float pricef = Float.parseFloat(price);
			if(pricef <= 0.49)
				throw new RuleException("Price too low");
		}
		catch (NumberFormatException e)
		{
			throw new RuleException("must be float");
		}
	}
}
