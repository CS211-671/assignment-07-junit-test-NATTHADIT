package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void testAddNewStudent(){
        StudentList list = new StudentList();
        list.addNewStudent("6610450161", "Stamp");
        list.addNewStudent("6610415001", "jim");

        assertEquals(2, list.getStudents().size());
    }

    @Test
    void secondTestAddNewStudent(){
        StudentList list = new StudentList();
        list.addNewStudent("6610450161", "Stamp", 12);
        list.addNewStudent("6610415001", "jim", 4);

        assertEquals(2, list.getStudents().size());
    }

    @Test
    void testGiveScoreToId(){
        StudentList list = new StudentList();
        list.addNewStudent("6610450161", "Stamp");
        list.addNewStudent("6610415001", "jim");
        list.giveScoreToId("6610450161", 50);
        Student s1 = list.findStudentById("6610450161");
        assertEquals(50, s1.getScore());
    }

    @Test
    void testViewGrade(){
        StudentList list = new StudentList();
        list.addNewStudent("6610450161", "Stamp");
        list.addNewStudent("6610415001", "jim");
        list.giveScoreToId("6610450161", 73);
        Student s1 = list.findStudentById("6610450161");
        assertEquals("B", s1.grade());
    }
}