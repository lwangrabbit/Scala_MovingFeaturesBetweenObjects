package movingFeaturesFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import movingFeatures.extractClass.PersonForExtractClass

@RunWith(classOf[JUnitRunner])
class ExtractClassFact extends FunSpec with Matchers {
  describe("ExtractClassFact") {
    it("should_get_correct_telephone_number") {
      val personForExtractClass = new PersonForExtractClass("CA", "01");
      personForExtractClass.getTelephoneNumber() should be("(CA) 01")
    }
  }
}
