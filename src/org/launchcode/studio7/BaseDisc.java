package org.launchcode.studio7;
//Abstract class

public class BaseDisc {

    //fields
    private String discName;
   private double runtime;
   private String genre;
   private double storageLimit;
   private double storageUsed;

   //constructor
    public BaseDisc(String discName, double runtime, String genre, double storageLimit, double storageUsed) {
        this.discName = discName;
        this.runtime = runtime;
        this.genre = genre;
        this.storageLimit = storageLimit;
        this.storageUsed = storageUsed;
    }

    //getters and setters
    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public double getRuntime() {
        return runtime;
    }

    public void setRuntime(double runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getStorageLimit() {
        return storageLimit;
    }

    public void setStorageLimit(double storageLimit) {
        this.storageLimit = storageLimit;
    }

    public double getStorageUsed() {
        return storageUsed;
    }

    public void setStorageUsed(double storageUsed) {
        this.storageUsed = storageUsed;
    }


    //methods
    public void reportDiscInformation() {
        System.out.println(discName);
    }

    public boolean checkCompatibility(String deviceType) {
        if(deviceType.matches("Computer")) {
            return true;
        } else {
            return false;
        }
    }

    public void skipTrack() {

    }


}
