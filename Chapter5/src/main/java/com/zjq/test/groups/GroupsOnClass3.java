package com.zjq.test.groups;


import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("GroupsOnClass3中teacher1！");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3中teacher222运行");
    }
}
