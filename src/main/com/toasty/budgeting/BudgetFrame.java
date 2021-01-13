package com.toasty.budgeting;

import javax.swing.*;

public class BudgetFrame {
    JFrame frame = new JFrame();

    public static void main(String[] args){
        new BudgetFrame().show();
    }

    void show(){
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    JFrame getFrame(){
        return frame;
    }


}
