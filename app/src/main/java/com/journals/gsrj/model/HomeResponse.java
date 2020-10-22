package com.journals.gsrj.model;

import java.util.List;

public class HomeResponse {


    /**
     * status : true
     * cat_cnt : 12
     * cat_details : [{"cat_id":"21","cat_name":"Medical Sciences","cat_img":"medical-sciences.jpg","page_url":"https://www.longdom.org/medical-sciences-journals.html"},{"cat_id":"2","cat_name":"Biochemistry","cat_img":"biochemistry.jpg","page_url":"https://www.longdom.org/biochemistry-journals.html"},{"cat_id":"25","cat_name":"Pharmaceutical Sciences","cat_img":"pharmaceutical-sciences.jpg","page_url":"https://www.longdom.org/pharmaceutical-sciences-journals.html"},{"cat_id":"8","cat_name":"Clinical Sciences","cat_img":"clinical-sciences.jpg","page_url":"https://www.longdom.org/clinical-sciences-journals.html"},{"cat_id":"15","cat_name":"Genetics & Molecular Biology","cat_img":"genetics-and-molecular-biology.jpg","page_url":"https://www.longdom.org/genetics-and-molecular-biology-journals.html"},{"cat_id":"17","cat_name":"Immunology & Microbiology","cat_img":"immunology-and-microbiology.jpg","page_url":"https://www.longdom.org/immunology-and-microbiology-journals.html"},{"cat_id":"3","cat_name":"Bioinformatics & Systems Biology","cat_img":"bioinformatics-and-systems-biology.jpg","page_url":"https://www.longdom.org/bioinformatics-and-systems-biology-journals.html"},{"cat_id":"23","cat_name":"Neuroscience & Psychology","cat_img":"neuroscience-and-psychology.jpg","page_url":"https://www.longdom.org/neuroscience-and-psychology-journals.html"},{"cat_id":"11","cat_name":"Engineering","cat_img":"engineering.jpg","page_url":"https://www.longdom.org/engineering-journals.html"},{"cat_id":"5","cat_name":"Business & Management","cat_img":"business-and-management.jpg","page_url":"https://www.longdom.org/business-and-management-journals.html"},{"cat_id":"14","cat_name":"General Science","cat_img":"general-science.jpg","page_url":"https://www.longdom.org/general-science-journals.html"},{"cat_id":"1","cat_name":"Agri, Food & Aqua","cat_img":"agri-and-aquaculture.jpg","page_url":"https://www.longdom.org/agri-and-aquaculture-journals.html"}]
     * currissue_highlights : [{"sno":"53724","title":"The combined use of Adrenocorticotropic hormone (ACTH) and Calcineurin inhibitor (CNI) in the treatment of Refractory Nephrotic Syndrome in a child","author_names":"Amirtha Chinnadurai, Julie E. Goodwin","abstractlink":"the-combined-use-of-adrenocorticotropic-hormone-acth-and-calcineurin-inhibitor-cni-in-the-treatment-of-refractory-nephro-53724.html","pdflink":"the-combined-use-of-adrenocorticotropic-hormone-acth-and-calcineurin-inhibitor-cni-in-the-treatment-of-refractory-nephro.pdf","fulltextlink":null,"doi_num":"10.35248/2385-4529.20.7.39","doi_stat":"0","year":"2020","jshort_name":"","old_omics_id":"0","rel_keyword":"articles","managejournal":"Advances in Pediatric Research","art_type":"Case Report","vol":"7","issue":"2","month_name":"May"},{"sno":"54351","title":"What proportion of the brain structural and functional abnormalities observed among children with fetal alcohol spectrum disorder is explained by their prenatal alcohol exposure and their other prenatal and postnatal risks?","author_names":"Susan J Astley Hemingway, Julian K. Davies, Tracy Jirikowic, Erin Olson","abstractlink":"what-proportion-of-the-brain-structural-and-functional-abnormalities-observed-among-children-with-fetal-alcohol-spectrum-54351.html","pdflink":"what-proportion-of-the-brain-structural-and-functional-abnormalities-observed-among-children-with-fetal-alcohol-spectrum.pdf","fulltextlink":null,"doi_num":"10.35248/2385-4529.20.7.41","doi_stat":"0","year":"2020","jshort_name":"","old_omics_id":"0","rel_keyword":"articles","managejournal":"Advances in Pediatric Research","art_type":"Research Article","vol":"7","issue":"2","month_name":"June"},{"sno":"55258","title":"Comparative Analysis of Performance Characteristics of CI Engine with and without HHO Gas (Brown Gas)..","author_names":"Ghulam Abbas Gohar","abstractlink":"comparative-analysis-of-performance-characteristics-of-ci-engine-with-and-without-hho-gas-brown-gas-55258.html","pdflink":"comparative-analysis-of-performance-characteristics-of-ci-engine-with-and-without-hho-gas-brown-gas.pdf","fulltextlink":null,"doi_num":"","doi_stat":"0","year":"2020","jshort_name":"GJEDT","old_omics_id":"0","rel_keyword":"articles","managejournal":"Global Journal of Engineering, Design & Technology","art_type":"Short Communication","vol":"9","issue":"2","month_name":"July"},{"sno":"55259","title":"An Effective Harmony Search Algorithm for Solving a No-Wait Hybrid Flow Shop Scheduling Problem with Machine Availability Constraint..","author_names":"Mohammad Rahmanidoust","abstractlink":"an-effective-harmony-search-algorithm-for-solving-a-nowait-hybrid-flow-shop-scheduling-problem-with-machine-availability-55259.html","pdflink":"an-effective-harmony-search-algorithm-for-solving-a-nowait-hybrid-flow-shop-scheduling-problem-with-machine-availability.pdf","fulltextlink":null,"doi_num":"","doi_stat":"0","year":"2020","jshort_name":"GJEDT","old_omics_id":"0","rel_keyword":"articles","managejournal":"Global Journal of Engineering, Design & Technology","art_type":"Short Communication","vol":"9","issue":"2","month_name":"July"},{"sno":"55260","title":"Configuration Items Selection Process Review..","author_names":"Jaime Larumbe","abstractlink":"configuration-items-selection-process-review-55260.html","pdflink":"configuration-items-selection-process-review.pdf","fulltextlink":null,"doi_num":"","doi_stat":"0","year":"2020","jshort_name":"GJEDT","old_omics_id":"0","rel_keyword":"articles","managejournal":"Global Journal of Engineering, Design & Technology","art_type":"Short Communication","vol":"9","issue":"2","month_name":"July"},{"sno":"55261","title":"Fluid Structure Interaction Based Investigation on Convergent-Divergent Nozzle and Study of Coating Material..","author_names":"Shridevi S Keralamatti","abstractlink":"fluid-structure-interaction-based-investigation-on-convergentdivergent-nozzle-and-study-of-coating-material-55261.html","pdflink":"fluid-structure-interaction-based-investigation-on-convergentdivergent-nozzle-and-study-of-coating-material.pdf","fulltextlink":null,"doi_num":"","doi_stat":"0","year":"2020","jshort_name":"GJEDT","old_omics_id":"0","rel_keyword":"articles","managejournal":"Global Journal of Engineering, Design & Technology","art_type":"Short Communication","vol":"9","issue":"2","month_name":"July"}]
     */

