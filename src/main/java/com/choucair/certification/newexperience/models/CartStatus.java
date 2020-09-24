package com.choucair.certification.newexperience.models;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public enum CartStatus {
	
	Active(FALSE), Selected(TRUE);

    private final Boolean whenChecked;

    CartStatus(Boolean whenChecked) {
        this.whenChecked = whenChecked;
    }

    public static CartStatus from(Boolean itemChecked) {
        for (CartStatus cartStatus : values()) {
            if(cartStatus.whenChecked == itemChecked) { return cartStatus; }
        }
        throw new IllegalArgumentException("Illegal value " + itemChecked);
    }

}
