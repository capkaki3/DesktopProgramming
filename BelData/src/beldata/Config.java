/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beldata;

import java.awt.Color;
import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author fermat3
 */
public class Config {

        initComponents();
        Properties p = new Properties();
        try{
            p.load(new FileInputStream("conf.ini"));
            lblUser.setText(p.getProperty("user"));
            this.getContentPane().setBackground((Color)Color.class.getField(p.getProperty("bgcolor")).get(null));
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }