package movingFeatures.extractClass

class PersonForExtractClass(officeAreaCode: String, officeNumber: String) {

  val name: String = "";

  def getTelephoneNumber(): String = {
    ("(" + officeAreaCode + ") ") + officeNumber
  }
}
