package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import singleton.Apiary;

public class ApiaryTests {
    
    @Test
    public void testApiarySingleton() {
        Apiary apiary = Apiary.getInstance();
        Apiary apiary2 = Apiary.getInstance();
        assertTrue(apiary == apiary2);
    }
    
}
