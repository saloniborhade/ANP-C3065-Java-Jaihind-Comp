package org.hitech.dao;
import java.util.HashMap;
import org.hitech.model.Course;
import org.hitech.model.Student;
public class Student_Course_DAO {
private static	HashMap<Student,Course>hashMap=new HashMap<>();

public boolean addStudentCourseDetails(Student s, Course c) {
	boolean addStatus=false;
	 hashMap.put(s,c);
	 addStatus=true;
	return addStatus;
	
  }
public HashMap<Student,Course>getStudentCourseDetails(){
	
	return hashMap;
	 
  }
public boolean deleteStudentCourseDetails(Student s){
	boolean status=false;
	hashMap.remove(s);
	status=true;
	return status;
}

}
