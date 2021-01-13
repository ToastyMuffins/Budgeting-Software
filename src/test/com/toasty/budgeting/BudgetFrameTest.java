package com.toasty.budgeting;

import junit.framework.TestCase;

import javax.swing.*;

public class BudgetFrameTest extends TestCase {
    private BudgetFrame budget;
    private JFrame frame;

    public void setUp(){
        budget = new BudgetFrame();
        frame = budget.getFrame();
    }

    public void testFrameCreation(){
        double tolerance = 0.05f;
        assertEquals(500,frame.getWidth(),tolerance);
        assertEquals(500,frame.getHeight(), tolerance);
    }
}
