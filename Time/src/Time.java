
public class Time {
	int hour;
	int minutes;
	double seconds;
	// default constructor
	public Time() {
		this.hour = 0;
		this.minutes = 0;
		this.seconds = 0.0;
	}
	
	public Time(int hour, int minutes, double seconds) {
		super();
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public double getSeconds() {
		return seconds;
	}

	public void setSeconds(double seconds) {
		this.seconds = seconds;
	}
	
	
}
