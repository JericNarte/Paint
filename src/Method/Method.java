package Method;

import GUI.CanvasPanels.CanvasPanel;

import java.awt.*;

public class Method extends ImageBuffer {

    public Method(CanvasPanel canvasPanel) {
        super(canvasPanel);
    }

    public void setPixel(Point pos) {
        canvasPanel.setCanvasData(pos, color, brushRadius);
    }

    public void removePixel(Point pos) {
        canvasPanel.setCanvasData(pos, Color.WHITE, brushRadius);
    }


}
