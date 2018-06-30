package lesson5.labs.prob1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import lesson5.labs.prob1.gui.BookWindow;

final public class RuleSetFactory {
	private RuleSetFactory() {
	}

	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();

	static {
		map.put(BookWindow.class, new BookRuleSet());
	}


}
