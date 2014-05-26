package movingFeaturesFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import movingFeatures.moveField.{AccountForMoveField, AccountTypeForMoveField}

@RunWith(classOf[JUnitRunner])
class MoveFieldFact extends FunSpec with Matchers {
  describe("MoveFieldFact") {
    it("should_get_correct_interest_for_amount_days") {
      val accountTypeForMoveField = new AccountTypeForMoveField();
      val interestRate = 0.03;
      val accountForMoveField = new AccountForMoveField(accountTypeForMoveField, interestRate);
      accountForMoveField.interestForAmountDays(1000, 365) should be(30)
    }
  }
}
