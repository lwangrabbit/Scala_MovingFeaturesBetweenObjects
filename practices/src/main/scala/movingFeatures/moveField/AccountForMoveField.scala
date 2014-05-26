package movingFeatures.moveField

class AccountForMoveField(accountTypeForMoveField: AccountTypeForMoveField, interestRate: Double) {
  def interestForAmountDays(amount: Double, days: Int): Double = {
    interestRate * amount * days / 365;
  }

  def methodIsUsingInterestRate1(): Double = {
    interestRate * 2;
  }

  def MethodIsUsingInterestRate2(): Double = {
    interestRate * 3;
  }
}
