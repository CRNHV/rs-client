import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ClientPreferences {
   boolean ab = false;
   boolean al = false;
   boolean aq;
   boolean au;
   double aa = 0.8;
   int ah = 1056868117;
   int ai = 1923156277;
   int ao = 590995555;
   int at;
   int ax = -1313786027;
   int ay = 1301921773;
   String rememberedUsername = null;
   final Map av = new LinkedHashMap();

   ClientPreferences() {
      this.af(true);
   }

   ClientPreferences(Packet var1) {
      if (var1 != null && var1.array != null) {
         int var2 = var1.g1();
         if (var2 >= 0 && var2 <= 10) {
            if (var1.g1() == 1) {
               this.au = true;
            }

            if (var2 > 1) {
               this.aq = var1.g1() == 1;
            }

            if (var2 > 3) {
               this.ah = var1.g1() * 1056868117;
            }

            if (var2 > 2) {
               int var3 = var1.g1();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.g4s();
                  int var6 = var1.g4s();
                  this.av.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.rememberedUsername = var1.cz();
            }

            if (var2 > 5) {
               this.ab = var1.gbool();
            }

            if (var2 > 6) {
               this.aa = (double)var1.g1() / 100.0;
               this.ay = var1.g1() * -1477768813;
               this.ao = var1.g1() * -1956827619;
               this.ax = var1.g1() * -314712533;
            }

            if (var2 > 7) {
               this.ai = var1.g1() * -1923156277;
            }

            if (var2 > 8) {
               this.al = var1.g1() == 1;
            }

            if (var2 > 9) {
               this.at = var1.g4s() * -1873612629;
            }
         } else {
            this.af(true);
         }
      } else {
         this.af(true);
      }

   }

   void af(boolean var1) {
   }

   Packet toBuffer() {
      Packet var2 = new Packet(417, true);
      var2.bu(10);
      var2.bu(this.au ? 1 : 0);
      var2.bu(this.aq ? 1 : 0);
      var2.bu(this.ah * -1016688579);
      var2.bu(this.av.size());
      Iterator var3 = this.av.entrySet().iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         var2.ba((Integer)var4.getKey());
         var2.ba((Integer)var4.getValue());
      }

      var2.bh(null != this.rememberedUsername ? this.rememberedUsername : "");
      var2.pbool(this.ab);
      var2.bu((int)(this.aa * 100.0));
      var2.bu(-461734757 * this.ay);
      var2.bu(-1738472395 * this.ao);
      var2.bu(this.ax * 1655566467);
      var2.bu(this.ai * -934134045);
      var2.bu(this.al ? 1 : 0);
      var2.ba(971082243 * this.at);
      return var2;
   }

   void au(boolean var1) {
      this.au = var1;
      dn.ac_renamed();
   }

   boolean ab() {
      return this.au;
   }

   void aq(boolean var1) {
      this.ab = var1;
      dn.ac_renamed();
   }

   boolean al() {
      return this.ab;
   }

   void at(boolean var1) {
      this.aq = var1;
      dn.ac_renamed();
   }

   boolean aa() {
      return this.aq;
   }

   void ay(boolean var1) {
      this.al = var1;
      dn.ac_renamed();
   }

   void ao() {
      this.ay(!this.al);
   }

   boolean ax() {
      return this.al;
   }

   void ai(int var1) {
      this.at = -1873612629 * var1;
      dn.ac_renamed();
   }

   int ag() {
      return this.at * 971082243;
   }

   void ah(double var1) {
      this.aa = var1;
      dn.ac_renamed();
   }

   double av() {
      return this.aa;
   }

   void ar(int var1) {
      this.ay = var1 * -1477768813;
      dn.ac_renamed();
   }

   int am() {
      return this.ay * -461734757;
   }

   void as(int var1) {
      this.ao = var1 * -1956827619;
      dn.ac_renamed();
   }

   int aj() {
      return -1738472395 * this.ao;
   }

   void ak(int var1) {
      this.ax = var1 * -314712533;
      dn.ac_renamed();
   }

   int az() {
      return this.ax * 1655566467;
   }

   void ad(String var1) {
      this.rememberedUsername = var1;
      dn.ac_renamed();
   }

   String ae() {
      return this.rememberedUsername;
   }

   void ap(int var1) {
      this.ai = -1923156277 * var1;
      dn.ac_renamed();
   }

   int by() {
      return this.ai * -934134045;
   }

   void bb(int var1) {
      this.ah = var1 * 1056868117;
      dn.ac_renamed();
   }

   int bi() {
      return -1016688579 * this.ah;
   }

   void be(String var1, int var2) {
      int var4 = this.bo(var1);
      if (this.av.size() >= 10 && !this.av.containsKey(var4)) {
         Iterator var5 = this.av.entrySet().iterator();
         var5.next();
         var5.remove();
      }

      this.av.put(var4, var2);
      dn.ac_renamed();
   }

   boolean bk(String var1) {
      int var3 = this.bo(var1);
      return this.av.containsKey(var3);
   }

   int bx(String var1) {
      int var3 = this.bo(var1);
      return !this.av.containsKey(var3) ? 0 : (Integer)this.av.get(var3);
   }

   int bo(String var1) {
      return Actor.al_renamed(var1.toLowerCase());
   }

   static final void aq_renamed(PacketBit var0, int var1, Player var2, int var3) {
      byte var5 = iu.af.au;
      int var6;
      if (0 != (var3 & 2)) {
         var6 = var0.db();
         byte[] var7 = new byte[var6];
         Packet var8 = new Packet(var7);
         var0.ct(var7, 0, var6);
         ds.au[var1] = var8;
         var2.read(var8);
      }

      int var14;
      if (0 != (var3 & 16)) {
         var6 = var0.ep();
         if (65535 == var6) {
            var6 = -1;
         }

         var14 = var0.g1n();
         FloorDecoration.iq_renamed(var2, var6, var14);
      }

      if (0 != (var3 & 4)) {
         var2.sequenceFrameCycle = var0.eo() * 1052277865;
         var2.sequenceFrameCycle += (var0.db() << 16) * 1052277865;
         var6 = 16777215;
         if (var2.sequenceFrameCycle * 1005900761 == var6) {
            var2.sequenceFrameCycle = -1052277865;
         }
      }

      if ((var3 & 128) != 0) {
         var2.overheadText = var0.cw();
         if (var2.overheadText.charAt(0) == '~') {
            var2.overheadText = var2.overheadText.substring(1);
            es.an_renamed(2, var2.username.af(), var2.overheadText);
         } else if (var2 == MusicPatchNode.localPlayer) {
            es.an_renamed(2, var2.username.af(), var2.overheadText);
         }

         var2.ce = false;
         var2.movementFrame = 0;
         var2.walkBackSequence = 0;
         var2.movementSequence = -739348018;
      }

      int var9;
      int var10;
      int var13;
      int var15;
      if ((var3 & 64) != 0) {
         var6 = var0.g1();
         int var11;
         int var12;
         if (var6 > 0) {
            for(var14 = 0; var14 < var6; ++var14) {
               var9 = -1;
               var10 = -1;
               var11 = -1;
               var15 = var0.cd();
               if (var15 == 32767) {
                  var15 = var0.cd();
                  var10 = var0.cd();
                  var9 = var0.cd();
                  var11 = var0.cd();
               } else if (var15 != 32766) {
                  var10 = var0.cd();
               } else {
                  var15 = -1;
               }

               var12 = var0.cd();
               var2.addHitmark(var15, var10, var9, var11, Client.ep * -1886224337, var12);
            }
         }

         var14 = var0.db();
         if (var14 > 0) {
            for(var15 = 0; var15 < var14; ++var15) {
               var9 = var0.cd();
               var10 = var0.cd();
               if (32767 != var10) {
                  var11 = var0.cd();
                  var12 = var0.dq();
                  var13 = var10 > 0 ? var0.g1n() : var12;
                  var2.addHeadbar(var9, Client.ep * -1886224337, var10, var11, var12, var13);
               } else {
                  var2.removeHeadbar(var9);
               }
            }
         }
      }

      if ((var3 & 1) != 0) {
         var2.size = var0.cl() * -1409690365;
         if (0 == var2.dn * 1134756167) {
            var2.dd = var2.size * 948720829;
            var2.cd();
         }
      }

      if (0 != (var3 & 32)) {
         var6 = var0.ep();
         PlayerType var16 = (PlayerType)StructType.findEnumerated(StudioGame.au_renamed(), var0.g1());
         boolean var20 = var0.g1n() == 1;
         var9 = var0.db();
         var10 = -1633313603 * var0.index;
         if (var2.username != null && null != var2.appearance) {
            boolean var22 = false;
            if (var16.isUser && World.friendSystem.aq(var2.username)) {
               var22 = true;
            }

            if (!var22 && Client.ma * 43311027 == 0 && !var2.az) {
               ds.ag.index = 0;
               var0.ct(ds.ag.array, 0, var9);
               ds.ag.index = 0;
               String var23 = AbstractFont.escapeBrackets(er.ao_renamed(TilePaint.aw_renamed(ds.ag)));
               var2.overheadText = var23.trim();
               var2.movementFrame = 1732198649 * (var6 >> 8);
               var2.walkBackSequence = 1666666057 * (var6 & 255);
               var2.movementSequence = -739348018;
               var2.ce = var20;
               var2.ci = MusicPatchNode.localPlayer != var2 && var16.isUser && "" != Client.ss && var23.toLowerCase().indexOf(Client.ss) == -1;
               if (var16.isPrivileged) {
                  var13 = var20 ? 91 : 1;
               } else {
                  var13 = var20 ? 90 : 2;
               }

               if (-1 != var16.id * 2138745227) {
                  es.an_renamed(var13, ArchiveDiskActionHandler.af_renamed(2138745227 * var16.id) + var2.username.af(), var23);
               } else {
                  es.an_renamed(var13, var2.username.af(), var23);
               }
            }
         }

         var0.index = -1516355947 * (var10 + var9);
      }

      if ((var3 & 4096) != 0) {
         var6 = var0.cl();
         var14 = var0.er();
         var2.cj(0, var6, var14 >> 16, var14 & '\uffff');
      }

      if ((var3 & 1024) != 0) {
         var2.di = var0.g1s() * -278393391;
         var2.dl = var0.dx() * -1448856093;
         var2.dr = var0.dj() * 242410523;
         var2.dk = var0.dj() * 2106434927;
         var2.dt = (var0.eo() + Client.ep * -1886224337) * -608537751;
         var2.dv = (var0.cl() + -1886224337 * Client.ep) * -2100738849;
         var2.dz = var0.eo() * -698990457;
         if (var2.isUnanimated) {
            var2.di += -1987308883 * var2.tileX;
            var2.dl += 198846147 * var2.tileY;
            var2.dr += 580103439 * var2.tileX;
            var2.dk += var2.tileY * 999446991;
            var2.dn = 0;
         } else {
            var2.di += var2.pathX[0] * -278393391;
            var2.dl += -1448856093 * var2.pathY[0];
            var2.dr += var2.pathX[0] * 242410523;
            var2.dk += var2.pathY[0] * 2106434927;
            var2.dn = 400971895;
         }

         var2.eo = 0;
      }

      if (0 != (var3 & 512)) {
         iu[] var17 = ds.ac;
         iu[] var21 = new iu[]{iu.aw, iu.af, iu.an, iu.ac};
         var17[var1] = (iu)StructType.findEnumerated(var21, var0.dd());
      }

      if (0 != (var3 & 2048)) {
         var5 = var0.g1s();
      }

      if ((var3 & 8192) != 0) {
         for(var6 = 0; var6 < 3; ++var6) {
            var2.actions[var6] = var0.cw();
         }
      }

      if ((var3 & '耀') != 0) {
         var2.dh = (-1886224337 * Client.ep + var0.eo()) * -887211183;
         var2.sequenceDelay = (-1886224337 * Client.ep + var0.cl()) * -368061749;
         var2.du = var0.g1s();
         var2.db = var0.g1s();
         var2.df = var0.dd();
         var2.dq = (byte)var0.g1n();
      }

      if ((var3 & 65536) != 0) {
         var6 = var0.dq();

         for(var14 = 0; var14 < var6; ++var14) {
            var15 = var0.g1n();
            var9 = var0.eo();
            var10 = var0.g4s();
            var2.cj(var15, var9, var10 >> 16, var10 & '\uffff');
         }
      }

      if (var2.isUnanimated) {
         if (127 == var5) {
            var2.resetPath(2039538205 * var2.tileX, var2.tileY * 1584800161);
         } else {
            iu var18;
            if (var5 != iu.af.au) {
               iu[] var19 = new iu[]{iu.aw, iu.af, iu.an, iu.ac};
               var18 = (iu)StructType.findEnumerated(var19, var5);
            } else {
               var18 = ds.ac[var1];
            }

            var2.av(2039538205 * var2.tileX, var2.tileY * 1584800161, var18);
         }
      }

   }
}
