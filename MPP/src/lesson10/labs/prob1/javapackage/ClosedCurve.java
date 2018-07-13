package lesson10.labs.prob1.javapackage;

import lesson10.labs.prob1.bugreporter.BugReport;

@BugReport(assignedTo="Tom Jones", 
severity=1, 
reportedBy="Corazza", 
description = "The Complexity is N and the original requeriments said Nlogn")
public interface ClosedCurve {
	public double computePerimeter();
}
