package com.abramkin.chatprototype.chat;

/**
 * Represents an operation that accepts a single input argument and returns no result.
 */
public interface Consumer<T>
{
    void accept(T value);
}
