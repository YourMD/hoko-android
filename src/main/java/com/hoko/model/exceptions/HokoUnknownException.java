package com.hoko.model.exceptions;

public class HokoUnknownException extends HokoException {
    public HokoUnknownException() {
        super(0, "Unknown error.");
    }
}
