package movingFeatures.extractClass

class PersonForExtractClass(telephone:TelephoneNumber) {

  val name: String = "";
  def getTelephoneNumber():String = {
    telephone.getTelephoneNumber()
  }
}

class TelephoneNumber(officeAreaCode:String, officeNumber:String) {
  def getTelephoneNumber():String = {
    ("(" + officeAreaCode + ") ") + officeNumber
  }
}