public abstract class Pizza {
   String name;

   Dough dough;
   Sauce sauce;
   Veggies[] veggies;
   Cheese cheese;
   Pepperoni pepperoni;
   Clams clams;

   // Ingredients needed for the pizza will come from the ingredient factory
   abstract void prepare();

   void bake() {
      System.out.println("Baking");
   }

   void cut() {
      System.out.println("Cutting");
   }

   void box() {
      System.out.println("Boxing");
   }

   void setName(String name) {
      this.name = name;
   }

   String getName() {
      return name;
   }
}
