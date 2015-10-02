package com.password.checker;

public class RegularPasswordChecker implements Checkable{

  public Boolean check(){
      return false;
  }

  public String getCheckerAlert(){
    return "";
  }

}
