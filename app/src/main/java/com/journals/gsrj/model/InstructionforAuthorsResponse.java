package com.journals.gsrj.model;

public class InstructionforAuthorsResponse {



    private boolean status;
    private int abt_journal;
    private String inst_author_details;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAbt_journal() {
        return abt_journal;
    }

    public void setAbt_journal(int abt_journal) {
        this.abt_journal = abt_journal;
    }

    public String getInst_author_details() {
        return inst_author_details;
    }

    public void setInst_author_details(String inst_author_details) {
        this.inst_author_details = inst_author_details;
    }
}
