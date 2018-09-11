package com.zjq.test.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {

    public void stu1(){
        System.out.println("GroupsOnClass2中stu1111111111运行！");
    }

    public void stu2(){
        System.out.println("GroupsOnClass2中stu222222222222运行！");
    }
}
