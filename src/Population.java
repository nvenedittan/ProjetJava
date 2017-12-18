import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Population extends Actor
{

    Individu[] P;
    
    public Population()
    {
        Individu[] P = {};
    }
    
    public void act() 
    {
        getWorld().addObject(new Population(),Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(500));
    }    
}
