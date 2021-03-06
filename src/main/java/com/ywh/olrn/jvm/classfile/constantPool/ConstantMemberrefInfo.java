package com.ywh.olrn.jvm.classfile.constantPool;

import com.ywh.olrn.jvm.classfile.ClassReader;

/**
 * 字段普通方法、接口方法符号引用
 * <p>
 * CONSTANT_XXXXref_info {
 * u1 tag;
 * u2 class_index;//指向CONSTANT_Class_info
 * u2 name_and_type_index;//指向CONSTANT_NameAndType_info
 * }
 *
 * @author ywh
 * @since 21/07/2020
 */
public class ConstantMemberrefInfo implements ConstantInfo {

    private ConstantPool constPool;

    private int classIndex;

    private int nameAndTypeIndex;

    public ConstantMemberrefInfo(ConstantPool aConstPool, ClassReader reader) {
        this.classIndex = reader.nextU2ToInt();
        this.nameAndTypeIndex = reader.nextU2ToInt();
        this.constPool = aConstPool;
    }

    @Override
    public String getValue() {
        return constPool.getUTF8(classIndex) + " " + constPool.getUTF8(nameAndTypeIndex);
    }

    @Override
    public String toString() {
        ConstantInfo[] constantInfos = constPool.getConstantInfos();
        ConstantClassInfo constClassInfo = (ConstantClassInfo) constantInfos[classIndex];
        ConstantNameAndTypeInfo nameAndTypeInfo = (ConstantNameAndTypeInfo) constantInfos[nameAndTypeIndex];
        return "ConstantMemberrefInfo{" +
            constClassInfo + "  " +
            nameAndTypeInfo +
            '}';
    }

}
