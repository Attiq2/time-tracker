import org. spring framework.context.annotation.Bean;
import org. spring framework.context.annotation.Configuration;
import training. Taylor. time-tracker.core.dao.TimeEntry;
import java.util.Arrays;
import java.util.List;

@Configuration
public class TrackerCoreConfig {
    @Bean
    public TimeEntry timeEntry1() {
        return new TimeEntry("Task A", new BigDecimal("50.0"), 5);
    }

    @Bean
    public TimeEntry timeEntry2() {
        return new TimeEntry("Task B", new BigDecimal("75.0"), 3);
    }

    @Bean
    public List<TimeEntry> timeEntries() {
        return Arrays.asList(timeEntry1(), timeEntry2());
    }
}
