package movingFeaturesFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import movingFeatures.moveMethod.{AccountForMoveMethod, AccountTypeForMoveMethod}

@RunWith(classOf[JUnitRunner])
class MoveMethodFact extends FunSpec with Matchers {
  describe("MoveMethodFact") {
    it("should_not_get_over_draft_charge_given_is_premium_and_days_over_drawn_less_than_seven_days") {
      val isPremium = true;
      val accountTypeForMoveMethod = new AccountTypeForMoveMethod(isPremium);
      val accountForMoveMethod = new AccountForMoveMethod(accountTypeForMoveMethod, 6);
      accountForMoveMethod.bankCharge() should be(14.5)
    }

    it("should_get_over_draft_charge_given_is_premium_and_days_over_drawn_more_than_seven_days") {
      val isPremium = true;
      val accountTypeForMoveMethod = new AccountTypeForMoveMethod(isPremium);
      val accountForMoveMethod = new AccountForMoveMethod(accountTypeForMoveMethod, 8);
      accountForMoveMethod.bankCharge() should be(15.35)
    }

    it("should_get_over_draft_charge_given_is_not_premium") {
      val isPremium = false;
      val accountTypeForMoveMethod = new AccountTypeForMoveMethod(isPremium);
      val accountForMoveMethod = new AccountForMoveMethod(accountTypeForMoveMethod, 6);
      accountForMoveMethod.bankCharge() should be(15)
    }

    it("should_not_get_over_draft_charge_given_days_over_drawn_is_zero") {
      val isPremium = false;
      val accountTypeForMoveMethod = new AccountTypeForMoveMethod(isPremium);
      val accountForMoveMethod = new AccountForMoveMethod(accountTypeForMoveMethod, 0);
      accountForMoveMethod.bankCharge() should be(4.5)
    }
  }
}
