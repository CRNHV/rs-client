package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsPeer {
   void notifySecureRenegotiation(boolean var1) throws IOException;

   void notifyAlertRaised(short var1, short var2, String var3, Throwable var4);

   TlsCompression getCompression() throws IOException;

   TlsCipher getCipher() throws IOException;

   boolean shouldUseGMTUnixTime();

   void notifyAlertReceived(short var1, short var2);

   void notifyHandshakeComplete() throws IOException;
}
