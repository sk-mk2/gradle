import java.time.*;

public class Clock {
    private LocalTime now = LocalTime.now();

    Clock (String time) {
        now = LocalTime.parse(time);
    }

    Clock () {
    }
    
    private boolean judgeTime(LocalTime start,LocalTime end) {
        if(now.isAfter(start) && now.isBefore(end)) {
            return true;
        }
        return false;
    } 

    public boolean isMorning() {
        LocalTime morningStart = LocalTime.parse("04:59:59");
        LocalTime morningEnd = LocalTime.parse("12:00:00");
        return judgeTime(morningStart,morningEnd);
    }
    public boolean isAfternoon() {
        LocalTime afternoonStart = LocalTime.parse("11:59:59");
        LocalTime afternoonEnd = LocalTime.parse("18:00:00");
        return judgeTime(afternoonStart,afternoonEnd);
    }
    public boolean isNight() {
        LocalTime nightStart = LocalTime.parse("17:59:59");
        LocalTime nightEnd = LocalTime.parse("05:00:00");
        if(now.isAfter(nightStart)) {
            return true;
        } 
        if(now.isBefore(nightEnd)) {
            return true;
        }
        return false;
    }
}
