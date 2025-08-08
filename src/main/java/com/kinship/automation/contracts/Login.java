package com.kinship.automation.contracts;

public interface Login {

  boolean isVisble(int timeoutInSeconds);

  void login(String username, String password);
}
