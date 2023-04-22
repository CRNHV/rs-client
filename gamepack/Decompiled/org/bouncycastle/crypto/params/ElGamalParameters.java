package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

public class ElGamalParameters implements CipherParameters {
   BigInteger g;
   BigInteger p;
   int l;

   public ElGamalParameters(BigInteger var1, BigInteger var2) {
      this(var1, var2, 0);
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ElGamalParameters)) {
         return false;
      } else {
         ElGamalParameters var2 = (ElGamalParameters)var1;
         return var2.getP().equals(this.p) && var2.getG().equals(this.g) && var2.getL() == this.l;
      }
   }

   public BigInteger getP() {
      return this.p;
   }

   public BigInteger getG() {
      return this.g;
   }

   public int getL() {
      return this.l;
   }

   public boolean gk(Object var1) {
      if (!(var1 instanceof ElGamalParameters)) {
         return false;
      } else {
         ElGamalParameters var2 = (ElGamalParameters)var1;
         return var2.getP().equals(this.p) && var2.getG().equals(this.g) && var2.getL() == this.l;
      }
   }

   public int hashCode() {
      return (this.getP().hashCode() ^ this.getG().hashCode()) + this.l;
   }

   public ElGamalParameters(BigInteger var1, BigInteger var2, int var3) {
      this.g = var2;
      this.p = var1;
      this.l = var3;
   }

   public boolean gi(Object var1) {
      if (!(var1 instanceof ElGamalParameters)) {
         return false;
      } else {
         ElGamalParameters var2 = (ElGamalParameters)var1;
         return var2.getP().equals(this.p) && var2.getG().equals(this.g) && var2.getL() == this.l;
      }
   }

   public boolean gq(Object var1) {
      if (!(var1 instanceof ElGamalParameters)) {
         return false;
      } else {
         ElGamalParameters var2 = (ElGamalParameters)var1;
         return var2.getP().equals(this.p) && var2.getG().equals(this.g) && var2.getL() == this.l;
      }
   }

   public boolean gm(Object var1) {
      if (!(var1 instanceof ElGamalParameters)) {
         return false;
      } else {
         ElGamalParameters var2 = (ElGamalParameters)var1;
         return var2.getP().equals(this.p) && var2.getG().equals(this.g) && var2.getL() == this.l;
      }
   }

   public int ahh() {
      return (this.getP().hashCode() ^ this.getG().hashCode()) + this.l;
   }

   public int aht() {
      return (this.getP().hashCode() ^ this.getG().hashCode()) + this.l;
   }

   public int ahv() {
      return (this.getP().hashCode() ^ this.getG().hashCode()) + this.l;
   }
}
