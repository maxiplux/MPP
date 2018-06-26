package lesson2.labs.prob4;

import java.util.ArrayList;

public class StudentSectionFactory {
	
	public Section createSection(int secNum, String courseName)
	{
		Section sect = new Section();
		sect.courseName = courseName;
		sect.sectionNumber = secNum;
		sect.gradeSheet = new ArrayList<TranscriptEntry>();
		return sect;
	}
	
	public Student createStudent(String id, String name)
	{
		Student s = new Student();
		s.id = id;
		s.name = name;
		s.grades = new ArrayList<TranscriptEntry>();
		return s;
	}
	
	public void newTranscriptEntry(Student s, Section sect, String grade)
	{
		if(s == null || sect == null)
			throw new IllegalArgumentException("Customer name cannot be null");
		
		TranscriptEntry te = new TranscriptEntry();
		te.student = s;
		te.section = sect;
		te.grade = grade;
		
		s.grades.add(te);
		sect.gradeSheet.add(te);		
	}
}
