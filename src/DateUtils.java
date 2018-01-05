
import datediff.MyDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dolly
 */
public class DateUtils {
    
 int[] daysUptoMonth = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };
    int[] daysUptoLeapMonth = { 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335 };

    public DateUtils() {

    }

    public int difference(MyDate date, MyDate date2) {
        // convert to seconds
        if(date != null && date2 != null) {
            int daysDiff = 0;
            if(date2.getYear() == date.getYear()) {
                daysDiff = getDaysDifferenceInSameYear(date, date2);
            }else {

                // get remaining days
                daysDiff = getDaysRemaining(date);
                date.setYear(date.getYear() + 1);


                while(date.getYear() < date2.getYear()) {
                    daysDiff += date.isLeapYear()? 366 : 365;
                    date.setYear(date.getYear() + 1);
                }

                // get the reaminig days
                daysDiff += getDaysInYearsTillDate(date2);
            }

            return daysDiff;
        }else {
            throw new NullPointerException("Date cannot be null");
        }
    }

    public int getDaysRemaining(MyDate date) {
        if(date != null) {
            if(date.isLeapYear()) {
                if(date.getMonth() == 12)
                    return 31- date.getDay();
                else
                    return 366 - daysUptoLeapMonth[date.getMonth()-1] + date.getDay();

            }else {
                if(date.getMonth() == 12)
                    return 31- date.getDay();
                else
                    return 365 - (daysUptoMonth[date.getMonth()-1]) + date.getDay();
            } 
        }else {
            throw new NullPointerException("Date cannot be null");
        }
    }

    public int getDaysInYearsTillDate(MyDate date)
    {
      if(date != null) {
          if (date.isLeapYear())
        {
          return daysUptoLeapMonth[date.getMonth() - 1] + date.getDay();
        }
        else
        {
          return daysUptoMonth[date.getMonth()-1] + date.getDay();
        }
      }else {
          throw new NullPointerException("Date cannot be null");
      }
    }

    public int getDaysDifferenceInSameYear(MyDate date, MyDate date2)
    {
        
      if(date != null && date2 != null) {
          if (date.isLeapYear())
            {
              return daysUptoLeapMonth[date2.getMonth() - 1] - daysUptoLeapMonth[date.getMonth() - 1] +
                      (date2.getDay() - date.getDay());
            }
            else
            {
              return daysUptoMonth[date2.getMonth() - 1] - daysUptoMonth[date.getMonth() - 1] +
                      (date2.getDay() - date.getDay());
            }
      }else {
          throw new NullPointerException("Date cannot be null");
      }
    }
}
   

