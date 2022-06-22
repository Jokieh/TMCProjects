
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    private void advanceDay () {
        if (day < 30) {
            day++;
        } else {
            day = 1;
            advanceMonth();
        }
    }

    private void advanceMonth () {
        if (month < 12) {
            month++;
        } else {
            month = 1;
            year++;
        }
    }

    public void advance () {
        advanceDay();
    }


    public void advance (int howManyDays) {
        for (int i = howManyDays; howManyDays > 0; howManyDays--) {
            advanceDay();
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate afterDate = new SimpleDate(this.day, this.month, this.year);
        for (int i = days; days > 0; days--) {
            afterDate.advanceDay();
        }
        return afterDate;
    }
}
