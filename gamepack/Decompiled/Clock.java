public abstract class Clock {
   Clock() {
   }

   static final void np_renamed(int var0, int var1, boolean var2) {
      if (Client.so[var0] != null) {
         if (var1 >= 0 && var1 < Client.so[var0].gIsaac1()) {
            fz var4 = (fz)Client.so[var0].aw.get(var1);
            PacketBitNode var5 = mi.an_renamed(ClientProt.dg, Client.packetWriter.au);
            var5.bit.bu(4 + DynamicObject.bc_renamed(var4.aw.af()));
            var5.bit.bu(var0);
            var5.bit.p2(var1);
            var5.bit.pbool(var2);
            var5.bit.bh(var4.aw.af());
            Client.packetWriter.aw(var5);
         }
      }
   }

   public abstract int wait(int var1, int var2);

   public abstract void mark();
}
