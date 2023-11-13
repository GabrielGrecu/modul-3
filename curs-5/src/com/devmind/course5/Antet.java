package com.devmind.course5;

public @interface Antet {
    String autor();
    String data();
    String ultimaModificare() default "N/A";

    // Note use of array
    String[] revieweri();
}