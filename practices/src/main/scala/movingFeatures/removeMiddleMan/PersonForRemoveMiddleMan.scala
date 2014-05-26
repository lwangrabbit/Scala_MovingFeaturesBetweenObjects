package movingFeatures.removeMiddleMan

class PersonForRemoveMiddleMan(val department: DepartmentForRemoveMiddleMan, val name: String) {
  def this(name: String) = {
    this(null, name)
  }

  def getManager(): PersonForRemoveMiddleMan = {
    department.manager
  }
}
