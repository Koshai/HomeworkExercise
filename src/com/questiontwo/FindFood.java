package com.questiontwo;

import org.testng.annotations.Test;
import com.questiontwo.BaseScript;;

public class FindFood extends BaseScript{
  @Test
  public void printfoodname() {
	  modelget().getItem(3);
	  modelget().getItem(5);
	  modelget().listemout();
  }
}
