package edu.rpg.animal;
public abstract class Animal {
	public String color;
        public String size;
        private String howlVoice;


        public void howl() {
           //鳴く
           System.out.println(howlVoice);
        }
  
        public String getColor() {
           return color;
        }

        public void setColor(String color) {
           this.color = color;
        }

        public String getSize() {
           return size;
        }

        public void setSize(String size) {
            this.size = size;
        }
        public abstract void sleep();//動物には必ずsleepしなければならない
}

        
	