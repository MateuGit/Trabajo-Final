/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import AppPackage.AnimationClass;
import javax.swing.JTextField;

/**
 *
 * @author natal
 */
public class GraphicControl {
    
    private static AnimationClass animation = new AnimationClass();
    
    public static void animationJTextField(int start, int stop, int delay, int increment, JTextField j, int type){
        switch(type){
            case 1:
                animation.jTextFieldYUp(start, stop, delay, increment, j);
                break;
            case 2:
                 animation.jTextFieldYDown(start, stop, delay, increment, j);
                break;
        }
        
    }
    
    public static void changeJTextField(JTextField j, String compare, String set){
        if(j.getText().equals(compare)){
            j.setText(set);
        }
    }
            
}
