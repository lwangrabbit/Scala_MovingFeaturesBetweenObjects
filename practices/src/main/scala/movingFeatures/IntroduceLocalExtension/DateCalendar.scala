package movingFeatures.IntroduceLocalExtension

import java.util.Calendar

class DateCalendar(previousDate:Calendar) {
  def getDate(): Calendar = {
    previousDate.add(Calendar.DAY_OF_MONTH, 1)
    previousDate
  }
}

object MyCalendar {
  def nextDay(previousDate:Calendar):Calendar = {
    previousDate.add(Calendar.DAY_OF_MONTH, 1)
    previousDate
  }
}
