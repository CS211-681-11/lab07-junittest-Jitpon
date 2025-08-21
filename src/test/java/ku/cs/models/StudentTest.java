
package ku.cs.models;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;
    @BeforeEach
    void init(){
        s = new Student("6710404897","test");
    }

    @Test
    @DisplayName("TestAddScore")
    void testAddScore(){
        s.addScore(40.5);
        assertEquals(40.5, s.getScore());
    }

    @Test
    void testCalculateGrade(){
        s.addScore(90);
        assertEquals("A",s.grade());
    }

    @Test
    void testChangename(){
        s.changeName("Very Pao");
        assertEquals("Very Pao",s.getName());
    }
}









