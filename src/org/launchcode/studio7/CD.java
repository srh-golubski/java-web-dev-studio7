package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    public int discSpeed;

    public CD(String discName, double runtime, String genre, double storageLimit, double storageUsed) {
        super(discName, runtime, genre, storageLimit, storageUsed);
    }

    @Override
    public void spinDisc() {
        discSpeed = 300;
    }

    @Override
    public void skipForward() {

    }

    @Override
    public void skipBackward() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
