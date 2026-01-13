package com.callcenter;

public class CallCenterMain {

    public static void main(String[] args) {

        CallCenter callCenter = new CallCenter();

        Customer c1 = new Customer(1, "Ravi", false);
        Customer c2 = new Customer(2, "Divyansh", true);
        Customer c3 = new Customer(1, "Akshat", false);

        callCenter.addCall(c1);
        callCenter.addCall(c2);
        callCenter.addCall(c3);

        callCenter.serveCall();
        callCenter.serveCall();

        callCenter.showCallCount(1);
    }
}
