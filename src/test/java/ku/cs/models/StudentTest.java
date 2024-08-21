package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore(){
        Student s = new Student("6610450161", "Stamp");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        Student s = new Student("6610450161", "Stamp");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อ")
    void testChangeName(){
        Student s = new Student("6610450161", "stamp");
        s.changeName("Tontawan");
        assertEquals("Tontawan", s.getName());
    }


    @Test
    @DisplayName("ทดสอบการตรวจสอบID")
    void testId(){
        Student s = new Student("6610450161", "Stamp");
        assertTrue(s.isId("6610450161"));
    }


}