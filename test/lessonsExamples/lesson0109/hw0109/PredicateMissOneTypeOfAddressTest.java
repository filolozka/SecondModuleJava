package lessonsExamples.lesson0109.hw0109;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredicateMissOneTypeOfAddressTest {

    @Test
    public void test_billingAddress_true() {
        PersonaAddress address = new PersonaAddress(AddressType.BILLING, "Moscow, Lenin's street 1");
        assertTrue(new PredicateMissOneTypeOfAddress().test(address));
    }

    @Test
    public void test_otherAddress_false() {
        PersonaAddress address = new PersonaAddress(AddressType.EMAIL, "asfds@gmail.com");
        assertFalse(new PredicateMissOneTypeOfAddress().test(address));
    }

    @Test
    public void test_null_false() {
        assertFalse(new PredicateMissOneTypeOfAddress().test(null));
    }

    @Test
    public void test_emptyAddressBillingType_true() {
        PersonaAddress address = new PersonaAddress(AddressType.BILLING, "");
        assertTrue(new PredicateMissOneTypeOfAddress().test(address));
    }
}

