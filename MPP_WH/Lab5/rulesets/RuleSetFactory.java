package rulesets;

import java.awt.Component;
import java.util.HashMap;

import gui.BookWindow;
import gui.CDWindow;

final public class RuleSetFactory {
	private RuleSetFactory(){}
	public static RuleSet getRuleSet(Component cm) {
		if(cm instanceof CDWindow) {
			if(map.get(cm.getClass())!=null) return map.get(cm.getClass());
			else map.put(cm.getClass(), new CDRuleSet());
		}
		
		if(cm instanceof BookWindow) {
			if(map.get(cm.getClass())!=null) return map.get(cm.getClass());
			else map.put(cm.getClass(), new BookRuleSet());
		}
		return map.get(cm.getClass());
	}
	static  HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	
}
