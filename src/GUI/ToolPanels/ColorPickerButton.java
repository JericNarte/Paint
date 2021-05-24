package GUI.ToolPanels;

import EventListener.ToolSelectEventListener;
import GUI.CanvasPanels.CanvasPanel;
import Method.Method;
import Method.Variables;

import javax.swing.*;
import java.awt.*;

public class ColorPickerButton extends JButton {
    CanvasPanel canvasPanel;
    Method method;

    public ColorPickerButton(CanvasPanel canvasPanel) {
        Variables.addToolButtons(this);
        this.canvasPanel = canvasPanel;
        this.setText("Picker");
        this.setFocusPainted(false);
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(40, 20));
        this.addActionListener(new ToolSelectEventListener(canvasPanel, this));
    }
}
