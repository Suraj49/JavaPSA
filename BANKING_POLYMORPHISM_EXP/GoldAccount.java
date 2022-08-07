package BANKING_POLYMORPHISM_EXP;

public class GoldAccount extends SilverAccount{
    @Override
    public void chqBook() {
        System.out.println("unlimited Chq Book");
    }

    @Override
    public void isLoan() {
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        GoldAccount g1=new GoldAccount();
        System.out.println("--- Gold Account ---");
        g1.chqBook();
        g1.phBanking();
        g1.atmCard();
        g1.isLoan();
        System.out.println("___ Silver Account ___");
        SilverAccount s1=new SilverAccount();
        s1.chqBook();
        s1.phBanking();
        s1.atmCard();
        s1.isLoan();
    }
}
