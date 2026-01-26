package TestNG;

import org.testng.annotations.Test;

public class Test_Suits {

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
}
