package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    public int discSpeed;

    public DVD(String discName, double runtime, String genre, double storageLimit, double storageUsed) {
        super(discName, runtime, genre, storageLimit, storageUsed);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void spinDisc() {
        discSpeed = 600;
    }

    @Override
    public void skipForward() {

    }

    @Override
    public void skipBackward() {

    }
}