    private boolean status;
    private int cat_cnt;
    private List<CatDetailsBean> cat_details;
    private List<CurrissueHighlightsBean> currissue_highlights;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCat_cnt() {
        return cat_cnt;
    }

    public void setCat_cnt(int cat_cnt) {
        this.cat_cnt = cat_cnt;
    }

    public List<CatDetailsBean> getCat_details() {
        return cat_details;
    }

    public void setCat_details(List<CatDetailsBean> cat_details) {
        this.cat_details = cat_details;
    }

    public List<CurrissueHighlightsBean> getCurrissue_highlights() {
        return currissue_highlights;
    }

    public void setCurrissue_highlights(List<CurrissueHighlightsBean> currissue_highlights) {
        this.currissue_highlights = currissue_highlights;
    }

    public static class CatDetailsBean {
        /**
         * cat_id : 21
         * cat_name : Medical Sciences
         * cat_img : medical-sciences.jpg
         * page_url : https://www.longdom.org/medical-sciences-journals.html
         */

        private String cat_id;
        private String cat_name;
        private String cat_img;
        private String page_url;

        public String getCat_id() {
            return cat_id;
        }

        public void setCat_id(String cat_id) {
            this.cat_id = cat_id;
        }

        public String getCat_name() {
            return cat_name;
        }

        public void setCat_name(String cat_name) {
            this.cat_name = cat_name;
        }

        public String getCat_img() {
            return cat_img;
        }

        public void setCat_img(String cat_img) {
            this.cat_img = cat_img;
        }

        public String getPage_url() {
            return page_url;
        }

        public void setPage_url(String page_url) {
            this.page_url = page_url;
        }
    }

    public static class CurrissueHighlightsBean {
        /**
         * sno : 53724
         * title : The combined use of Adrenocorticotropic hormone (ACTH) and Calcineurin inhibitor (CNI) in the treatment of Refractory Nephrotic Syndrome in a child
         * author_names : Amirtha Chinnadurai, Julie E. Goodwin
         * abstractlink : the-combined-use-of-adrenocorticotropic-hormone-acth-and-calcineurin-inhibitor-cni-in-the-treatment-of-refractory-nephro-53724.html
         * pdflink : the-combined-use-of-adrenocorticotropic-hormone-acth-and-calcineurin-inhibitor-cni-in-the-treatment-of-refractory-nephro.pdf
         * fulltextlink : null
         * doi_num : 10.35248/2385-4529.20.7.39
         * doi_stat : 0
         * year : 2020
         * jshort_name :
         * old_omics_id : 0
         * rel_keyword : articles
         * managejournal : Advances in Pediatric Research
         * art_type : Case Report
         * vol : 7
         * issue : 2
         * month_name : May
         */

        private String sno;
        private String title;
        private String author_names;
        private String abstractlink;
        private String pdflink;
        private String fulltextlink;
        private String doi_num;
        private String doi_stat;
        private String year;
        private String jshort_name;
        private String old_omics_id;
        private String rel_keyword;
        private String managejournal;
        private String art_type;
        private String vol;
        private String issue;
        private String month_name;

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

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getJshort_name() {
            return jshort_name;
        }

        public void setJshort_name(String jshort_name) {
            this.jshort_name = jshort_name;
        }

        public String getOld_omics_id() {
            return old_omics_id;
        }

        public void setOld_omics_id(String old_omics_id) {
            this.old_omics_id = old_omics_id;
        }

        public String getRel_keyword() {
            return rel_keyword;
        }

        public void setRel_keyword(String rel_keyword) {
            this.rel_keyword = rel_keyword;
        }

        public String getManagejournal() {
            return managejournal;
        }

        public void setManagejournal(String managejournal) {
            this.managejournal = managejournal;
        }

        public String getArt_type() {
            return art_type;
        }

        public void setArt_type(String art_type) {
            this.art_type = art_type;
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

        public String getMonth_name() {
            return month_name;
        }

        public void setMonth_name(String month_name) {
            this.month_name = month_name;
        }
    }
}
