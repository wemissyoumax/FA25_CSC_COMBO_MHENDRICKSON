
public class Exercise113 {
	public static class Date {

	    private int year;
	    private int month;
	    private int day;

	    public Date() {
	        this.year = 2000;
	        this.month = 1;
	        this.day = 1;
	    }

	    public Date(int year, int month, int day) {
	        this.year = year;
	        this.month = month;
	        this.day = day;
	    }

	    public int getYear() { return year; }
	    public int getMonth() { return month; }
	    public int getDay() { return day; }

	    @Override
	    public String toString() {
	        return month + "/" + day + "/" + year;
	    }


	    public static void main(String[] args) {

	        
	        Date birthday = new Date(2003, 5, 23); 

	        System.out.println("My birthday is: " + birthday);
	    }
	}

}
