/*package com.javier.glassesrecommender;

import android.content.Context;
import android.graphics.Camera;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.hardware.camera2.CameraCaptureSession;

import java.io.IOException;

/**
 * Created by Akstor on 11/11/2016.
 */
/*
public abstract class VistaCamara extends SurfaceView implements SurfaceHolder.Callback {

    private SurfaceHolder mHolder;
    private Camera mCamera;
    public VistaCamara(Context context, Camera camera) {

        super(context);

        mCamera = camera;
        mCamera.setDisplayOrientation(90);
        mHolder = getHolder();
        mHolder.addCallback(this);
        mHolder.setType(SurfaceHolder.SURFACE_TYPE_NORMAL);



    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder){
        try{
            mCamera.setPreviewDisplay(surfaceHolder);
            mCamera.startPreview();
        }
        catch (IOException e){
            Log.d("ERROR", "Error de camara en SurfaceCreated" + e.getMessage());
        }
    }

    @@Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3){
        if(mHolder.getSurface() = null) {
            return;
        }

        try{
            mCamera.stopPreview();
            mCamera.starPreview();
        }
        catch(IOException e){
            Log.d("ERROR", "Error de camara en SurfaceChanged" + e.getMessage());
        }
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder){
        mCamera.stopPreview();
        mCamera.release();
    }
}
*/