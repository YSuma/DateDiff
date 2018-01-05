package datediff;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dolly
 */
public class MyDate {
  
    
    private int day;
    private int month;
    private int year;
    
    public MyDate() {
        
    }
    
    private MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        
        validateDate();
    }
    
    /**
     *
     * @param date
     */
    public MyDate(String date)  {
        if(date.contains(" ")) {
            splitDate(date);
        }else {
            throw new IllegalArgumentException("Date shoud be splitted with space");
        }
        
        
        validateDate();
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    private void splitDate(String date) {
        String[] splittedDate = date.split(" ");
       
        setDay(Integer.valueOf(splittedDate[0].trim()));
        setMonth(Integer.valueOf(splittedDate[1].trim()));
        setYear(Integer.valueOf(splittedDate[2].trim()));
    }
    
    public boolean isDateValid() {
        if(this.day < 0 && this.day > 31)
            return false;
        
        if(this.month < 1 && this.month > 12)
            return false;
        
        if(this.year < 1990)
            return false;
        
        switch(this.month) {
            case 1: return (this.day>0 && this.day <= 31)? true : false;
            case 2: return isLeapYear()? (this.day>=0 & this.day<=28):
                    (this.day>0 && this.day<29);
            case 3: return (this.day>0 &&this.day<=31);
            case 4: return (this.day>0 &&this.day<=30);
            case 5: return (this.day>0 &&this.day<=31);
            case 6: return (this.day>0 &&this.day<=30);
            case 7: return (this.day>0 &&this.day<=31);
            case 8: return (this.day>0 &&this.day<=31);
            case 9: return (this.day>0 &&this.day<=30);
            case 10: return (this.day>0 &&this.day<=31);
            case 11: return (this.day>0 &&this.day<=30);
            case 12: return (this.day>0 &&this.day<=31);
        }
        
        return false;
    }
    
    private void validateDate() {
        if(!isDateValid()) {
            throw new IllegalArgumentException("Date is Invalid");
        }
    }
    
    public boolean isLeapYear() {
        return (this.year%4 == 0) && ((this.year % 400 == 0));
    }
}  
