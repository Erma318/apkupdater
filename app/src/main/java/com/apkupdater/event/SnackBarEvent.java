package com.apkupdater.event;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class SnackBarEvent
{
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private String message;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public SnackBarEvent(
        String message
    ) {
        this.message = message;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getMessage() {
        return message;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////