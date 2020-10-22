package com.journals.gsrj.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AbstractResponse {

    /**
     * status : true
     * abstract : 1
     * abstract_details : [{"sno":"54585","journal":"atbm","title":"Anti-diabetic and Anti-cholesterolmic effects of bittergourd(<em>mommordica charantia linn<\/em>) fresh fruit juice metabolites to cure Alloxan Monohydrate induced Type-1 diabetes in Albino Rats","author_names":"Kumari Shachi, Sanjeev Kumar*, Nayan Kumar Prasad","keywords":"Diabetes; Momordica Charantia; Insulin; Blood Glucose","abstract":"<p>In the present study an effort has been made to assess the hypoglycemic and anti&ndash;cholesterolmic activity of better gourd juice in alloxan monohydrate induced experimental animal model. Rats were acclimatized for 7 days in lab temperature. All animals were given standard water and pellet diet. Diabetes was induced in rats with the help of alloxan monohydrate (120 mg/kg body weight). After alloxan monohydrate injection rats were separated and treatment started with fresh better gourd juice and insulin. A marked rise in fasting blood glucose as well as serum cholesterol level were observed in diabetic control rats when compared to normal control rats. Antihyperglycemic and anti&ndash;cholesterolmic activity observed in bittergurd juice administered rats on 7th,14th,21th and 28th days post treatment.Anti&ndash;hyperglycemic and anti&ndash;cholesterolmic activity was found more effective than that of insulin treatment group. It is hope that present investigation will be helpful in establishing a scientific basis for anti&ndash;diabetic and Anticholesterolmic effects.<\/p>","doi_num":"10.4172/2379-1764.1000271","abstractlink":"antidiabetic-and-anticholesterolmic-effects-of-bittergourdemmommordica-charantia-linnem-fresh-fruit-juice-metabolites-to-54585.html","pdflink":"antidiabetic-and-anticholesterolmic-effects-of-bittergourd-mommordica-charantia-linn--fresh-fruit-juice-metabolites-to-c.pdf","fulltextlink":"antidiabetic-and-anticholesterolmic-effects-of-bettergourdemmommordica-charantia-linnem-fresh-fruit-juice-metabolites-to-cure-allo-54585.html","year":"2020","spage_num":"1","lpage_num":"3","pub_date":"2020-07-28","rec_date":"2020-06-08","date":"2020-04-23","old_omics_id":"0","domain_name":"https://www.longdom.org/","issue_id":"8329","vol_issue_name":"Volume 8, Issue 2","vol":"8","issue":"2","iss_type":"0","vol_issue_url":null}]
     */

    private boolean status;
    @SerializedName("abstract")
    private int abstractX;
    private List<AbstractDetailsBean> abstract_details;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAbstractX() {
        return abstractX;
    }

    public void setAbstractX(int abstractX) {
        this.abstractX = abstractX;
    }

    public List<AbstractDetailsBean> getAbstract_details() {
        return abstract_details;
    }

    public void setAbstract_details(List<AbstractDetailsBean> abstract_details) {
        this.abstract_details = abstract_details;
    }

    public static class AbstractDetailsBean {
        /**
         * sno : 54585
         * journal : atbm
         * title : Anti-diabetic and Anti-cholesterolmic effects of bittergourd(<em>mommordica charantia linn</em>) fresh fruit juice metabolites to cure Alloxan Monohydrate induced Type-1 diabetes in Albino Rats
         * author_names : Kumari Shachi, Sanjeev Kumar*, Nayan Kumar Prasad
         * keywords : Diabetes; Momordica Charantia; Insulin; Blood Glucose
         * abstract : <p>In the present study an effort has been made to assess the hypoglycemic and anti&ndash;cholesterolmic activity of better gourd juice in alloxan monohydrate induced experimental animal model. Rats were acclimatized for 7 days in lab temperature. All animals were given standard water and pellet diet. Diabetes was induced in rats with the help of alloxan monohydrate (120 mg/kg body weight). After alloxan monohydrate injection rats were separated and treatment started with fresh better gourd juice and insulin. A marked rise in fasting blood glucose as well as serum cholesterol level were observed in diabetic control rats when compared to normal control rats. Antihyperglycemic and anti&ndash;cholesterolmic activity observed in bittergurd juice administered rats on 7th,14th,21th and 28th days post treatment.Anti&ndash;hyperglycemic and anti&ndash;cholesterolmic activity was found more effective than that of insulin treatment group. It is hope that present investigation will be helpful in establishing a scientific basis for anti&ndash;diabetic and Anticholesterolmic effects.</p>
         * doi_num : 10.4172/2379-1764.1000271
         * abstractlink : antidiabetic-and-anticholesterolmic-effects-of-bittergourdemmommordica-charantia-linnem-fresh-fruit-juice-metabolites-to-54585.html
         * pdflink : antidiabetic-and-anticholesterolmic-effects-of-bittergourd-mommordica-charantia-linn--fresh-fruit-juice-metabolites-to-c.pdf
         * fulltextlink : antidiabetic-and-anticholesterolmic-effects-of-bettergourdemmommordica-charantia-linnem-fresh-fruit-juice-metabolites-to-cure-allo-54585.html
         * year : 2020
         * spage_num : 1
         * lpage_num : 3
         * pub_date : 2020-07-28
         * rec_date : 2020-06-08
         * date : 2020-04-23
         * old_omics_id : 0
         * domain_name : https://www.longdom.org/
         * issue_id : 8329
         * vol_issue_name : Volume 8, Issue 2
         * vol : 8
         * issue : 2
         * iss_type : 0
         * vol_issue_url : null
         */

        private String sno;
        private String journal;
        private String title;
        private String author_names;
        private String keywords;
        @SerializedName("abstract")
        private String abstractX;
        private String doi_num;
        private String abstractlink;
        private String pdflink;
        private String fulltextlink;
        private String year;
        private String spage_num;
        private String lpage_num;
        private String pub_date;
        private String rec_date;
        private String date;
        private String old_omics_id;
        private String domain_name;
        private String issue_id;
        private String vol_issue_name;
        private String vol;
        private String issue;
        private String iss_type;
        private String vol_issue_url;

        public String getSno() {
            return sno;
        }

        public void setSno(String sno) {
            this.sno = sno;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor_names() {
            return author_names;
        }

        public void setAuthor_names(String author_names) {
            this.author_names = author_names;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getAbstractX() {
            return abstractX;
        }

        public void setAbstractX(String abstractX) {
            this.abstractX = abstractX;
        }

        public String getDoi_num() {
            return doi_num;
        }

        public void setDoi_num(String doi_num) {
            this.doi_num = doi_num;
        }

        public String getAbstractlink() {
            return abstractlink;
        }

        public void setAbstractlink(String abstractlink) {
            this.abstractlink = abstractlink;
        }

        public String getPdflink() {
            return pdflink;
        }

        public void setPdflink(String pdflink) {
            this.pdflink = pdflink;
        }

        public String getFulltextlink() {
            return fulltextlink;
        }

        public void setFulltextlink(String fulltextlink) {
            this.fulltextlink = fulltextlink;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getSpage_num() {
            return spage_num;
        }

        public void setSpage_num(String spage_num) {
            this.spage_num = spage_num;
        }

        public String getLpage_num() {
            return lpage_num;
        }

        public void setLpage_num(String lpage_num) {
            this.lpage_num = lpage_num;
        }

        public String getPub_date() {
            return pub_date;
        }

        public void setPub_date(String pub_date) {
            this.pub_date = pub_date;
        }

        public String getRec_date() {
            return rec_date;
        }

        public void setRec_date(String rec_date) {
            this.rec_date = rec_date;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getOld_omics_id() {
            return old_omics_id;
        }

        public void setOld_omics_id(String old_omics_id) {
            this.old_omics_id = old_omics_id;
        }

        public String getDomain_name() {
            return domain_name;
        }

        public void setDomain_name(String domain_name) {
            this.domain_name = domain_name;
        }

        public String getIssue_id() {
            return issue_id;
        }

        public void setIssue_id(String issue_id) {
            this.issue_id = issue_id;
        }

        public String getVol_issue_name() {
            return vol_issue_name;
        }

        public void setVol_issue_name(String vol_issue_name) {
            this.vol_issue_name = vol_issue_name;
        }

        public String getVol() {
            return vol;
        }

        public void setVol(String vol) {
            this.vol = vol;
        }

        public String getIssue() {
            return issue;
        }

        public void setIssue(String issue) {
            this.issue = issue;
        }

        public String getIss_type() {
            return iss_type;
        }

        public void setIss_type(String iss_type) {
            this.iss_type = iss_type;
        }

        public String getVol_issue_url() {
            return vol_issue_url;
        }

        public void setVol_issue_url(String vol_issue_url) {
            this.vol_issue_url = vol_issue_url;
        }
    }
}
