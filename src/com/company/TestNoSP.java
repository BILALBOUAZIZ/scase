package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

public class TestNoSP extends Frame implements ActionListener {
    // GUI attributes.
    private Button pushButton = new Button("Push Operation");
    private Button pullButton = new Button("Pull Operation");
    private Button exitButton = new Button("Exit");
    private Canvas canvas = new Canvas();
    private ContextNoSP context = null;

    public TestNoSP() {
        super("No State Pattern");
        context = new ContextNoSP();
        setupWindow();
    }

    private void setupWindow() { // Setup GUI
    }
    // Handle GUI actions.
    public void actionPerformed(ActionEvent event){
        Object src = event.getSource();
        if (src == pushButton) {
            context.push();
            canvas.setBackground(context.getState());
        } else if (src == pullButton) {
            context.pull();
            canvas.setBackground(context.getState());
        } else if (src == exitButton) {
            System.exit(0);
        }
    }
    // Main method.
    public static void main (String[]arg){
        TestNoSP gui = new TestNoSP();
        gui.setVisible(true);
    }
}



