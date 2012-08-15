import org.junit.{Ignore, Test}


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
