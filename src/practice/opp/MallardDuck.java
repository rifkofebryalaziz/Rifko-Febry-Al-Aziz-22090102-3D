/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.opp;

/**
 *
 * @author rifko
 */
public class MallardDuck extends Duck {
    
    public MallardDuck(){
        
        quackBehavior = new Quack() ;
            flyBehavior = new FlyWithWings();
            
        }
    @Override
    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
