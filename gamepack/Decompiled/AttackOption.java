public class AttackOption implements Enumerated {
   static final AttackOption AttackOption_leftClickWhereAvailable = new AttackOption(1);
   static final AttackOption AttackOption_dependsOnCombatLevels = new AttackOption(-1);
   static final AttackOption AttackOption_hidden = new AttackOption(2);
   static final AttackOption AttackOption_alwaysRightClick = new AttackOption(0);
   final int id;

   public int ordinal() {
      return this.id * -1923877153;
   }

   AttackOption(int var1) {
      this.id = 521487647 * var1;
   }
}
