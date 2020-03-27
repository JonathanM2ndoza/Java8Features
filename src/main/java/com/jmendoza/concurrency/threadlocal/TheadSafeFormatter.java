package com.jmendoza.concurrency.threadlocal;

import java.text.SimpleDateFormat;

/**
 * The TheadLocal construct allows us to store data that will be accessible only by a specific thread.
 */
public class TheadSafeFormatter {
    public static final ThreadLocal<SimpleDateFormat> simpleDateFormatThreadLocal = ThreadLocal.withInitial(
            () -> new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"));
}