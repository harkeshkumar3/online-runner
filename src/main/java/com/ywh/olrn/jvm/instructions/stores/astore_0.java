package com.ywh.olrn.jvm.instructions.stores;

import com.ywh.olrn.jvm.instructions.base.NoOperandsInstruction;
import com.ywh.olrn.jvm.rtda.Frame;

import java.lang.ref.Reference;

public class astore_0 extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x4b;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        Reference val = frame.getOperandStack().popRef();
        frame.getLocalVars().setRef(0, val);
    }
}
