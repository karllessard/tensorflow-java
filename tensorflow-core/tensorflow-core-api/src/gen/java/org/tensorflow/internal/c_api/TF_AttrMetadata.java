// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.tensorflow.internal.c_api;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.tensorflow.internal.c_api.global.tensorflow.*;


// TF_AttrMetadata describes the value of an attribute on an operation.
@Properties(inherit = org.tensorflow.internal.c_api.presets.tensorflow.class)
public class TF_AttrMetadata extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TF_AttrMetadata() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TF_AttrMetadata(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_AttrMetadata(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TF_AttrMetadata position(long position) {
        return (TF_AttrMetadata)super.position(position);
    }
    @Override public TF_AttrMetadata getPointer(long i) {
        return new TF_AttrMetadata((Pointer)this).offsetAddress(i);
    }

  // A boolean: 1 if the attribute value is a list, 0 otherwise.
  public native @Cast("unsigned char") byte is_list(); public native TF_AttrMetadata is_list(byte setter);

  // Length of the list if is_list is true. Undefined otherwise.
  public native @Cast("int64_t") long list_size(); public native TF_AttrMetadata list_size(long setter);

  // Type of elements of the list if is_list != 0.
  // Type of the single value stored in the attribute if is_list == 0.
  public native @Cast("TF_AttrType") int type(); public native TF_AttrMetadata type(int setter);

  // Total size the attribute value.
  // The units of total_size depend on is_list and type.
  // (1) If type == TF_ATTR_STRING and is_list == 0
  //     then total_size is the byte size of the string
  //     valued attribute.
  // (2) If type == TF_ATTR_STRING and is_list == 1
  //     then total_size is the cumulative byte size
  //     of all the strings in the list.
  // (3) If type == TF_ATTR_SHAPE and is_list == 0
  //     then total_size is the number of dimensions
  //     of the shape valued attribute, or -1
  //     if its rank is unknown.
  // (4) If type == TF_ATTR_SHAPE and is_list == 1
  //     then total_size is the cumulative number
  //     of dimensions of all shapes in the list.
  // (5) Otherwise, total_size is undefined.
  public native @Cast("int64_t") long total_size(); public native TF_AttrMetadata total_size(long setter);
}
