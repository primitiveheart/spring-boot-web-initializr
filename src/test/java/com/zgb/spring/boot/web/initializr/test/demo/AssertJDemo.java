package com.zgb.spring.boot.web.initializr.test.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author xmly
 * @email guanbao.zhou@ximalaya.com
 * @Date 2021/2/21 10:19 下午
 * @Created By guanbao.zhou
 */
public class AssertJDemo {

  public static String getName() {
    return "AssertJ";
  }

  public static List<String> getList() {
    return Stream.of("frodo", "sam", "sauronS").collect(Collectors.toList());
  }

  public static int add(int a, int b) {
    return a + b;
  }

  public static int multiply(int a, int b) {
    return a * b;
  }
}
