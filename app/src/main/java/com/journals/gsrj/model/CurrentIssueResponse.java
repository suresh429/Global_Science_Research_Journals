package com.journals.gsrj.model;

import java.util.List;

public class CurrentIssueResponse {


    /**
     * currentissue_cnt : 1
     * status : true
     * message : Records Found
     * currentissue_details : [{"sno":"53414","title":"Progress and Impact of ATBM","author_names":"Dr. Seema Jawalekar*","abstractlink":"","pdflink":"progress-and-impact-of-atbm.pdf","fulltextlink":"progress-and-impact-of-atbm-53414.html","sup_file":"","spage_num":"1","lpage_num":"1","doi_num":"10.4172/2379-1764.1000e110","doi_stat":"0","old_omics_id":"0","art_type":"Editorial Note"},{"sno":"53347","title":"Prevalence of Geohelminthes Infection and its Predisposing Factors among Treatments Seeking Patients at Jimma Town Health Centers Jimma Zone South West Ethiopia","author_names":"Habib Mohammed*, Tsegaye Gaddisa, Arega Tsegaye, Abiru Neme, Gadisa Bekele","abstractlink":"prevalence-of-geohelminthes-infection-and-its-predisposing-factors-among-treatments-seeking-patients-at-jimma-town-healt-53347.html","pdflink":"prevalence-of-geohelminthes-infection-and-its-predisposing-factors-among-treatments-seeking-patients-at-jimma-town-healt.pdf","fulltextlink":"prevalence-of-geohelminthes-infection-and-its-predisposing-factors-among-treatments-seeking-patients-at-jimma-town-health-centers--53347.html","sup_file":"","spage_num":"1","lpage_num":"11","doi_num":"10.4172/2379-1764.1000269","doi_stat":"0","old_omics_id":"0","art_type":"Research Article"},{"sno":"53644","title":"High Quality Treatments for Human Suicidal Events and Mortality","author_names":"Da-Yong Lu*, Ying Shen, Shan Cao","abstractlink":"high-quality-treatments-for-human-suicidal-events-and-mortality-53644.html","pdflink":"high-quality-treatments-for-human-suicidal-events-and-mortality.pdf","fulltextlink":"high-quality-treatments-for-human-suicidal-events-and-mortality-53644.html","sup_file":"","spage_num":"1","lpage_num":"4","doi_num":"10.35248/2379-1764.20.8.270","doi_stat":"0","old_omics_id":"0","art_type":"Review"},{"sno":"54585","title":"Anti-diabetic and Anti-cholesterolmic effects of bettergourd(<em>mommordica charantia linn<\/em>) fresh fruit juice metabolites to cure Alloxan Monohydrate induced Type-1 diabetes in Albino Rats","author_names":"Kumari Shachi, Sanjeev Kumar*, Nayan Kumar Prasad","abstractlink":"antidiabetic-and-anticholesterolmic-effects-of-bettergourdemmommordica-charantia-linnem-fresh-fruit-juice-metabolites-to-54585.html","pdflink":"antidiabetic-and-anticholesterolmic-effects-of-bittergourd-mommordica-charantia-linn--fresh-fruit-juice-metabolites-to-c.pdf","fulltextlink":"antidiabetic-and-anticholesterolmic-effects-of-bettergourdemmommordica-charantia-linnem-fresh-fruit-juice-metabolites-to-cure-allo-54585.html","sup_file":"","spage_num":"1","lpage_num":"3","doi_num":"10.4172/2379-1764.1000271","doi_stat":"0","old_omics_id":"0","art_type":"Research"},{"sno":"55364","title":"Radioactivity Natural Environmental Radiation in Middle of Iraq Governorates","author_names":"Entesser F.Salman* Mohsin Kadhim Muttelab, Jwad K.Manii","abstractlink":"radioactivity-natural-environmental-radiation-in-middle-of-iraq-governorates-55364.html","pdflink":"radioactivity-natural-environmental-radiation-in-middle-of-iraq-governorates.pdf","fulltextlink":"radioactivity-natural-environmental-radiation-in-middle-of-iraq-governorates-55364.html","sup_file":"","spage_num":"1","lpage_num":"4","doi_num":"10.35248/2379-1764.20.8.272","doi_stat":"0","old_omics_id":"0","art_type":"Research Article"}]
     */

    private int currentissue_cnt;
    private boolean status;
    private String message;
    private List<CurrentissueDetailsBean> currentissue_details;

    public int getCurrentissue_cnt() {
        return currentissue_cnt;
    }

    public void setCurrentissue_cnt(int currentissue_cnt) {
        this.currentissue_cnt = currentissue_cnt;
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

    public List<CurrentissueDetailsBean> getCurrentissue_details() {
        return currentissue_details;
    }

    public void setCurrentissue_details(List<CurrentissueDetailsBean> currentissue_details) {
        this.currentissue_details = currentissue_details;
    }

    public static class CurrentissueDetailsBean {
        /**
         * sno : 53414
         * title : Progress and Impact of ATBM
         * author_names : Dr. Seema Jawalekar*
         * abstractlink :
         * pdflink : progress-and-impact-of-atbm.pdf
         * fulltextlink : progress-and-impact-of-atbm-53414.html
         * sup_file :
         * spage_num : 1
         * lpage_num : 1
         * doi_num : 10.4172/2379-1764.1000e110
         * doi_stat : 0
         * old_omics_id : 0
         * art_type : Editorial Note
         */

        private String sno;
        private String title;
        private String author_names;
        private String abstractlink;
        private String pdflink;
        private String fulltextlink;
        private String sup_file;
        private String spage_num;
        private String lpage_num;
        private String doi_num;
        private String doi_stat;
        private String old_omics_id;
        private String art_type;

        public String getSno() {
            return sno;
        }

        public void setSno(String sno) {
            this.sno = sno;
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

        public String getSup_file() {
            return sup_file;
        }

        public void setSup_file(String sup_file) {
            this.sup_file = sup_file;
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

        public String getDoi_num() {
            return doi_num;
        }

        public void setDoi_num(String doi_num) {
            this.doi_num = doi_num;
        }

        public String getDoi_stat() {
            return doi_stat;
        }

        public void setDoi_stat(String doi_stat) {
            this.doi_stat = doi_stat;
        }

        public String getOld_omics_id() {
            return old_omics_id;
        }

        public void setOld_omics_id(String old_omics_id) {
            this.old_omics_id = old_omics_id;
        }

        public String getArt_type() {
            return art_type;
        }

        public void setArt_type(String art_type) {
            this.art_type = art_type;
        }
    }
}
