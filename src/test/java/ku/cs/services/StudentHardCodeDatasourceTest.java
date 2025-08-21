package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    private StudentHardCodeDatasource datasource;

    @BeforeEach
    void setup() {
        datasource = new StudentHardCodeDatasource();
    }

    @Test
    void testReadDataReturnsCorrectList() {
        StudentList list = datasource.readData();
        assertNotNull(list);
    }

    @Test
    void testReadDataAddsCorrectStudents() {
        StudentList list = datasource.readData();

        assertNotNull(list.findStudentById("6710400001"));
        assertNotNull(list.findStudentById("6710400002"));
        assertNotNull(list.findStudentById("6710400003"));
        assertNotNull(list.findStudentById("6710400004"));
    }
}