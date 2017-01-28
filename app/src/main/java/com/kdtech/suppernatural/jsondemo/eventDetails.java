package com.kdtech.suppernatural.jsondemo;

/**
 * Created by kusha_000 on 26-01-2017.
 */

public class eventDetails {
    private String nEventName;
    private int nEventThumbnail;

    public eventDetails() {
    }
    public eventDetails(String vEventName,int vEventThumbnail){
        this.nEventName = vEventName;
        this.nEventThumbnail = vEventThumbnail;
    }
    public String getEventName(){
        return nEventName;
    }
    public int getEventImg(){
        return nEventThumbnail;
    }
    public void setEventName(String nEventName) {
        this.nEventName= nEventName;
    }
    public void setThumbnail(int thumbnail) {
        this.nEventThumbnail = thumbnail;
    }
}