package edu.rpg.sample;
import edu.rpg.personal.Gender2;
public class StaticSample {
 	public static void main(String[] args) {
            //この時点で、GenderClassクラスのMALE・FEMALEは生成される
　　　　　　　
　　　　　　//MALE・FEMALEがstaticではない場合
           GenderClass gender = new GenderClass();
           System.out.println(gender.MALE.getName());
           //のように、インスタンス化して使う必要があるが

　　　　　//クラスを呼び出した時点で生成されているため
　　　　　System.out.println(GenderClass.MALE.getName());
         //のように使うことができる
　　　 }
}