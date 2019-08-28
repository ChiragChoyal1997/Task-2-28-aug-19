package com.atmmachine;
import com.cards.HDFCCard;
import com.cards.SBICard;
import com.specification.ATMCard;
/**
 *
 * @author Chirag
 */
public class Machine implements ATMCard{
    ATMCard card;
    
    public void insertCard(ATMCard card){
        this.card = card;
        System.out.println("Card Accepted");
    }
    
    @Override
    public void balanceEnquiry(){
       card.balanceEnquiry();
    }
    @Override
    public void withdraw(){
        card.withdraw();
    }
    @Override
    public void deposit(){
        card.deposit();
    }
    @Override
    public void changePin(){
        card.changePin();
    }
    
    public static void main(String args[])
    {
        Machine machine1 = new Machine();
        machine1.insertCard(new SBICard());
        machine1.balanceEnquiry();
        machine1.deposit();
        machine1.withdraw();
        machine1.changePin();
        System.out.println("-----------------------------------------------------------");
        Machine machine2 = new Machine();
        machine2.insertCard(new HDFCCard());
        machine2.balanceEnquiry();
        machine2.deposit();
        machine2.withdraw();
        machine2.changePin();
        
        
    }
}
