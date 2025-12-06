package org.badmotivator.model.entity;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/**
 * class Location - represents all the locations (rooms) in the game
 * author - jdoderer
 * Dec 5, 2025
 */
public class Location extends GameObject {

    private final String longDescription;

    // Map of Exits - each exit contains a String for direction ("NORTH", "UP", etc) and an Exit object for the
    // destination (if there is one) and a failure message (if there isn't)
    private final Map<String, Exit> exits = new HashMap<>();

    // List of IDs for entities in the room (items, enemies, etc)
    private final List<String> itemIds = new ArrayList<>();


    // Constructor for a Location
    public Location (String id, String shortDescription, String longDescription) {
        super(id, shortDescription, longDescription);
        this.longDescription = longDescription;
    }


    // Getters

    public List<String> getItemIds() {
        return new ArrayList<>(itemIds); // return a copy to avoid anyone changing the list
    }

    @Override
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Retrieves the Exit object for a given direction.
     * @param direction - The direction string ("NORTH", "UP", etc).
     * @return - Exit object, or null if the direction is invalid.
     */
    public Exit getExit(String direction) {
        return exits.get(direction.toUpperCase());
    }

    // Setters

    /**
     * Adds an Exit object, mapping a direction ("NORTH" or "UP", etc) to its data
     */
    public void addExit(String direction, Exit exitData) {
        exits.put(direction.toUpperCase(), exitData);
    }

    /**
     * Adds an item's ID to the location's inventory (i.e., puts something into the room)
     */
    public void addItem(String itemId) {
        itemIds.add(itemId);
    }

    /**
     * Removes an item's ID from the location's inventory (removing it from the room)
     */
    public void removeItem(String itemId) {
        itemIds.remove(itemId);
    }
}
