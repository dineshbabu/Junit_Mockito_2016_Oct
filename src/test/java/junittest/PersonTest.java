package junittest;

import org.junit.Test;
import static org.junit.Assert.*;

import org.gradle.Person;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
}
