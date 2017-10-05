/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traincontroller;

/**
 *
 * @author ecelabs
 */
public class Train {
    String name;
    Double current_velocity;
    Double commanded_velocity;
    Double authority;
    Double acceleration;
    boolean emergency_brake;
    boolean brake;
    int doors; //0 = all closed, 1 = left open, 2 = right open
    boolean lights;
    
    public Train(String name){
        
        doors = 0;
        emergency_brake = false;
        brake = false;
        this.name = name;
        
        
    }
    
    public Train(){
        
        doors = 0;
        emergency_brake = false;
        brake = false;
        this.name = "Ghost Train";
        
        
    }
    
    public void set_authority(Double a){
        this.authority = a;
    }
    
    public void set_cmd_vel(Double v){
        this.commanded_velocity = v;
    }
    
    public void update_velocity(Double v){
        this.current_velocity = v;
    }
    
    public void update_accel(Double a){
        this.acceleration = a;
    }
    
    public void changeLights(){
        if(lights){
            this.lights = false;
            
        }else {
            this.lights = true;
        }
    }
    
    public void open_left_doors(){
        this.doors = 1;
    }
    
    public void open_right_doors(){
        this.doors = 2;
    }
    
    public void close_doors(){
        this.doors = 0;
    }
    
    public void change_brake(){
        if(brake){
            this.brake = false;
        } else {
            this.brake = true;
        }
    }
    
    public void change_e_brake(){
        if (emergency_brake){
            this.emergency_brake = false;
        } else{
            this.emergency_brake = true;
        }
    }
    
}
