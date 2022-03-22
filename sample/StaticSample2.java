package edu.rpg.sample;
import edu.rpg.personal.GenderClass;
public class StaticSample2 {
   public static void main(String[] args) {
      GenderClass kingdom = GenderClass.MALE;
      kingdom.setCount(5000);
      GenderClass village = GenderClass.MALE;
      village.setCount(100);
      System.out.println("王国の人口は" + kingdom.getCount() + "人です");
      System.out.println("村の人口は" + village.getCount() + "人です");
  }
}