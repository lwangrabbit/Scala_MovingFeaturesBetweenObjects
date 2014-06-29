package movingFeaturesFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import movingFeatures.extractClass.{TelephoneNumber, PersonForExtractClass}

@RunWith(classOf[JUnitRunner])
class ExtractClassFact extends FunSpec with Matchers {
  describe("ExtractClassFact") {
    it("should_get_correct_telephone_number") {
//      val personForExtractClass = new PersonForExtractClass("CA", "01");
      val telephone:TelephoneNumber = new TelephoneNumber("CA", "01")
      val personForExtractClass = new PersonForExtractClass(telephone)
      personForExtractClass.getTelephoneNumber() should be("(CA) 01")
    }
  }
}
