package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ApiaryTests.class, BeehiveTests.class, BeeTests.class })
public class AllTests {

}
