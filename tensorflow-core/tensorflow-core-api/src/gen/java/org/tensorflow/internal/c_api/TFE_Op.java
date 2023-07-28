// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.tensorflow.internal.c_api;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.tensorflow.internal.c_api.global.tensorflow.*;


// Description of the TensorFlow op to execute.
//
// Assumes that the provided 'ctx' outlives the returned TFE_Op, i.e.,
// TFE_DeleteOp() is called before TFE_DeleteContext().
//
// Very similar to TF_OperationDescription with some differences:
// (1) TF_Output or TFE_TensorHandle* as arguments to TF_AddInput,
//     TF_AddInputList
// (2) TF_ColocateWith, TF_AddControlInput etc. do not make sense.
// (3) Implementation detail: Avoid use of NodeBuilder/NodeDefBuilder since
//     the additional sanity checks there seem unnecessary;
@Opaque @Properties(inherit = org.tensorflow.internal.c_api.presets.tensorflow.class)
public class TFE_Op extends org.tensorflow.internal.c_api.AbstractTFE_Op {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TFE_Op() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TFE_Op(Pointer p) { super(p); }
}
