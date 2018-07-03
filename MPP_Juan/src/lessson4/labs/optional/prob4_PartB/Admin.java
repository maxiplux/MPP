package lessson4.labs.optional.prob4_PartB;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		
		return list.stream().mapToDouble(i -> i.computeUpdatedBalanceSum()).sum();

	}
}
