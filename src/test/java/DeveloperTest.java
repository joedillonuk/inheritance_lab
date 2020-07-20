import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Joe", "JN 84 27 46 B", 26550.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Joe", developer.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("JN 84 27 46 B", developer.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(26550, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1.02);
        assertEquals(27081, developer.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(265.5, developer.payBonus(), 0.1);
    }
}
