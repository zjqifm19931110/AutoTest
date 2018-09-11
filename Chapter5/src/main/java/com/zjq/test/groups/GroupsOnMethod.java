package com.zjq.test.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups="server")
    public void test1(){
        System.out.println("服务端测试方法1");
    }

    @Test(groups="server")
    public void test2(){
        System.out.println("服务端测试方法2");
    }

    @Test(groups="client")
    public void test3(){
        System.out.println("客户端测试方法3");
    }

    @Test(groups="client")
    public void test4(){
        System.out.println("客户端测试方法44444");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnserver(){
        System.out.println("服务端测试组之前");
    }

    @AfterGroups("server")
    public void afterGroupsOnserver(){
        System.out.println("服务端测试组之后");
    }
//
//    @BeforeGroups
//    public void beforeGroupsOnclient(){
//
//    }
//
//    @AfterGroups
//    public void afterGroupsOnclient(){
//
//    }
}
