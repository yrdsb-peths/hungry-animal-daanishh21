import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant the Hero
 * 
 * @author daanish
 * @version November 2022
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
     
     super(600, 400, 1);
     
     Elephant elephant = new Elephant();
     addObject(elelphant, 300, 200);
     
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
    }
}
