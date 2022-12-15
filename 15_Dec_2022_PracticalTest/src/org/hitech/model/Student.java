package org.hitech.model;

import java.util.Objects;

public class Student {
	private int studentId;
	private String studentName;
	private String qualification;
	 
	 public Student(){
			
		}
	 
	public Student(int sId, String sName,String sQualification) {
		
		this.studentId=sId;
		this.studentName=sName;
		this.qualification=sQualification;
	}
	
	public void setstudentId(int sId) {
		studentId=sId;
	}
	public void setstudentName(String sName) {
		studentName=sName;
	}
	public void setqualification(String sQualification) {
		qualification=sQualification;
	}
	

	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getStudentqualification() {
		return qualification;
	}
	
	public String toString(){
		String text=studentId+" "+studentName+" "+qualification;
		return text;
	}
@Override
public boolean equals( Object obj) {
		if (this==obj)
			return true;
		if (obj==null)
			return false;
		if (getClass()!=obj.getClass())
			return false;
		Student other=(Student)obj;
		return Objects.equals(qualification, other.qualification)&&studentId==other.studentId 
				&&Objects.equals(studentName, other.studentName);
			
	}
	public int hashCode() {
		return Objects.hash(studentId,studentName,qualification);
	}

}
