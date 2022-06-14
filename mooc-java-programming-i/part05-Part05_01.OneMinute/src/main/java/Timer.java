public class Timer {
    private Integer seconds;
    private Integer hundredths;

    public Timer() {
        this.seconds = 0;
        this.hundredths = 0;
    }

    public void advance () {
        hundredths++;

        if (hundredths == 100) {
            hundredths = 0;
            seconds++;
        }

        if (seconds == 60) {
            seconds = 0;
        }
    }

    public String toString () {
        String secondsDisplay;
        String hundredthsDisplay;

        if (seconds < 10) {
            secondsDisplay = "0" + seconds;
        } else secondsDisplay = seconds.toString();

        if (hundredths < 10) {
            hundredthsDisplay = "0" + hundredths;
        } else hundredthsDisplay = hundredths.toString();

        return secondsDisplay + ":" + hundredthsDisplay;
    }
}
