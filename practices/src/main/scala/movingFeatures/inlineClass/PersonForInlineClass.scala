package movingFeatures.inlineClass

class PersonForInlineClass(officeAreaCode: String, officeNumber: String) {

  val name: String = "";

  def getTelephoneNumber(): String = {
    ("(" + officeAreaCode + ") ") + officeNumber
  }
}
