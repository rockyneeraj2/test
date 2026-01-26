package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipTest {

    @Test(enabled = false)
    public void skipTest1(){
        System.out.println("skip the test1");
    }

    @Test(enabled = false)
    public void skipTest2(){
        System.out.println("skip the test2");
        throw new SkipException("skip");
    }

    @Test(enabled = false)
    public void skipTest3(){
        System.out.println("skip the test3");
    }

    @Test(enabled = false)
    public void skipTest4(){
        System.out.println("skip the test4");
    }
}
