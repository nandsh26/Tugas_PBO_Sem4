/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS VIVOBOOK
 */
public class MacBook implements Laptop{

    private int volume;
    boolean is_power_on;

    public MacBook() {
        this.volume = 30;
    }

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("Laptop is On");
        System.out.println("MacBook Pro");
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("Shutdown is process ....");
    }

    @Override
    public void volumeUp() {
        if (is_power_on) {
            if (this.volume == MAX_VOL) {
                System.out.println("Volume maksimal");
            }
            else {
                this.volume += 15;
                System.out.println("Volume: " + this.volume);
            }
        }
        else {
            System.out.println("Laptop is Off. Turn it on first");
        }
    }
    
    @Override
    public void volumeDown() {
        if (is_power_on) {
            if (this.volume == MIN_VOL) {
                System.out.println("Volume minimum");
            }
            else {
                this.volume -= 15;
                System.out.println("Volume: " + this.volume);
            }
        }
        else {
            System.out.println("Laptop is Off. Turn it on first");
        }
    }
}