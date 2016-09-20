/**
 * Created by mfcobo on 9/13/16.
 */
public class Date{
	private int year;
	private int month;
	private int day;
	Date(){
		this.year = 1000;
		this.month = 1;
		this.day = 1;
	}
	Date(int year, int month, int day){
		setDate(year,month,day);
	}
	public void setDate(int year, int month, int day){
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	public void setYear(int year){
		if(year < 1000 || year > 9999){
			throw new IllegalArgumentException("Year out of bounds!");
		}
		this.year = year;
	}
	public void setMonth(int month){
		if(month < 1 || month > 12){
			throw new IllegalArgumentException("Month out of bounds!");
		}
		this.month = month;
	}
	public void setDay(int day){
		if(day < 1 || day > 31){
			throw new IllegalArgumentException("Day out of bounds!");
		}
		if(month == 2 && day > 28){
			if(this.year % 4 != 0){
				if(!(this.year % 100 == 0 && this.year % 400 == 0)){
					throw new IllegalArgumentException("Day out of bounds!");
				}
			}
			if(day > 29){
				throw new IllegalArgumentException("Day out of bounds!");
			}
		}
		if(month == 4 || month == 6 || month == 9 || month == 11){
			if(this.day > 30){
				throw new IllegalArgumentException("Day out of bounds!");
			}
		}
		this.day = day;
	}
	public String toString(){
		return String.format("%02d/%02d/%d",this.day,this.month,this.year);
	}
}