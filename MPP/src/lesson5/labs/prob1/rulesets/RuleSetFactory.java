package lesson5.labs.prob1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import lesson5.labs.prob1.gui.BookWindow;
import lesson5.labs.prob1.gui.CDWindow;

final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	static {
		map.put(BookWindow.class, new BookRuleSet());
		map.put(CDWindow.class, new CDRuleSet());
	}
	
	
	public static  RuleSet getRuleSet(Component component)
	 {
		 Class<? extends Component> cl = component.getClass();
		 
			if(!map.containsKey(cl)) 
			{
				throw new IllegalArgumentException("RuleSet not found for your entry");
			}
			return map.get(cl); 
	 }
	 
	
}
