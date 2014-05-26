package movingFeatures.inlineClass

class PersonForInlineClass(officeAreaCode: String, officeNumber: String) {

  val name: String = "";
  val telephoneNumberForInlineClass = new TelephoneNumberForInlineClass(officeAreaCode, officeNumber)

  def getTelephoneNumber(): String = {
    telephoneNumberForInlineClass.getTelephoneNumber()
  }
}
