package edu.rpg.game;
import java.util.Random;
public class CardController {
	/**
        	*ハート・ダイヤ・スペード・クラブの4種類×13枚のカードを生成する
                *
                *@return 4種類×13枚 計52枚のカードが入った配列
                */
        public Card[] createCard() {
        	Card[] cards = new Card[52];
                //ハートの生成
                addCard(cards,CardType.HART,0);
                //ダイヤの生成
                addCard(cards,CardType.DIA,13);
                //スペードを生成
                addCard(cards,CardType.SPADE,26);
                //クラブを生成
                addCard(cards,CardType.CLUB,39);
                return cards;
        }
       /**
           *指定された種類のカードを13枚追加する
           *
           *@param cards
           *   追加する先のカードの一覧
           *@param cardType
           *カードの種類
           *@param startIndex
           *  追加先のカード開始番号
          */
        private void addCard(Card[] cards, CardType cardType, int startIndex) {
        	int cardsCount = startIndex;
                for(int i =1;i<=13;i++) {
                	Card card = new Card(i, cardType);
                        cards[cardsCount] = card;
                        cardsCount++;
                }
        }
      
        public Card[] shuffle(Card[] cards) {
        	Card[] results = new Card[52];
                Random random = new Random();
                int index = 0;
                while(index < 52) {
                	int rand = random.nextInt(52);
                        Card card = cards[rand];
                        boolean stillAdd = false;
                        for(Card result : results) {
                        	if(result == null) {
                                	break;
                                }
                                if(result.getCardType().equals(card.getCardType()) && result.getNumber() == card.getNumber()) {
                                	stillAdd = true;
                                        break;
                                }
                        }
                        if(!stillAdd) {
                        	results[index] = card;
                                index++;
                        }
                 }
                 return results;
        }
}