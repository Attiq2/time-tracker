package training.Taylor.time-tracker.core;

import static org. junit.Assert.*;

import org. junit.Test;
import org.junit.runner.RunWith;
import org. spring framework.beans.factory.annotation.Autowired;
import org. spring framework.test.context.ContextConfiguration;
import org. spring framework.test.context.junit4.SpringJUnit4ClassRunner;
import training. Taylor. time-tracker.core.dao.TimeEntry;

import java.math.BigDecimal;

/**
 * Created by Jason on 6/19/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackerCoreConfig.class) // Ensure this config exists
public class TrackerTest {

    @Autowired
    private Tracker tracker; // Ensure Tracker is a valid Spring bean

    @Test
    public void testMe() {
        assertNotNull("Tracker bean should not be null", tracker);
    }

    @Test
    public void testAdd() {
        TimeEntry entry = new TimeEntry();
        entry.setDescription("Entry Test");
        entry.setRate(new BigDecimal("80.0")); // Use BigDecimal instead of float
        entry.setTime(3);

        tracker.add(entry); // Ensure `Tracker` has an `add(TimeEntry entry)` method
        assertTrue("Tracker should contain at least one entry", tracker.size() > 0);
    }
}
