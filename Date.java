/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    
	public int compareTo( Object otherObj){
		 Date otherDate = (Date) otherObj;
		 int date1 = y*365 + m*30 + d;
		 int date2 = otherDate.y*365 + otherDate.m*30 + otherDate.d;
		 return date1 - date2;
	}
    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

}