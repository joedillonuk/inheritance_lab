import Staff.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Billy Baekbuchs", "1", 200100.00, "CEO", 10000000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Billy Baekbuchs", director.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("1", director.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(200100, director.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1.02);
        assertEquals(204102, director.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(4002, director.payBonus(), 0.1);
    }
}
