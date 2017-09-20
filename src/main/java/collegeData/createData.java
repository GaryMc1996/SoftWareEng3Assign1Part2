/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegeData;

import collegeDetails.CourseDetails;
import collegeDetails.Module;
import collegeDetails.Student;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 *
 * @author I330152
 */
public class createData {
    
    public static void main(String args[]){
        Student s1 = new Student("Gary McMahon", 21 , "19/06/1996", 14534653);
        Student s2 = new Student("Brian Casey", 21 , "25/05/1996", 14456781);
        Student s3 = new Student("Conor Proctor", 22 , "07/03/1995", 13456721);
        Student s4 = new Student("Conor Healy", 21 , "05/05/1996", 14789012);
        
        Module m1 = new Module("Software Engineering 3","CT431");
        Module m2 = new Module("Modern Information Management", "CT456");
        
        String startDate = "2014-09-02";
        String finishDate = "2018-05-17";
        DateTime dateTimeStart = new DateTime(startDate,DateTimeZone.forID("Europe/Dublin"));
        DateTime dateTimeFinish = new DateTime(finishDate,DateTimeZone.forID("Europe/Dublin"));
        
        CourseDetails c1 = new CourseDetails("Computer Science & IT",dateTimeStart,dateTimeFinish);
        
        m1.addStudent(s1);
        m1.addStudent(s2);
        m1.addStudent(s4);
        
        m2.addStudent(s3);
        m2.addStudent(s4);
        m2.addStudent(s1);
        
        c1.addCourseModules(m1);
        c1.addCourseModules(m2);
        
      
        System.out.println("Module "+ m1.getModuleName() +" has the following Students enrolled: " + m1.getStudentList());
        System.out.println("Module "+ m2.getModuleName() +" has the following Students enrolled: " + m2.getStudentList());
        System.out.println("Course "+ c1.getCourseName() +"start on the the "+c1.getStartDate() 
                +" and ends on the "+c1.getFinishDate()+ "has the following Courses: " + c1.getCourseModules());
        
        
    }
    
}
