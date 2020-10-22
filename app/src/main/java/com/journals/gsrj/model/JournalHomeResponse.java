package com.journals.gsrj.model;

public class JournalHomeResponse {


    /**
     * status : true
     * abt_journal : 1
     * abt_journal_details : <p style="text-align: justify;">NLM ID: <strong>101609801</strong><br />
     <br />
     Advanced Techniques in Biology &amp; Medicine is an official peer-reviewed journal for the rapid publication of innovative research covering all aspects of scientific work on Techniques in Biology, Decongestant Medicine, Drosophila Melanogaster and Medicine. Biology and Medicine with highest impact factor offers Open Access option to meet the needs of authors and maximize article visibility.<br />
     <br />
     Advanced Techniques in Biology &amp; Medicine details the complex issues of biology at an evolutionary level. Methods or procedures that are used to study living things are covered in Biological techniques (Experimental methods, Computational methods, Approaches, Protocols and Tools for biological research) Analytical biochemistry, Behavioural methods, Computational Biology, Biological models Techniques in Medicine considers, Methods or procedures that are used in science or practice of the Diagnosis of disease or disorder, Treatment of disease or disorder, Prevention of disease or disorder.<br />
     <br />
     The journal includes a wide range of fields in its discipline to create a platform for the authors to make their contribution (original articles, review articles, case reports, short communications, letter to editors, conference proceedings etc.) towards the journal and the editorial office promises a peer review process for the submitted manuscripts for the quality of publishing and making them freely available through online without any restrictions to Scientific community worldwide.</p>

     <p style="text-align: justify;">Submit manuscript online at&nbsp;<a href="https://www.longdom.org/submissions/advanced-techniques-biology-medicine.html">https://www.longdom.org/submissions/advanced-techniques-biology-medicine.html</a>&nbsp;(or) directly send as an e-mail attachment to the Editorial Office at&nbsp;<a href="mailto:editorialoffice@longdom.org">editorialoffice@longdom.org</a></p>

     */

    private boolean status;
    private int abt_journal;
    private String abt_journal_details;

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

    public String getAbt_journal_details() {
        return abt_journal_details;
    }

    public void setAbt_journal_details(String abt_journal_details) {
        this.abt_journal_details = abt_journal_details;
    }
}
