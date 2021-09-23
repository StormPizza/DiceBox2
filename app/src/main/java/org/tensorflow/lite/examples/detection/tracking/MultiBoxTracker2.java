package org.tensorflow.lite.examples.detection.tracking;

import android.content.Context;
import android.graphics.Canvas;

public class MultiBoxTracker2 extends MultiBoxTracker{

    private Canvas canvasSave;

    public MultiBoxTracker2(Context context) {
        super(context);
    }

    @Override
    public synchronized void draw(final Canvas canvas) {
        if(canvasSave != canvas) canvasSave = canvas;
        super.draw(canvas);
    }

    public Canvas getCanvas(){
        return canvasSave;
    }

}
