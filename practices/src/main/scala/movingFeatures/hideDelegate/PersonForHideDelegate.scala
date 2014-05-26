package movingFeatures.hideDelegate

class PersonForHideDelegate(val department: DepartmentForHideDelegate, val name: String) {
  def this(name: String) = {
    this(null, name)
  }
}
