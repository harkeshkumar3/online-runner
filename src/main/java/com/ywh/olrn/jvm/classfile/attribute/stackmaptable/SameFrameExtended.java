package com.ywh.olrn.jvm.classfile.attribute.stackmaptable;

import com.ywh.olrn.jvm.classfile.basestruct.U1;
import com.ywh.olrn.jvm.classfile.basestruct.U2;

/**
 *
 * @author ywh
 * @since 20/07/2020
 */
public class SameFrameExtended extends StackMapFrame {
    public U1 sameFrameExtended = new U1();

    public U1 frameType = sameFrameExtended;

    public U2 offsetDelta;
}