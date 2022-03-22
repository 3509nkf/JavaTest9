package edu.rpg.animal;
public class Cat extends Animal{
	
        public Cat(String size, String color) {
            super.setSize(size);
            super.setColor(color);
        }

        public void eat(String food) {
           System.out.println(food + "ウマウマ");
        }

        public String vomitFluffBall(){
           String fluffBall = "毛玉";
           return fluffBall;
        }

       @Override
       public void sleep() {
          System.out.println("ゴロニャー");
       }
}