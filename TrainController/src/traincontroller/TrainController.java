/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traincontroller;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author ecelabs
 */
public class TrainController {

    Object user_interface;
    Train trains[];
    Object train;
    String train_names [] = new String[1];
    int currentTrain = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void user_interface(){
        
        JFrame frame = new JFrame("Train Controller");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        JComboBox<String> train_options = new JComboBox<String>(train_names);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy = 0;
        frame.add(train_options, c);
        
        JPanel blank = new JPanel();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=1;
        c.gridy = 0;
        frame.add(blank, c);
        
        Border border = LineBorder.createBlackLineBorder();
        JLabel train_label = new JLabel(train_names[currentTrain]);
        train_label.setBorder(border);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=2;
        c.gridy = 0;
        frame.add(train_label,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=4;
        c.gridy = 0;
        frame.add(blank, c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=5;
        c.gridy = 0;
        frame.add(blank, c);
        
        
         
        
    }
    
    
    
}
