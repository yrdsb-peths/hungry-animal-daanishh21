import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero.
 * 
 * @author daanish 
 * @version December 2022
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephant4.mp3");
    GreenfootImage idle = new GreenfootImage("images/elephant_idle/tile000.png");
    
    
    /**
     * Constructor - code that gets run one time when object is created
     */
    
    public Elephant()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle(i) = new GreenfootImage("images/elephant_idle/idle" + i + " .png");
        }
        
        setImage(idle[0]);
        
    }
    
    
    // Animate the elephant
    public void animateElephant()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageindex + 1) % idle.length;
    }
    
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        
        // remove apple if the elephant touches it 
        eat();
        
        // animate the elephant
        animateElephant();
        
    }
    
    
    // eat the apple and spawns a  new apple 
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
        
    }
}
