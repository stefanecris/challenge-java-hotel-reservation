package hotelreservation;

public class Hotel {
    private String name;
    private int rating;
    private float weekdayRate, weekendRate;
    private float total;

    public Hotel(String name, int rating, float weekdayRate, float weekendRate) {
        this.name = name;
        this.rating = rating;
        this.weekdayRate = weekdayRate;
        this.weekendRate = weekendRate;
        this.total = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public float getWeekdayRate() {
        return weekdayRate;
    }

    public void setWeekdayRate(float weekdayRate) {
        this.weekdayRate = weekdayRate;
    }

    public float getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(float weekendRate) {
        this.weekendRate = weekendRate;
    }

    public float getTotal() {
        return total;
    }
    
    public int getWeekdayNumber(String date){
        String dayOfTheWeek = getDayOfTheWeek(date);
        String[] week = {"sun", "mon", "tues", "wed", "thur", "fri", "sat"};
        int weekdayNumber = -1, i;
        
        for(i = 0; i <= 6; i++){
            if(week[i].equals(dayOfTheWeek)){
                weekdayNumber = i;
            }
        }
        
        return weekdayNumber;
    }

    public String getDayOfTheWeek(String date){
        int begin = date.indexOf('(') + 1, end = date.indexOf(')');
        return date.substring(begin, end);
    }
    
}
