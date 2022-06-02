public class Dates {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;
    private int timestamp;

    public Dates(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.timestamp = (this.getYear()-1970)*31556926 + this.getMonth()*2419200 + this.getDay()*86400 + this.hour*3600 + this.minute*60 +this.second;
    }

    public boolean between(Dates start, Dates end){
        if((start.getTimestamp() <= this.timestamp) && (end.getTimestamp() >= this.timestamp))
            return true;
        return false;
    }

    public int getYear() {
        return this.year;
    }


    public int getMonth() {
        return this.month;
    }


    public int getDay() {
        return this.day;
    }


    public int getHour() {
        return this.hour;
    }


    public int getMinute() {
        return this.minute;
    }


    public int getSecond() {
        return this.second;
    }

    public int getTimestamp(){
        return this.timestamp;
    }
    @Override
    public String toString() {
        return "{" +
            " year='" + getYear() + "'" +
            ", month='" + getMonth() + "'" +
            ", day='" + getDay() + "'" +
            ", hour='" + getHour() + "'" +
            ", minute='" + getMinute() + "'" +
            ", second='" + getSecond() + "'" +
            "}";
    }

}
