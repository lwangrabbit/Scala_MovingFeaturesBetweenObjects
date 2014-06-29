package movingFeatures.IntroduceForeignMethod

import java.util.Calendar

class DateManager(previousDate:Calendar) {
  def getDate(): Calendar = {
    nextDay()
  }

  def nextDay():Calendar = {
    previousDate.add(Calendar.DAY_OF_MONTH, 1)
    previousDate
  }
}

