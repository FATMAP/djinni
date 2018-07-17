// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from enum_flags.djinni

package com.dropbox.djinni.test;

import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

public abstract class FlagRoundtrip {
    @Nonnull
    public static native EnumSet<AccessFlags> roundtripAccess(@Nonnull EnumSet<AccessFlags> flag);

    @Nonnull
    public static native EnumSet<EmptyFlags> roundtripEmpty(@Nonnull EnumSet<EmptyFlags> flag);

    @CheckForNull
    public static native EnumSet<AccessFlags> roundtripAccessBoxed(@CheckForNull EnumSet<AccessFlags> flag);

    @CheckForNull
    public static native EnumSet<EmptyFlags> roundtripEmptyBoxed(@CheckForNull EnumSet<EmptyFlags> flag);

    private static final class CppProxy extends FlagRoundtrip
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void _djinni_private_destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            _djinni_private_destroy();
            super.finalize();
        }
    }
}
