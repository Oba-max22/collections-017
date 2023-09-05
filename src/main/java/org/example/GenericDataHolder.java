package org.example;

import java.util.Arrays;

public class GenericDataHolder<T> {
    String message;
    T data;


    public GenericDataHolder(String message, T data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {

        return "GenericDataHolder{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
