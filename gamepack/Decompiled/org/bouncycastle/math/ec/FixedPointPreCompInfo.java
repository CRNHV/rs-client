package org.bouncycastle.math.ec;

public class FixedPointPreCompInfo implements PreCompInfo {
   public ECPoint[] preComp = null;
   public int width = -1;

   public ECPoint[] getPreComp() {
      return this.preComp;
   }

   public void setPreComp(ECPoint[] var1) {
      this.preComp = var1;
   }

   public int getWidth() {
      return this.width;
   }

   public void setWidth(int var1) {
      this.width = var1;
   }
}
