package org.badmotivator.model.entity;

/**
 * class GameObject - the superclass many entities (items, doors, locations, etc.) will use
 * author - jdoderer
 */


public class GameObject {

    protected String id;
    protected String shortDescription; // name
    protected String longDescription;  // in depth description


    // Constructeur
    public GameObject (String id, String shortDescription, String longDescription) {

        this.id = id;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public String getId() {
        return id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }
}
