package unit

import org.scalatest.FunSuite

@org.junit.runner.RunWith(classOf[org.scalatest.junit.JUnitRunner])
class AppUnitTest extends FunSuite {

  test("List size") {
    assert(List().size == 0)
  }
  
}
