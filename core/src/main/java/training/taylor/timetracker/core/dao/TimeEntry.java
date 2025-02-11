package training.taylor.timetracker.core.dao;

import org. spring framework.context.annotation.Scope;
import org. spring framework. stereotype.Component;
import java.math.BigDecimal;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
@Scope("prototype") // Remove if singleton behavior is preferred
public class TimeEntry {
    private String description;
    private BigDecimal rate; // Use BigDecimal for monetary values
    private int time;

    // Default constructor
    public TimeEntry() {
    }

    // Parameterized constructor
    public TimeEntry(String description, BigDecimal rate, int time) {
        this.description = description;
        this.rate = rate;
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "TimeEntry{" +
                "description='" + description + '\'' +
                ", rate=" + rate +
                ", time=" + time +
                '}';
    }
}
