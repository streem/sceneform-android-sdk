// automatically generated by the FlatBuffers compiler, do not modify

package pro.streem.ar.sceneform.lullmodel;

import java.nio.*;

import pro.streem.flatbuffers.FlatBufferBuilder;
import pro.streem.flatbuffers.Table;

@SuppressWarnings("unused")
/**
 * Data type for hash values to be stored in a VariantDef.
 */
public final class DataHashValue extends Table {
  public static DataHashValue getRootAsDataHashValue(ByteBuffer _bb) { return getRootAsDataHashValue(_bb, new DataHashValue()); }
  public static DataHashValue getRootAsDataHashValue(ByteBuffer _bb, DataHashValue obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public DataHashValue __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long value() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }

  public static int createDataHashValue(FlatBufferBuilder builder,
                                        long value) {
    builder.startObject(1);
    DataHashValue.addValue(builder, value);
    return DataHashValue.endDataHashValue(builder);
  }

  public static void startDataHashValue(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addValue(FlatBufferBuilder builder, long value) { builder.addInt(0, (int)value, (int)0L); }
  public static int endDataHashValue(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

