package com.example.kinbee.yaowarat.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kinbee on 12/11/2016 AD.
 */

public class Loginrespont {

    @SerializedName("StatusID")
    @Expose
    private String statusID;
    @SerializedName("MemberID")
    @Expose
    private String memberID;
    @SerializedName("Username")
    @Expose
    private String username;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("Pic")
    @Expose
    private String pic;
    @SerializedName("Error")
    @Expose
    private String error;

    /**
     *
     * @return
     * The statusID
     */
    public String getStatusID() {
        return statusID;
    }

    /**
     *
     * @param statusID
     * The StatusID
     */
    public void setStatusID(String statusID) {
        this.statusID = statusID;
    }

    /**
     *
     * @return
     * The memberID
     */
    public String getMemberID() {
        return memberID;
    }

    /**
     *
     * @param memberID
     * The MemberID
     */
    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    /**
     *
     * @return
     * The username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     * The Username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     * The email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     * The Email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     * The pic
     */
    public String getPic() {
        return pic;
    }

    /**
     *
     * @param pic
     * The Pic
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     *
     * @return
     * The error
     */
    public String getError() {
        return error;
    }

    /**
     *
     * @param error
     * The Error
     */
    public void setError(String error) {
        this.error = error;
    }


}

