/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ST10287087
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import programmingassignmentanswer1.Student;

/**
 *
 * @author deves
 */
public class StudentIT {
    
    public StudentIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getStudentID();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetStudentID() {
        System.out.println("setStudentID");
        int studentID = 0;
        Student instance = new Student();
        instance.setStudentID(studentID);
        
    }

    @Test
    public void testGetStudentName() {
        System.out.println("getStudentName");
        Student instance = new Student();
        instance.setStudentName("ben");
        String expResult = "ben";
        String result = instance.getStudentName();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetStudentName() {
        System.out.println("setStudentName");
        String studentName = "";
        Student instance = new Student();
        instance.setStudentName(studentName);
       
    }

    @Test
    public void testGetStudentAge() {
        System.out.println("getStudentAge");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getStudentAge();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetStudentAge() {
        System.out.println("setStudentAge");
        int studentAge = 0;
        Student instance = new Student();
        instance.setStudentAge(studentAge);

    }

    @Test
    public void testGetStudentEmail() {
        System.out.println("getStudentEmail");
        Student instance = new Student();
        instance.setStudentEmail("benDover@gmail.com");
        String expResult = "benDover@gmail.com";
        String result = instance.getStudentEmail();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetStudentEmail() {
        System.out.println("setStudentEmail");
        String studentEmail = "";
        Student instance = new Student();
        instance.setStudentEmail(studentEmail);
  
    }

    @Test
    public void testGetStudentCourse() {
        System.out.println("getStudentCourse");
        Student instance = new Student();
        instance.setStudentCourse("nweg");
        String expResult = "nweg";
        String result = instance.getStudentCourse();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetStudentCourse() {
        System.out.println("setStudentCourse");
        String studentCourse = "";
        Student instance = new Student();
   
       
    }

    @Test
    public void testSaveStudent() {
        System.out.println("SaveStudent");
        Student.SaveStudent();
     
    }

    @Test
    public void testSearchStudent() {
        System.out.println("SearchStudent");
        Student.SearchStudent();
        
    }

    @Test
    public void testDeleteStudent() {
        System.out.println("DeleteStudent");
        Student.DeleteStudent();
     
    }

    @Test
    public void testStudentReport() {
        System.out.println("StudentReport");
        Student.StudentReport();
      
    }

    @Test
    public void testExitStudentApplication() {
        System.out.println("ExitStudentApplication");
    //    Student.ExitStudentApplication();
      
    }
    
}
