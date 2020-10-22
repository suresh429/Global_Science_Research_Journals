package com.journals.gsrj.model;

import java.util.List;

public class ArchiveResponse {


    /**
     * archive_year_cnt : 8
     * status : true
     * message : Records Found
     * archive_years : [{"year":"2020","archive_details":[{"year":"2020","issue_id":"6861","journal":"atbm","vol_issue_name":"Volume 8, Issue 1","vol":"8","issue":"1","iss_type":"0","vol_issue_url":null,"date":"2020-01-10"},{"year":"2020","issue_id":"8329","journal":"atbm","vol_issue_name":"Volume 8, Issue 2","vol":"8","issue":"2","iss_type":"0","vol_issue_url":null,"date":"2020-04-23"},{"year":"2020","issue_id":"8958","journal":"atbm","vol_issue_name":"12th World Congress on Precision and Personalized Medicine","vol":"0","issue":"0","iss_type":"1","vol_issue_url":null,"date":"2020-08-31"}]},{"year":"2019","archive_details":[{"year":"2019","issue_id":"6279","journal":"atbm","vol_issue_name":"Volume 7, Issue 1","vol":"7","issue":"1","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"},{"year":"2019","issue_id":"6280","journal":"atbm","vol_issue_name":"Volume 7, Issue 2","vol":"7","issue":"2","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"},{"year":"2019","issue_id":"6749","journal":"atbm","vol_issue_name":"Volume 7, Issue 3","vol":"7","issue":"3","iss_type":"0","vol_issue_url":null,"date":"2020-01-07"}]},{"year":"2018","archive_details":[{"year":"2018","issue_id":"6276","journal":"atbm","vol_issue_name":"Volume 6, Issue 1","vol":"6","issue":"1","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"},{"year":"2018","issue_id":"6277","journal":"atbm","vol_issue_name":"Volume 6, Issue 2","vol":"6","issue":"2","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"},{"year":"2018","issue_id":"6278","journal":"atbm","vol_issue_name":"Volume 6, Issue 3","vol":"6","issue":"3","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"}]},{"year":"2017","archive_details":[{"year":"2017","issue_id":"6272","journal":"atbm","vol_issue_name":"Volume 5, Issue 1","vol":"5","issue":"1","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"},{"year":"2017","issue_id":"6273","journal":"atbm","vol_issue_name":"Volume 5, Issue 2","vol":"5","issue":"2","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"},{"year":"2017","issue_id":"6274","journal":"atbm","vol_issue_name":"Volume 5, Issue 3","vol":"5","issue":"3","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"},{"year":"2017","issue_id":"6275","journal":"atbm","vol_issue_name":"Volume 5, Issue 4","vol":"5","issue":"4","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"}]},{"year":"2016","archive_details":[{"year":"2016","issue_id":"6268","journal":"atbm","vol_issue_name":"Volume 4, Issue 1","vol":"4","issue":"1","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"},{"year":"2016","issue_id":"6269","journal":"atbm","vol_issue_name":"Volume 4, Issue 2","vol":"4","issue":"2","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"},{"year":"2016","issue_id":"6270","journal":"atbm","vol_issue_name":"Volume 4, Issue 3","vol":"4","issue":"3","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"},{"year":"2016","issue_id":"6271","journal":"atbm","vol_issue_name":"Volume 4, Issue 4","vol":"4","issue":"4","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"}]},{"year":"2015","archive_details":[{"year":"2015","issue_id":"6264","journal":"atbm","vol_issue_name":"Volume 3, Issue 1","vol":"3","issue":"1","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"},{"year":"2015","issue_id":"6265","journal":"atbm","vol_issue_name":"Volume 3, Issue 2","vol":"3","issue":"2","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"},{"year":"2015","issue_id":"6266","journal":"atbm","vol_issue_name":"Drosophila Melanogaster","vol":"0","issue":"0","iss_type":"1","vol_issue_url":null,"date":"2019-06-28"},{"year":"2015","issue_id":"6267","journal":"atbm","vol_issue_name":"Volume 3, Issue 3","vol":"3","issue":"3","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"}]},{"year":"2014","archive_details":[{"year":"2014","issue_id":"6263","journal":"atbm","vol_issue_name":"Volume 2, Issue 1","vol":"2","issue":"1","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"}]},{"year":"2013","archive_details":[{"year":"2013","issue_id":"6261","journal":"atbm","vol_issue_name":"Volume 1, Issue 1","vol":"1","issue":"1","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"},{"year":"2013","issue_id":"6262","journal":"atbm","vol_issue_name":"Volume 1, Issue 2","vol":"1","issue":"2","iss_type":"0","vol_issue_url":null,"date":"2019-06-28"}]}]
     */

    private int archive_year_cnt;
    private boolean status;
    private String message;
    private List<ArchiveYearsBean> archive_years;

    public int getArchive_year_cnt() {
        return archive_year_cnt;
    }

    public void setArchive_year_cnt(int archive_year_cnt) {
        this.archive_year_cnt = archive_year_cnt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ArchiveYearsBean> getArchive_years() {
        return archive_years;
    }

    public void setArchive_years(List<ArchiveYearsBean> archive_years) {
        this.archive_years = archive_years;
    }

    public static class ArchiveYearsBean {
        /**
         * year : 2020
         * archive_details : [{"year":"2020","issue_id":"6861","journal":"atbm","vol_issue_name":"Volume 8, Issue 1","vol":"8","issue":"1","iss_type":"0","vol_issue_url":null,"date":"2020-01-10"},{"year":"2020","issue_id":"8329","journal":"atbm","vol_issue_name":"Volume 8, Issue 2","vol":"8","issue":"2","iss_type":"0","vol_issue_url":null,"date":"2020-04-23"},{"year":"2020","issue_id":"8958","journal":"atbm","vol_issue_name":"12th World Congress on Precision and Personalized Medicine","vol":"0","issue":"0","iss_type":"1","vol_issue_url":null,"date":"2020-08-31"}]
         */

        private String year;
        private List<ArchiveDetailsBean> archive_details;

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public List<ArchiveDetailsBean> getArchive_details() {
            return archive_details;
        }

        public void setArchive_details(List<ArchiveDetailsBean> archive_details) {
            this.archive_details = archive_details;
        }

        public static class ArchiveDetailsBean {
            /**
             * year : 2020
             * issue_id : 6861
             * journal : atbm
             * vol_issue_name : Volume 8, Issue 1
             * vol : 8
             * issue : 1
             * iss_type : 0
             * vol_issue_url : null
             * date : 2020-01-10
             */

            private String year;
            private String issue_id;
            private String journal;
            private String vol_issue_name;
            private String vol;
            private String issue;
            private String iss_type;
            private String vol_issue_url;
            private String date;

            public String getYear() {
                return year;
            }

            public void setYear(String year) {
                this.year = year;
            }

            public String getIssue_id() {
                return issue_id;
            }

            public void setIssue_id(String issue_id) {
                this.issue_id = issue_id;
            }

            public String getJournal() {
                return journal;
            }

            public void setJournal(String journal) {
                this.journal = journal;
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

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }
    }
}
