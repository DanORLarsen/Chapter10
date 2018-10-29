public class Time {
    long hour;
    long minute;
    long second;

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public Time()
    {
        long mili = System.currentTimeMillis();
        this.hour = mili/3600000;
        this.minute = (mili%360000)/60000;
        this.second = ((mili%360000)%6000)/1000;
    }

    public Time(long elapsedMiliseconds)
    {
        this.hour = elapsedMiliseconds/3600000;
        this.minute = (elapsedMiliseconds%360000)/60000;
        this.second = ((elapsedMiliseconds%360000)%6000)/1000;
    }

    public Time(long hours, long minutes, long seconds)
    {
        this.hour = hours;
        this.minute = minutes;
        this.second = seconds;
    }

    public void setTime(long elapsedTime)
    {
        this.hour = elapsedTime/3600000;
        this.minute = (elapsedTime%360000)/60000;
        this.second = ((elapsedTime%360000)%6000)/1000;
    }

    public void displayTime()
    {
        System.out.println("Hours   = " + this.hour);
        System.out.println("Minutes = " + this.minute);
        System.out.println("Seconds = " + this.second);

    }

}
