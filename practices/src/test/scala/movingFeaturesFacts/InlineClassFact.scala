package movingFeaturesFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import movingFeatures.inlineClass.PersonForInlineClass

@RunWith(classOf[JUnitRunner])
class InlineClassFact extends FunSpec with Matchers {
  describe("InlineClassFact") {
    it("should_get_correct_telephone_number") {
      val personForInlineClass = new PersonForInlineClass("CA", "01");
      personForInlineClass.getTelephoneNumber() should be("(CA) 01")
    }
  }
}
