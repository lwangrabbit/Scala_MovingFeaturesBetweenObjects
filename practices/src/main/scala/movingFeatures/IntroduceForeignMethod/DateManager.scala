package movingFeatures.IntroduceForeignMethod

import java.util.Calendar

class DateManager(previousDate:Calendar) {
  def getDate(): Calendar = {
    val myCalendar = new MyCalendar(previousDate)
    myCalendar.nextDay()
  }
}

class MyCalendar(val origin:Calendar){
  def nextDay():Calendar ={
    origin.add(Calendar.DAY_OF_MONTH, 1)
    origin
  }
}