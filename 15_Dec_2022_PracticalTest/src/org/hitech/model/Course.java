package org.hitech.model;
import java.util.Objects;
public class Course {
		 int courseId;
		 String courseName;
		 double price;
		 
		 public Course(){
				
			}
		 
		public Course(int cId, String cName,double cPrice) {
			
			this.courseId=cId;
			this.courseName=cName;
			this.price=cPrice;
		}
		
		public void setcourseId(int cId) {
			courseId=cId;
		}
		public void setcourseName(String cName) {
			courseName=cName;
		}
		public void setprice(double cPrice) {
			price=cPrice;
		}
		

		public int getCourseId() {
			return courseId;
		}
		public String getCourseName() {
			return courseName;
		}
		public double getCourseprice() {
			return price;
		}
		
		public String toString(){
			String text=courseId+" "+courseName+" "+price;
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
			Course other=(Course)obj;
			return Objects.equals(price, other.price)&&courseId==other.courseId 
					&&Objects.equals(courseName, other.courseName);
				
		}
		public int hashCode() {
			return Objects.hash(courseId,courseName,price);
		}

	


}
