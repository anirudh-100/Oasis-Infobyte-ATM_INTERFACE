package com.java;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    new Bank();
  }
}

class Transaction {

  private User U;
  private String opration;
  private long anotherAccNo;
  private int amount;
  private int prevBalance;

  public long getAnotherAccNo() {
    return this.anotherAccNo;
  }

  public void setAnotherAccNo(long anotherAccNo) {
    this.anotherAccNo = anotherAccNo;
  }

  public User getUser() {
    return this.U;
  }

  public void setUser(User U) {
    this.U = U;
  }

  public String getOpration() {
    return this.opration;
  }

  public void setOpration(String opration) {
    this.opration = opration;
  }

  public int getAmount() {
    return this.amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getPrevBalance() {
    return this.prevBalance;
  }

  public void setPrevBalance(int balance) {
    this.prevBalance = balance;
  }
}

class User {

  private int user_id;
  private String user_name;
  private long account_number;
  private int pin;
  private int balance;package com.java;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    new Bank();
  }
}

class Transaction {

  private User U;
  private String opration;
  private long anotherAccNo;
  private int amount;
  private int prevBalance;

  public long getAnotherAccNo() {
    return this.anotherAccNo;
  }

  public void setAnotherAccNo(long anotherAccNo) {
    this.anotherAccNo = anotherAccNo;
  }

  public User getUser() {
    return this.U;
  }

  public void setUser(User U) {
    this.U = U;
  }

  public String getOpration() {
    return this.opration;
  }

  public void setOpration(String opration) {
    this.opration = opration;
  }

  public int getAmount() {
    return this.amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getPrevBalance() {
    return this.prevBalance;
  }

  public void setPrevBalance(int balance) {
    this.prevBalance = balance;
  }
}

class User {

  private int user_id;
  private String user_name;
  private long account_number;
  private int pin;
  private int balance;

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public int getUser_id() {
    return user_id;
  }

  public void setUser_id(int user_id) {
    this.user_id = user_id;
  }

  public String getUser_name() {
    return user_name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public int getUser_id() {
    return user_id;
  }

  public void setUser_id(int user_id) {
    this.user_id = user_id;
  }

  public String getUser_name() {
    return user_name;
  }
