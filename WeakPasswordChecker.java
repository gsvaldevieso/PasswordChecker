package com.password.checker;

public class WeakPasswordChecker implements Checkable{

  public Boolean check(){
      return false;
  }

  public String getCheckerAlert(){
    return "";
  }

}
