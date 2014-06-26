package movingFeatures.moveMethod

class AccountTypeForMoveMethod(val isPremium:Boolean) {
  def overDraftCharge(daysOverdrawn:Double):Double = {
    if(!isPremium)  return daysOverdrawn * 1.75
    if(daysOverdrawn <= 7)  return 10
    return 10 + (daysOverdrawn - 7) * 0.85
  }
}
