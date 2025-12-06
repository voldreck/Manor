package org.badmotivator.controller;

/**
 * class Manor - this is the entry point of the program
 * author - jdoderer
 * date - Dec 5, 2025
 */
public class Manor {

    public static void main (String[] args) {

        // Create GameInitializer instance
        GameInitializer gameInitializer = new GameInitializer();
        // Run the init() method on GameInitializer to build all the classes
        GameEngine gameEngine = gameInitializer.init();
        // Run the run() method (main game loop) on the GameEngine that it received from the GameInitializer
        gameEngine.run();
        // End game
        System.out.println("--- Game Over ---");
    }
}
