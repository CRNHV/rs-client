import java.util.HashMap;
import java.util.Map;

public class Messages {
   static String cp;
   static final IterableNodeHashTable Messages_hashTable = new IterableNodeHashTable(1024);
   static final Map Messages_channels = new HashMap();
   static int Messages_count = 0;
   static final IterableDualNodeQueue Messages_queue = new IterableDualNodeQueue();

   static ex[] au_renamed() {
      return new ex[]{ex.af, ex.an, ex.aw, ex.ac, ex.au};
   }

   static final void kc_renamed(dg var0) {
      long var2 = 0L;
      int var4 = -1;
      int var5 = 0;
      int var6 = 0;
      if (0 == -1586499579 * var0.an) {
         var2 = bx.scene.by(593068225 * var0.af, var0.aw * 68300005, 800888185 * var0.ac);
      }

      if (1 == var0.an * -1586499579) {
         var2 = bx.scene.bb(593068225 * var0.af, var0.aw * 68300005, 800888185 * var0.ac);
      }

      if (-1586499579 * var0.an == 2) {
         var2 = bx.scene.bi(593068225 * var0.af, var0.aw * 68300005, 800888185 * var0.ac);
      }

      if (3 == var0.an * -1586499579) {
         var2 = bx.scene.be(var0.af * 593068225, 68300005 * var0.aw, var0.ac * 800888185);
      }

      if (var2 != 0L) {
         int var7 = bx.scene.bk(var0.af * 593068225, var0.aw * 68300005, 800888185 * var0.ac, var2);
         var4 = InterfaceParent.at(var2);
         var5 = var7 & 31;
         var6 = var7 >> 6 & 3;
      }

      var0.au = var4 * -309952939;
      var0.aq = var5 * -176021621;
      var0.ab = var6 * -884492625;
   }

   Messages() throws Throwable {
      throw new Error();
   }
}
