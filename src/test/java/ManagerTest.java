import Staff.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Ian Directoe", "WG 38 29 16 A", 26000.00, "Operations");
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1.02);
        assertEquals("26520.0", manager.getSalary().toString());
    }

    @Test
    public void cantReduceSalary(){
        manager.raiseSalary(-1.02);
        assertEquals(26000.0, manager.getSalary().toString());
    }

    @Test
    public void canPayBonus(){
        assertEquals("260.0", manager.payBonus().toString());
    }

    @Test
    public void canUpdateName(){
        manager.setName("Scotty");
        assertEquals("Scotty", manager.getName());
    }

    @Test
    public void cantUpdateNameWithEmptyString(){
        manager.setName("");
        assertEquals("Ian Directoe", manager.getName());
    }

}
