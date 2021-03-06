package com.example.venture.models;

import com.google.android.gms.maps.model.LatLng;

public class User {

    private String id;
    private String name;
    private String email;
    private String bio;
    private String profilePic;
    private LatLng lastLocation;


    public User() {
        id="";
        name="";
        email="";
        bio="";
        profilePic="";
        lastLocation=null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public LatLng getLastLocation() {
        return lastLocation;
    }

    public void setLastLocation(LatLng lastLocation) {
        this.lastLocation = lastLocation;
    }
}
