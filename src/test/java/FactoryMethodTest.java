import com.doddlecode.Belgium;
import com.doddlecode.Country;
import com.doddlecode.CountryFactory;
import com.doddlecode.Croatia;
import com.doddlecode.England;
import com.doddlecode.France;
import com.doddlecode.WrongCountryException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class FactoryMethodTest {

    @Test
    public void checkingIfFactoryMethodWillReturnFrance() {
        Country france = CountryFactory.getCountry("France");
        // Now let's check if France is an instance of France class
        assertTrue(france instanceof France);
        // And a few tests with usage of country fields
        assertEquals("France", france.getCountryName());
        /*
         * I used 0 value as a delta because it was just comparing two values, not any math operation.
         * Remember, that math operations with doubles can sometimes return different values, so if you
         * are writing tests for that kind of operations, you should adjust proper delta value.
         */
        assertEquals(33.33, france.getCorporateTax(), 0);
        assertEquals(45.0, france.getIndividualTax(), 0);
        assertEquals(20.0, france.getVatTax(), 0);
    }

    @Test
    public void checkingIfFactoryMethodWillReturnCroatia() {
        Country croatia = CountryFactory.getCountry("Croatia");
        // And the same tests as for France
        assertTrue(croatia instanceof Croatia);
        assertEquals("Croatia", croatia.getCountryName());
        assertEquals(20.0, croatia.getCorporateTax(), 0);
        assertEquals(40.0, croatia.getIndividualTax(), 0);
        assertEquals(25.0, croatia.getVatTax(), 0);
    }

    @Test
    public void checkingIfFactoryMethodWillReturnBelgium() {
        Country belgium = CountryFactory.getCountry("Belgium");
        // And the same tests as for France
        assertTrue(belgium instanceof Belgium);
        assertEquals("Belgium", belgium.getCountryName());
        assertEquals(33.99, belgium.getCorporateTax(), 0);
        assertEquals(50.0, belgium.getIndividualTax(), 0);
        assertEquals(21.0, belgium.getVatTax(), 0);
    }

    @Test
    public void checkingIfFactoryMethodWillReturnEngland() {
        Country england = CountryFactory.getCountry("England");
        // And the same tests as for France
        assertTrue(england instanceof England);
        assertEquals("England", england.getCountryName());
        assertEquals(20.0, england.getCorporateTax(), 0);
        assertEquals(20.0, england.getIndividualTax(), 0);
        assertEquals(20.0, england.getVatTax(), 0);
    }

    @Test(expected = WrongCountryException.class)
    public void checkingWhatWillHappenWhenFactoryMethodParamWillNotFitForAnyOption() {
        Country russia = CountryFactory.getCountry("Russia");
    }

}
