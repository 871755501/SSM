package com.pojo;

import java.io.Serializable;

public class t_ivrmt_newtransferconfig implements Serializable{

    public int id;
    public String BIZ_NM;
    public String BIZ_TYPE_CD;
    public String USER_LVL_CD;
    public String USER_PRSKEY_TRACE;
    public String SKIP_AHEAD_CATEGORY_ID;
    public String SKIP_BIZ_PRSKEY_VAL;
    public String SKIP_AFTR_LVL;
    public String SKIP_AFTR_PRSKEY_TRACE;
    public String SKIP_AFTR_CATEGORY_ID;
    public String SKIP_AFTR_ROUTE_VAL;
    public String EXT1;
    public String EXT2;
    public String EXT3;
    public String EXT4;
    public String EXT5;
    public String BIZ_DESC;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBIZ_NM() {
        return BIZ_NM;
    }

    public void setBIZ_NM(String BIZ_NM) {
        this.BIZ_NM = BIZ_NM;
    }

    public String getBIZ_TYPE_CD() {
        return BIZ_TYPE_CD;
    }

    public void setBIZ_TYPE_CD(String BIZ_TYPE_CD) {
        this.BIZ_TYPE_CD = BIZ_TYPE_CD;
    }

    public String getUSER_LVL_CD() {
        return USER_LVL_CD;
    }

    public void setUSER_LVL_CD(String USER_LVL_CD) {
        this.USER_LVL_CD = USER_LVL_CD;
    }

    public String getUSER_PRSKEY_TRACE() {
        return USER_PRSKEY_TRACE;
    }

    public void setUSER_PRSKEY_TRACE(String USER_PRSKEY_TRACE) {
        this.USER_PRSKEY_TRACE = USER_PRSKEY_TRACE;
    }

    public String getSKIP_AHEAD_CATEGORY_ID() {
        return SKIP_AHEAD_CATEGORY_ID;
    }

    public void setSKIP_AHEAD_CATEGORY_ID(String SKIP_AHEAD_CATEGORY_ID) {
        this.SKIP_AHEAD_CATEGORY_ID = SKIP_AHEAD_CATEGORY_ID;
    }

    public String getSKIP_BIZ_PRSKEY_VAL() {
        return SKIP_BIZ_PRSKEY_VAL;
    }

    public void setSKIP_BIZ_PRSKEY_VAL(String SKIP_BIZ_PRSKEY_VAL) {
        this.SKIP_BIZ_PRSKEY_VAL = SKIP_BIZ_PRSKEY_VAL;
    }

    public String getSKIP_AFTR_LVL() {
        return SKIP_AFTR_LVL;
    }

    public void setSKIP_AFTR_LVL(String SKIP_AFTR_LVL) {
        this.SKIP_AFTR_LVL = SKIP_AFTR_LVL;
    }

    public String getSKIP_AFTR_PRSKEY_TRACE() {
        return SKIP_AFTR_PRSKEY_TRACE;
    }

    public void setSKIP_AFTR_PRSKEY_TRACE(String SKIP_AFTR_PRSKEY_TRACE) {
        this.SKIP_AFTR_PRSKEY_TRACE = SKIP_AFTR_PRSKEY_TRACE;
    }

    public String getSKIP_AFTR_CATEGORY_ID() {
        return SKIP_AFTR_CATEGORY_ID;
    }

    public void setSKIP_AFTR_CATEGORY_ID(String SKIP_AFTR_CATEGORY_ID) {
        this.SKIP_AFTR_CATEGORY_ID = SKIP_AFTR_CATEGORY_ID;
    }

    public String getSKIP_AFTR_ROUTE_VAL() {
        return SKIP_AFTR_ROUTE_VAL;
    }

    public void setSKIP_AFTR_ROUTE_VAL(String SKIP_AFTR_ROUTE_VAL) {
        this.SKIP_AFTR_ROUTE_VAL = SKIP_AFTR_ROUTE_VAL;
    }

    public String getEXT1() {
        return EXT1;
    }

    public void setEXT1(String EXT1) {
        this.EXT1 = EXT1;
    }

    public String getEXT2() {
        return EXT2;
    }

    public void setEXT2(String EXT2) {
        this.EXT2 = EXT2;
    }

    public String getEXT3() {
        return EXT3;
    }

    public void setEXT3(String EXT3) {
        this.EXT3 = EXT3;
    }

    public String getEXT4() {
        return EXT4;
    }

    public void setEXT4(String EXT4) {
        this.EXT4 = EXT4;
    }

    public String getEXT5() {
        return EXT5;
    }

    public void setEXT5(String EXT5) {
        this.EXT5 = EXT5;
    }

    public String getBIZ_DESC() {
        return BIZ_DESC;
    }

    public void setBIZ_DESC(String BIZ_DESC) {
        this.BIZ_DESC = BIZ_DESC;
    }

    @Override
    public String toString() {
        return "t_ivrmt_newtransferconfig{" +
                "id=" + id +
                ", BIZ_NM='" + BIZ_NM + '\'' +
                ", BIZ_TYPE_CD='" + BIZ_TYPE_CD + '\'' +
                ", USER_LVL_CD='" + USER_LVL_CD + '\'' +
                ", USER_PRSKEY_TRACE='" + USER_PRSKEY_TRACE + '\'' +
                ", SKIP_AHEAD_CATEGORY_ID='" + SKIP_AHEAD_CATEGORY_ID + '\'' +
                ", SKIP_BIZ_PRSKEY_VAL='" + SKIP_BIZ_PRSKEY_VAL + '\'' +
                ", SKIP_AFTR_LVL='" + SKIP_AFTR_LVL + '\'' +
                ", SKIP_AFTR_PRSKEY_TRACE='" + SKIP_AFTR_PRSKEY_TRACE + '\'' +
                ", SKIP_AFTR_CATEGORY_ID='" + SKIP_AFTR_CATEGORY_ID + '\'' +
                ", SKIP_AFTR_ROUTE_VAL='" + SKIP_AFTR_ROUTE_VAL + '\'' +
                ", EXT1='" + EXT1 + '\'' +
                ", EXT2='" + EXT2 + '\'' +
                ", EXT3='" + EXT3 + '\'' +
                ", EXT4='" + EXT4 + '\'' +
                ", EXT5='" + EXT5 + '\'' +
                ", BIZ_DESC='" + BIZ_DESC + '\'' +
                '}';
    }
}
