/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS VIVOBOOK
 */
public interface Laptop {
    
    int MAX_VOL = 100;
    int MIN_VOL = 0;
    
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}