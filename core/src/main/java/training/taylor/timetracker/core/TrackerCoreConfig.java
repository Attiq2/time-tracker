package training.Taylor.time_tracker.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import training.Taylor.time_tracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 6/19/2015.
 */
@Configuration
@ComponentScan("training.Taylor.time_tracker.core")
public class TrackerCoreConfig {

    @Bean(name = "timesheet")
    public List<TimeEntry> timeEntries() {
        return new ArrayList<>();
    }
}
