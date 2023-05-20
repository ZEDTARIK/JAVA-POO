package org.learn.model;

public class SavingAccount extends  AccountBank{

    private  double overDraft;

    public SavingAccount(double overDraft) {
        super();
        this.overDraft = overDraft;
    }
    public SavingAccount(double balance, String currency, int i) {
        super(balance, currency);
        this.overDraft = overDraft;
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }



    @Override
    public String getType() {
        return "SAVING_ACCOUNT";
    }
}
