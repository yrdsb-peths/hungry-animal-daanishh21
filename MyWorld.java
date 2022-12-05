import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World.
 * 
 * @author daanish
 * @version December 2022
 */
public class MyWorld extends World
{

    public int score = 0;
    Label scoreLabel;


    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        // create the elephant obkect
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);

        // create a labal 
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        createApple();
        prepare();
    }

    // end game and draw the words game over
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }

    // increase the score 

    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }

    // add a apple to random location at the top of the screen
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
