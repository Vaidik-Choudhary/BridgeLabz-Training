package com.callcenter;

import java.util.*;

public class CallCenter {

    private Queue<Customer> normalQueue;
    private PriorityQueue<Customer> vipQueue;
    private HashMap<Integer, Integer> callCount;

    public CallCenter() {
    	    normalQueue = new LinkedList<>();
        vipQueue = new PriorityQueue<>(Comparator.comparingLong(Customer::getCallTime));
        callCount = new HashMap<>();
    }

    public void addCall(Customer customer) {

        callCount.put(customer.getId(),callCount.getOrDefault(customer.getId(), 0) + 1);
        if (customer.isVip()) {
            vipQueue.offer(customer);
        } else {
            normalQueue.offer(customer);
        }

        System.out.println("Call added: " + customer.getName());
    }

    public void serveCall() {

        Customer customer;

        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            customer = normalQueue.poll();
        } else {
            System.out.println("No calls to serve.");
            return;
        }

        System.out.println("Serving customer: " + customer.getName());
    }

    public void showCallCount(int customerId) {
        System.out.println(
                "Total calls this month: " +
                callCount.getOrDefault(customerId, 0));
    }
}

