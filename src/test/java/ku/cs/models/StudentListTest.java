package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
        private StudentList list;

        @BeforeEach
        void init(){
            list = new StudentList();
        }

        @Test
        void testStudentById(){
            list.addNewStudent("001","Pao");
            list.addNewStudent("002","Pong");
            list.addNewStudent("003","Phai");
            assertNotNull(list.findStudentById("001"));
            assertNotNull(list.findStudentById("002"));
            assertNotNull(list.findStudentById("003"));
        }

        @Test
        void testStudentByName(){
            list.addNewStudent("001","Pao");
            list.addNewStudent("012","TAN");
            list.addNewStudent("042","PA");
            assertNotNull(list.filterByName("PA"));
        }

    @Test
    void testGiveScore(){
        list.addNewStudent("001","Pao",30);
        assertEquals("F",list.viewGradeOfId("001"));
        list.giveScoreToId("001",70);
        assertEquals("A",list.viewGradeOfId("001"));

    }


}

