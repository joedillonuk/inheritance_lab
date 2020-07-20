import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Data", "OI 01 10 11 O", 110111.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Data", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("OI 01 10 11 O", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(110111, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1.02);
        assertEquals(112313.22, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1101.1, databaseAdmin.payBonus(), 0.1);
    }
}
