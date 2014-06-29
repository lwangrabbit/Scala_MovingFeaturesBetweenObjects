package movingFeaturesFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import movingFeatures.removeMiddleMan.{DepartmentForRemoveMiddleMan, PersonForRemoveMiddleMan}

@RunWith(classOf[JUnitRunner])
class RemoveMiddleManFact extends FunSpec with Matchers {
  describe("RemoveMiddleManFact") {
    it("should_get_name_for_manager_of_john") {
      val managerName = "Kent";
      val manager = new PersonForRemoveMiddleMan(managerName);
      val department = new DepartmentForRemoveMiddleMan(manager);
      val employee = new PersonForRemoveMiddleMan(department, "John");
      //val managerForEmployee = employee.getManager();
      val managerForEmployee = employee.department.manager
      managerForEmployee.name should be(managerName)
    }
  }
}
