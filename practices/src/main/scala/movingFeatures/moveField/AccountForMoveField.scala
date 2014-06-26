package movingFeatures.moveField

class AccountForMoveField(accountTypeForMoveField: AccountTypeForMoveField, interestRate:Double) {
  def interestForAmountDays(amount: Double, days: Int): Double = {
    getInterestRate() * amount * days / 365;
  }

  def methodIsUsingInterestRate1(): Double = {
    getInterestRate() * 2;
  }

  def MethodIsUsingInterestRate2(): Double = {
    getInterestRate() * 3;
  }

  private def getInterestRate():Double = accountTypeForMoveField.getInterestRate()

  private def setInterestRate(arg:Double) = {
    accountTypeForMoveField.setInterestRate(arg)
  }

}
