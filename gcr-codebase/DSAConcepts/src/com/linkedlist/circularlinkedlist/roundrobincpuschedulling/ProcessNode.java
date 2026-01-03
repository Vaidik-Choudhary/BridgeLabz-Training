package com.linkedlist.circularlinkedlist.roundrobincpuschedulling;

public class ProcessNode {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;

    int completionTime;
    int waitingTime;
    int turnaroundTime;

    ProcessNode next;

    ProcessNode(int id, int burst, int priority) {
        this.processId = id;
        this.burstTime = burst;
        this.remainingTime = burst;
        this.priority = priority;
        this.next = null;
    }
}