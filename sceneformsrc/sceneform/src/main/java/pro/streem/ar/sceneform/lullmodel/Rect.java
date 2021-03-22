// automatically generated by the FlatBuffers compiler, do not modify

package pro.streem.ar.sceneform.lullmodel;

import java.nio.*;

import pro.streem.flatbuffers.FlatBufferBuilder;
import pro.streem.flatbuffers.Struct;

@SuppressWarnings("unused")
public final class Rect extends Struct {
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Rect __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float x() { return bb.getFloat(bb_pos + 0); }
  public float y() { return bb.getFloat(bb_pos + 4); }
  public float w() { return bb.getFloat(bb_pos + 8); }
  public float h() { return bb.getFloat(bb_pos + 12); }

  public static int createRect(FlatBufferBuilder builder, float x, float y, float w, float h) {
    builder.prep(4, 16);
    builder.putFloat(h);
    builder.putFloat(w);
    builder.putFloat(y);
    builder.putFloat(x);
    return builder.offset();
  }
}

