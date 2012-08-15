import org.junit.{Ignore, Test}

/*
* -----------------------------------------------------------------------
*
* QATARLYST LIMITED
*
* -----------------------------------------------------------------------
*
* (C) Copyright 2012 Qatarlyst Limited. All rights reserved.
*
* NOTICE:  All information contained herein or attendant hereto is,
*          and remains, the property of Qatarlyst Limited.  Many of the
*          intellectual and technical concepts contained herein are
*          proprietary to Qatarlyst Limited. Any dissemination of this
*          information or reproduction of this material is strictly
*          forbidden unless prior written permission is obtained
*          from Qatarlyst Limited.
*
* -----------------------------------------------------------------------
*/

class StackMachineTest {


  @Test
  def testHappy1 = {
       org.junit.Assert.assertEquals( 76, new StackMachine().stack_machine_emulator("13+62*7+*")  )
  }


  @Test
   def testHappy2 = {
        org.junit.Assert.assertEquals( 4, new StackMachine().stack_machine_emulator("13+")  )
   }

  @Test
       def testUnhappy3= {
            org.junit.Assert.assertEquals( -1, new StackMachine().stack_machine_emulator("11++")  )
       }

  @Test
    def testUnhappy4 = {
         org.junit.Assert.assertEquals( -1, new StackMachine().stack_machine_emulator("1+3+")  )
    }

  @Test
      def testUnhappy5 = {
           org.junit.Assert.assertEquals( -1, new StackMachine().stack_machine_emulator("++1")  )
      }




}
