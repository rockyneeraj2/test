package TestNG;

import org.testng.annotations.*;

public class GroupTest {

    @BeforeClass()
    public void beforeClass(){
        System.out.println("before class");
    }

    @BeforeGroups()
    public void beforBroup(){
        System.out.println("before group");
    }

    @Test(priority = 1,groups = "regression")
    public void Test1(){
        System.out.println("This is Test1");
    }

    @Test(priority = 2,groups = "regression")
    public void Test2(){
        System.out.println("This is  Test2");
    }

    @Test(groups = {"regression","bvt"})
    public void Test3(){
        System.out.println("This is  Test3");
    }

    @Test(groups = "bvt")
    public void Test4(){
        System.out.println("This is  Test4");
    }

    @Test(groups = "bvt")
    public void Test5(){
        System.out.println("This is  Test5");
    }
    @AfterGroups()
    public void afterBroup(){
        System.out.println("after group");
    }

    @AfterClass()
    public void afterclass(){
        System.out.println("after class");
    }
}
