package movingFeaturesFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import movingFeatures.hideDelegate.{DepartmentForHideDelegate, PersonForHideDelegate}

@RunWith(classOf[JUnitRunner])
class HideDelegateFact extends FunSpec with Matchers {
  describe("HideDelegateFact") {
    it("should_get_name_for_manager_of_john") {
      val managerName = "Kent";
      val manager = new PersonForHideDelegate(managerName);
      val departmentForHideDelegate = new DepartmentForHideDelegate(manager);
      val employee = new PersonForHideDelegate(departmentForHideDelegate, "John");
      //val managerForEmployee = employee.department.manager
      val managerForEmployee = employee.getManager()
      managerForEmployee.name should be(managerName)
    }
  }
}
