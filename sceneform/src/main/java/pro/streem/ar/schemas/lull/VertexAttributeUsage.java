// 
// Decompiled by Procyon v0.5.36
// 

package pro.streem.ar.schemas.lull;

public final class VertexAttributeUsage
{
    public static final int Invalid = 0;
    public static final int Position = 1;
    public static final int Color = 2;
    public static final int TexCoord = 3;
    public static final int Normal = 4;
    public static final int Tangent = 5;
    public static final int Orientation = 6;
    public static final int BoneIndices = 7;
    public static final int BoneWeights = 8;
    public static final String[] names;
    
    private VertexAttributeUsage() {
    }
    
    public static String name(final int e) {
        return VertexAttributeUsage.names[e];
    }
    
    static {
        names = new String[] { "Invalid", "Position", "Color", "TexCoord", "Normal", "Tangent", "Orientation", "BoneIndices", "BoneWeights" };
    }
}
