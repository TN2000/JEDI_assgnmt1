/**
 * 
 */
package com.flipkart.service;

/**
 * @author Aditya
 *
 */
public class Admininterface 
{
	
	/**
	 * Method to generate grade card of a Student 
	 * studentId
	 * throws StudentNotFoundException 
	 */
	
	public void generateGradeCard(int Studentid);
	
	/**
	 * Method to approve a Student 
	 * studentId
	 * studentList
	 * throws StudentNotFoundException 
	 */
	
	public void verifyStudent(int studentid, List<Student> studentlist);
	
	/**
	 * Method to add Professor to DB
	 * professor : Professor Object storing details of a professor
	 * throws UserIdAlreadyInUseException 
	 */
	
	public void addProfessor(Professor professor);
	
	/**
	 * Method to Remove Course from Course Catalog
	 * courseCode
	 * courseList : Courses available in the catalog
	 * throws CourseNotFoundException 
	 */

	public void removeCourse(String coursecode, List<Course> courselist);
	
	/**
	 * Method to add Course to Course Catalog
	 * course : Course object storing details of a course
	 * courseList : Courses available in the catalog
	 * throws CourseFoundException;
	 */
	
	public void addCourse(Course course, List<Course> courselist);
}
