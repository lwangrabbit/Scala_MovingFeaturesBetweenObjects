package movingFeaturesFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import java.util.{Calendar, GregorianCalendar}
import movingFeatures.IntroduceForeignMethod.DateManager
import movingFeatures.IntroduceLocalExtension.MyCalendar

@RunWith(classOf[JUnitRunner])
class IntroduceLocalExtensionFact extends FunSpec with Matchers {
  describe("IntroduceLocalExtensionFact") {
    it("should_get_correct_next_day") {
      val day = 11
      val calendar = createCalendar(day)
      val dateManager = new DateManager(calendar)
      dateManager.getDate().get(Calendar.DAY_OF_MONTH) should be(12)
    }
  }

  def createCalendar(day: Int):Calendar = {
    val calendar = new GregorianCalendar()
    calendar.set(Calendar.YEAR, 2011)
    calendar.set(Calendar.MONTH, 11)
    calendar.set(Calendar.DAY_OF_MONTH, day)
    calendar
  }
}
