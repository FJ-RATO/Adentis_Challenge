public class Date {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;

    public Date(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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
