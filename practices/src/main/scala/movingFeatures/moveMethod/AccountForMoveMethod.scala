package movingFeatures.moveMethod

class AccountForMoveMethod(accountType: AccountTypeForMoveMethod, daysOverdrawn: Double) {
  def bankCharge():Double =
  {
    var result = 4.5;
    if (daysOverdrawn > 0)
      result += accountType.overDraftCharge(daysOverdrawn)
    result;
  }
}
