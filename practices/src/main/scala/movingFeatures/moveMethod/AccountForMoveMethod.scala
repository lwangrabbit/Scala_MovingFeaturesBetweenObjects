package movingFeatures.moveMethod

class AccountForMoveMethod(accountType: AccountTypeForMoveMethod, daysOverdrawn: Double) {
  def overDraftCharge():Double =
  {
    if (accountType.isPremium)
    {
      var result:Double = 10;
      if (daysOverdrawn > 7)
        result += (daysOverdrawn - 7)*0.85;
      return result;
    }

    return daysOverdrawn*1.75;
  }

  def bankCharge():Double =
  {
    var result = 4.5;
    if (daysOverdrawn > 0)
      result += overDraftCharge();
    result;
  }
}
