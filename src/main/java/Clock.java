import java.time.*;

public class Clock {
    private LocalTime now;
    private LocalTime morningStart;
    private LocalTime morningEnd;
    private LocalTime afternoonStart;
    private LocalTime afternoonEnd;
    private LocalTime nightStart;
    private LocalTime nightEnd;

    Clock (String time) {
        now = LocalTime.parse(time);
    }

    Clock () {
        now = LocalTime.now();
    }
    
    private boolean judgeTime(LocalTime start,LocalTime end) {
        if(now.isAfter(start) && now.isBefore(end)) {
            return true;
        }
        return false;
    } 

    public boolean isMorning() {
        morningStart = LocalTime.parse("04:59:59");
        morningEnd = LocalTime.parse("12:00:00");
        return judgeTime(morningStart,morningEnd);
    }
    public boolean isAfternoon() {
        afternoonStart = LocalTime.parse("11:59:59");
        afternoonEnd = LocalTime.parse("18:00:00");
        return judgeTime(afternoonStart,afternoonEnd);
    }
    public boolean isNight() {
        nightStart = LocalTime.parse("17:59:59");
        nightEnd = LocalTime.parse("05:00:00");
        if(now.isAfter(nightStart)) {
            return true;
        } 
        if(now.isBefore(nightEnd)) {
            return true;
        }
        return false;
    }
}
