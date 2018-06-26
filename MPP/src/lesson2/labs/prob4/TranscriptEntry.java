package lesson2.labs.prob4;

class TranscriptEntry {
	Student student;
	Section section;
	String grade;
	
	public String toString() {
		return "Student: " + student.name + "\n"
				+ "Course name: " + section.courseName + "\n"
				+ "Section number: " + section.sectionNumber + "\n"
				+ "Grade: " + grade + "\n";
	}
	
	TranscriptEntry()
	{
	}
	
	public static Section createSection(int secNum, String courseName)
	{
		Section sect = new Section();
		sect.courseName = courseName;
		sect.sectionNumber = secNum;
		return sect;
	}
	
	public static Student createStudent(String name)
	{
		Student s = new Student();
		s.name = name;
		return s;
	}
	
	public void newTranscriptEntry(Student s, Section sect, String grade)
	{
		this.section = sect;
		this.student = s;
		this.grade = grade;
	}
}
