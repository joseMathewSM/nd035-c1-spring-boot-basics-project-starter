package com.udacity.jwdnd.course1.cloudstorage.model;

public class Note {

    private Integer noteid, userid;
    private String notetittle, notedescription ;

    public Note(Integer noteid, Integer userid, String notetittle, String notedescription) {
        this.noteid = noteid;
        this.userid = userid;
        this.notetittle = notetittle;
        this.notedescription = notedescription;
    }

    public Integer getNoteid() {
        return noteid;
    }

    public void setNoteid(Integer noteid) {
        this.noteid = noteid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNotetittle() {
        return notetittle;
    }

    public void setNotetittle(String notetittle) {
        this.notetittle = notetittle;
    }

    public String getNotedescription() {
        return notedescription;
    }

    public void setNotedescription(String notedescription) {
        this.notedescription = notedescription;
    }
}
