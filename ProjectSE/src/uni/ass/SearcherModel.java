/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.ass;

import java.net.InetAddress;
import java.util.Date;


/**
 *
 * @author omarbahareth
 */
public class SearcherModel {
    
    private Date contactDate;
    private String ipAddress;
    
    public SearcherModel() {
    }
    
    public SearcherModel(Date contactDate, String ipAddress) {
        this.contactDate = contactDate;
        this.ipAddress = ipAddress;
    }

    /**
     * @return the contactDate
     */
    public Date getContactDate() {
        return contactDate;
    }

    /**
     * @param contactDate the contactDate to set
     */
    public void setContactDate(Date contactDate) {
        this.contactDate = contactDate;
    }

    /**
     * @return the ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * @param ipAddress the ipAddress to set
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
}
