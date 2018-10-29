public class Time {
    long hour;
    long minute;
    long second;

    public Time()
    {long mili = System.currentTimeMillis();
    hour = mili/3600000;
    minute = (mili%360000)/60000;
    second = ((mili%360000)%6000)/1000;
    }

    public Time(long elapsedMiliseconds)
    {hour = elapsedMiliseconds/3600000;
        minute = (elapsedMiliseconds%360000)/60000;
        second = ((elapsedMiliseconds%360000)%6000)/1000;

    }
}
