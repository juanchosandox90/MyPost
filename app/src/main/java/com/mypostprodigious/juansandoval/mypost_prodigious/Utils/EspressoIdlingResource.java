package com.mypostprodigious.juansandoval.mypost_prodigious.Utils;


import android.support.test.espresso.IdlingResource;
import android.support.test.espresso.idling.CountingIdlingResource;

public class EspressoIdlingResource {

    private static final String RESOURCE = "GLOBAL";

    private static CountingIdlingResource mCountingIdlingResource =
            new CountingIdlingResource(RESOURCE);

    public static void increment() {
        mCountingIdlingResource.increment();
    }

    public static void decrement() {
        mCountingIdlingResource.decrement();
    }

    public static IdlingResource getIdlingResource() {
        return mCountingIdlingResource;
    }
}

