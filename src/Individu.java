import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Individu extends Actor
{

    String[] etat;
    Virus[] maladie;
    Vaccin[] vaccination;
    
    public Individu()
    {
        String[] etat = {};
        Virus[] maladie = {};
        Vaccin[] vaccination = {};
    }
    
    public void act() 
    {
        getWorld().addObject(new Individu(),Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(500));
    }    
}
