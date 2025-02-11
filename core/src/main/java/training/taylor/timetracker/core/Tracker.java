package training.Taylor.time-tracker.core;

import org. spring framework.beans.factory.annotation.Autowired;
import org. spring framework. stereotype.Component;
import training. Taylor. time-tracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    /**
     * Adds a TimeEntry to the list.
     *
     * @param entry The TimeEntry to add.
     */
    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    /**
     * Removes a TimeEntry from the list.
     *
     * @param entry The TimeEntry to remove.
     */
    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    /**
     * Returns the number of TimeEntry objects in the list.
     *
     * @return The size of the list.
     */
    public int size() {
        return entries.size();
    }

    /**
     * Retrieves a TimeEntry from the list by index.
     *
     * @param index The index of the TimeEntry to retrieve.
     * @return The
