package org.badmotivator.model.entity;

/**
 * Exit class - represents the details of a single exit from a location.
 * Used to define destinations, or why you cannot reach them.
 */
public class Exit {

    private final String destinationId;
    private final String failureMessage;

    /**
     * @param destinationId - the ID of the next location (or null if impassable, for a generic response).
     * @param failureMessage - the specific message to give when movement fails (for specific, non-generic reasons)
     */
    public Exit (String destinationId, String failureMessage) {
        this.destinationId = destinationId;
        this.failureMessage = failureMessage;
    }
}
