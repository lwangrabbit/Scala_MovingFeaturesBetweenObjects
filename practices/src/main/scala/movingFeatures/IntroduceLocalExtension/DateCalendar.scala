package movingFeatures.IntroduceLocalExtension

import java.util.Calendar

class DateCalendar(previousDate:Calendar) {
  def getDate(): Calendar = {
    previousDate.add(Calendar.DAY_OF_MONTH, 1)
    previousDate
  }
}

class MyCalendar(previousDate:Calendar) {
  def nextDay():Calendar = {
    previousDate.add(Calendar.DAY_OF_MONTH, 1)
    previousDate
  }
}
