package com.multicampus.biz.junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MyCalcTest.class, UserServiceTest.class })
public class AllTests {

}
