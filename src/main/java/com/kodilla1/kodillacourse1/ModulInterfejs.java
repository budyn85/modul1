/*Stwórz interfejs obsługujący bankomat (eng. ATM) zawierający:

Dwie metody wymagające implementacji - wpłata i wypłata
Metodę domyślną - informacja o połączeniu z bankiem
Metodę statyczną - informacja o zakończeniu działania bankomatu
Następnie zaimplementuj taki interface do klasy o nazwie
ATMImpl (ATM Implementation) i stwórz ciała dla metod,
 które tego wymagają. W klasie Application w metodzie main wywołaj każdą metodę */


package com.kodilla1.kodillacourse1;

interface ATM{
    void payment();
    void payout();
    default void atmConnect(){
        System.out.println("ATM is connecting");
    }
}
class ATMImplementer implements ATM  {

    @Override
    public void payment(){
        System.out.println("Payment...");
    }
    @Override
    public void payout(){
        System.out.println("Payout");
    }
}
class Application{
    public static void main(String[]args){
        ATMImplementer implementer = new ATMImplementer();
        implementer.payment();
    }
}
