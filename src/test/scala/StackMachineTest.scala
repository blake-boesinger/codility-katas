import org.junit.{Ignore, Test}


class StackMachineTest {


  @Test
  def moreComplexCase = {
       org.junit.Assert.assertEquals( 76, new StackMachine().stack_machine_emulator("13+62*7+*")  )
  }


  @Test
   def simpleCase = {
        org.junit.Assert.assertEquals( 4, new StackMachine().stack_machine_emulator("13+")  )
   }

  @Test
       def tooManyOperatorsShouldResultInFailure= {
            org.junit.Assert.assertEquals( -1, new StackMachine().stack_machine_emulator("11++")  )
       }

  @Test
    def notEnoughDigitsShouldResultInFailure = {
         org.junit.Assert.assertEquals( -1, new StackMachine().stack_machine_emulator("1+3+")  )
    }

  @Test
      def tooManyInitialOperatorsShouldResultInFailure = {
           org.junit.Assert.assertEquals( -1, new StackMachine().stack_machine_emulator("++1")  )
      }




}
