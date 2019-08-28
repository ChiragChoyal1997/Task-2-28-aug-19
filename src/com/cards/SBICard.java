package com.cards;
import com.specification.ATMCard;
/*
 *
 * @author Chirag
 */
public class SBICard implements ATMCard{
   
    @Override
    public void balanceEnquiry(){
        System.out.println("SBI Card balance is : 20000");
    }
    @Override
    public void withdraw(){
        System.out.println("Withdrawl successfull from SBICard");
    }
    @Override
    public void deposit(){
        System.out.println("Deposit successfull from SBICard");
    }
    @Override
    public void changePin(){
        System.out.println("SBI Card pin changed");
    }
}
