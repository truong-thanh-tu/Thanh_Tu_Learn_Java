package session;

public class Time {
	private int second,minite,hour;
	
	public Time(int second, int minute,int hour) {
		this.second =second;
		this.minite = minute;
		this.hour = hour;
	}
	public Time() {
		this.second = 0;
		this.minite = 0;
		this.hour = 0;
	}
	
	public void setSecond(int second) {
		if(second >= 0 && second <= 59) {
			this.second = second;
		}
		else {
			this.second = 0;
			System.out.println("Error: invalid second");
		}
	}
	public void setMinute(int mimute) {
		if(mimute >= 0 && mimute <= 59) {
			this.minite  = mimute;
		}
		else {
			this.minite = 0;
			System.out.println("error: invalid minute");
		}
	}
	public void setHour(int hour) {
		if(hour >= 0 && hour <= 23) {
			this.hour = hour;
		}
		else {
			this.hour =hour;
			System.out.println("error: invalid hour");
		}
	}
	public void setTime(int second,int minute, int hour) {
		this.second = second;
		this.minite = minute;
		this.hour = hour;
	}
	public Time nextSecond() {
		++second;
		if(second >= 60) {
			second = 0;
			++minite;
			if(minite >= 60) {
				minite = 0;
				++hour;
			}
			if(hour >= 24) {
				hour = 0;
			}
			
		}
		return this;
	}
}
