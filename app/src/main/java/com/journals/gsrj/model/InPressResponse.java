package com.journals.gsrj.model;

import java.util.List;

public class InPressResponse {


    /**
     * inpress_cnt : 1
     * status : true
     * message : Records Found
     * inpress_details : [{"sno":"55848","title":"Concurrent Pars Plana Vitrectomy and DSAEK to Manage Pseudophakic Bullous Keratopathy and Intraocular Lens Dislocation: A Case Report","author_names":"Hamidreza Torabi, Seyed-Hashem Daryabari","abstractlink":"concurrent-pars-plana-vitrectomy-and-dsaek-to-manage-pseudophakic-bullous-keratopathy-and-intraocular-lens-dislocation-a-55848.html","pdflink":"concurrent-pars-plana-vitrectomy-and-dsaek-to-manage-pseudophakic-bullous-keratopathy-and-intraocular-lens-dislocation-a.pdf","fulltextlink":null,"spage_num":"1","lpage_num":"3","doi_num":"10.35248/2155-9570.20.11.853","doi_stat":"0","pub_date":"2020-07-28","rec_date":"2020-07-07","old_omics_id":"0","sup_file":"","art_type":"Case Report"},{"sno":"55970","title":"The Foveal Splitter","author_names":"ShishirVerghese, George J Manayath, Karan A Kumarswamy","abstractlink":"the-foveal-splitter-55970.html","pdflink":"the-foveal-splitter.pdf","fulltextlink":null,"spage_num":"1","lpage_num":"2","doi_num":"10.35248/2155-9570.20.11.855","doi_stat":"0","pub_date":"2020-08-24","rec_date":"2020-08-03","old_omics_id":"0","sup_file":"","art_type":"Image Article"},{"sno":"55770","title":"The Efficacy of Anterior-Nasal Surgery in Managing Inferior Oblique Overaction either with DVD or with V Pattern","author_names":"Mostafa A Arafa, El Sayed M Eltoukhy, Mahmoud A Kamal, Mohamed M Said","abstractlink":"the-efficacy-of-anteriornasal-surgery-in-managing-inferior-oblique-overaction-either-with-dvd-or-with-v-pattern-55770.html","pdflink":"the-efficacy-of-anteriornasal-surgery-in-managing-inferior-oblique-overaction-either-with-dvd-or-with-v-pattern.pdf","fulltextlink":"","spage_num":"1","lpage_num":"5","doi_num":"10.35248/2155-9570.20.11.854","doi_stat":"0","pub_date":"2020-08-03","rec_date":"2020-07-13","old_omics_id":"0","sup_file":"","art_type":"Research Article"}]
     */

    private int inpress_cnt;
    private boolean status;
    private String message;
    private List<InpressDetailsBean> inpress_details;

    public int getInpress_cnt() {
        return inpress_cnt;
    }

    public void setInpress_cnt(int inpress_cnt) {
        this.inpress_cnt = inpress_cnt;
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

    public List<InpressDetailsBean> getInpress_details() {
        return inpress_details;
    }

    public void setInpress_details(List<InpressDetailsBean> inpress_details) {
        this.inpress_details = inpress_details;
    }

    public static class InpressDetailsBean {
        /**
         * sno : 55848
         * title : Concurrent Pars Plana Vitrectomy and DSAEK to Manage Pseudophakic Bullous Keratopathy and Intraocular Lens Dislocation: A Case Report
         * author_names : Hamidreza Torabi, Seyed-Hashem Daryabari
         * abstractlink : concurrent-pars-plana-vitrectomy-and-dsaek-to-manage-pseudophakic-bullous-keratopathy-and-intraocular-lens-dislocation-a-55848.html
         * pdflink : concurrent-pars-plana-vitrectomy-and-dsaek-to-manage-pseudophakic-bullous-keratopathy-and-intraocular-lens-dislocation-a.pdf
         * fulltextlink : null
         * spage_num : 1
         * lpage_num : 3
         * doi_num : 10.35248/2155-9570.20.11.853
         * doi_stat : 0
         * pub_date : 2020-07-28
         * rec_date : 2020-07-07
         * old_omics_id : 0
         * sup_file :
         * art_type : Case Report
         */

        private String sno;
        private String title;
        private String author_names;
        private String abstractlink;
        private String pdflink;
        private String fulltextlink;
        private String spage_num;
        private String lpage_num;
        private String doi_num;
        private String doi_stat;
        private String pub_date;
        private String rec_date;
        private String old_omics_id;
        private String sup_file;
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

        public String getOld_omics_id() {
            return old_omics_id;
        }

        public void setOld_omics_id(String old_omics_id) {
            this.old_omics_id = old_omics_id;
        }

        public String getSup_file() {
            return sup_file;
        }

        public void setSup_file(String sup_file) {
            this.sup_file = sup_file;
        }

        public String getArt_type() {
            return art_type;
        }

        public void setArt_type(String art_type) {
            this.art_type = art_type;
        }
    }
}
