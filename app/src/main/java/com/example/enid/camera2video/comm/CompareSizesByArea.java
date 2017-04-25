package com.example.enid.camera2video.comm;

import android.util.Size;

import java.util.Comparator;

/**
 * Created by Enid on 2017/4/21.
 */

public class CompareSizesByArea implements Comparator<Size> {
    @Override
    public int compare(Size lhs, Size rhs) {
        // We cast here to ensure the multiplications won't overflow
        return Long.signum((long) lhs.getWidth() * lhs.getHeight() -
                (long) rhs.getWidth() * rhs.getHeight());
    }
}
