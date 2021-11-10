package com.spring.product;

import org.junit.Test;

public class TVUser {

   @Test
   public void TvTest() {
   
      //LgTV tv = new LgTV();
      /*
       * tv.powerOn(); tv.volumeUp(); tv.volumeDown(); tv.powerOff();
       */
      
	  TV tv = new SamsungUTV(); 
	   
      tv.powerOn();
      tv.volumeUp();
      tv.volumeDown();
      tv.powerOff();
      

   }

}