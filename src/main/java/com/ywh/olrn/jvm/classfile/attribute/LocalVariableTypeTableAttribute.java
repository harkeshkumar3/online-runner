package com.ywh.olrn.jvm.classfile.attribute;


import com.ywh.olrn.jvm.classfile.attribute.LocalVariableTypeTable.LocalVariableType;
import com.ywh.olrn.jvm.classfile.basestruct.U2;
import com.ywh.olrn.jvm.classfile.basestruct.U4;

/**
 * @author ywh
 * @since 20/07/2020
 */
public class LocalVariableTypeTableAttribute extends AttributeBase {
    public U2 attributeNameIndex;

    public U4 attributeLength;

    public U2 localVariableTypeTableLength;

    public LocalVariableType[] localVariableTypes;
}