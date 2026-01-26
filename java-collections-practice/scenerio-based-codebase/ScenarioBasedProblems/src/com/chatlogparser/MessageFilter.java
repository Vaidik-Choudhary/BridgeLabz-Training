package com.chatlogparser;

public interface MessageFilter<T> {
    boolean shouldKeep(T message);
}
