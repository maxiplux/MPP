package lesson10.labs.prob1.bugreporter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import lesson10.labs.prob1.classfinder.ClassFinder;

/**
 * This class scans the package lesson10.labs.prob2.javapackage for classes with
 * annotation @BugReport. It then generates a bug report bugreport.txt,
 * formatted like this:
 * 
 * Joe Smith reportedBy: classname: description: severity:
 * 
 * reportedBy: classname: description: severity:
 * 
 * Tom Jones reportedBy: classname: description: severity:
 * 
 * reportedBy: classname: description: severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "lesson10.labs.prob1.javapackage";
	private static final String REPORT_NAME =   "src\\lesson10\\labs\\prob1\\bugreporter\\bug_report.txt";
	
			

	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";

	public String createTemplateReport(HashMap<String, List<HashMap<String, BugReport>>> report) {
		StringBuilder template = new StringBuilder();

		report.forEach((key, value) -> {
			template.append(String.format("%s \n", key));
			value.forEach((map_bug) -> {
				map_bug.forEach((clasname, bug) -> {

					String line = String
							.format("\treportedBy:%s\n" + "\tClassName:%s\n" + "\tdescription:%s\n" + "\tseverity:%s\n"

									, bug.reportedBy(), clasname, bug.description(), bug.severity());
					template.append(line);
				});

			});
			template.append("\n");
		});

		return template.toString();
	}

	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);

		// sample code for reading annotations -- you will need to change
		// this quite a bit to solve the problem
		// Sample code below obtains a list of names of developers assigned to bugs
		HashMap<String, List<HashMap<String, BugReport>>> report = new HashMap<String, List<HashMap<String, BugReport>>>();

		for (Class<?> cl : classes) {
			if (cl.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport) cl.getAnnotation(BugReport.class);

				if (report.containsKey(annotation.assignedTo())) {

					List<HashMap<String, BugReport>> old_container = report.get(annotation.assignedTo());
					HashMap<String, BugReport> old_list = new HashMap<String, BugReport>();
					old_list.put(cl.getName(), annotation);
					old_container.add(old_list);
					report.put(annotation.assignedTo(), old_container);

				} else {

					HashMap<String, BugReport> new_container = new HashMap<String, BugReport>();
					new_container.put(cl.getName(), annotation);
					List<HashMap<String, BugReport>> new_list = new ArrayList<HashMap<String, BugReport>>();
					new_list.add(new_container);
					report.put(annotation.assignedTo(), new_list);
				}

			}

		}

		System.out.println(this.createTemplateReport(report));
		this.SaveReport(this.createTemplateReport(report));

	}

	public void SaveReport(String content) {

		PrintWriter pw;
		try {
			
			pw = new PrintWriter(new FileOutputStream(this.REPORT_NAME), true);
			pw.println(content);
			pw.close();
		} catch (FileNotFoundException e) {
			LOG.warning("IOException thrown when reading file: " + e.getMessage());
		}

	}

}
