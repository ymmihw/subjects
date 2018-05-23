package com.ymmihw.subjects.stringisnumeric;

public class IsNumericDriver {
  private static IsNumeric isNumeric;
  static {
    isNumeric = new IsNumeric();

  }

  public static void main(String[] args) {
    System.out.println("Testing all methods...");

    boolean res = isNumeric.usingCoreJava("1001");
    System.out.println("Using Core Java : " + res);

    res = isNumeric.usingRegularExpressions("1001");
    System.out.println("Using Regular Expressions : " + res);

    res = isNumeric.usingNumberUtils_isCreatable("1001");
    System.out.println("Using NumberUtils.isCreatable : " + res);

    res = isNumeric.usingNumberUtils_isParsable("1001");
    System.out.println("Using NumberUtils.isParsable : " + res);

    res = isNumeric.usingStringUtils_isNumeric("1001");
    System.out.println("Using StringUtils.isNumeric : " + res);

    res = isNumeric.usingStringUtils_isNumericSpace("1001");
    System.out.println("Using StringUtils.isNumericSpace : " + res);
  }
}
