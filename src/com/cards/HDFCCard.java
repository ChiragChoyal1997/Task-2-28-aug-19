package com.cards;
import com.specification.ATMCard;
/**
 *
 * @author Chirag
 */
public class HDFCCard implements ATMCard{
    
    @Override
    public void balanceEnquiry(){
        System.out.println("HDFC Card balance is : 25000");
    }
    @Override
    public void withdraw(){
        System.out.println("Withdrawl successfull from HDFCCard");
    }
    @Override
    public void deposit(){
        System.out.println("Deposit successfull from HDFCCard");
    }
    @Override
    public void changePin(){
        System.out.println("HDFC Card pin changed");
    }
    
}
