package dvdav.reflection;

import org.junit.Test;

import static org.junit.Assert.*;
public class ClassTest {
    @Test
    public void test() {
        Class<ClassTest> aClass = Class.findByName("dvdav.reflection.ClassTest");
        assertEquals(aClass.get(), this.getClass());
    }
}