// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

public final class VertexAttributeType
{
    public static final int Empty = 0;
    public static final int Scalar1f = 1;
    public static final int Vec2f = 2;
    public static final int Vec3f = 3;
    public static final int Vec4f = 4;
    public static final int Vec2us = 5;
    public static final int Vec4us = 6;
    public static final int Vec4ub = 7;
    public static final String[] names;
    
    private VertexAttributeType() {
    }
    
    public static String name(final int e) {
        return VertexAttributeType.names[e];
    }
    
    static {
        names = new String[] { "Empty", "Scalar1f", "Vec2f", "Vec3f", "Vec4f", "Vec2us", "Vec4us", "Vec4ub" };
    }
}
