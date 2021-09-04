package com.different.date_format;

import java.text.DateFormat;
import java.util.*;

/**
 * @author Sangeethkumar
 *1. Tue Nov 04 20:14:11 EST 2003
 2. 11/4/03 8:14 PM
 3. 8:14:11 PM
 4. Nov 4, 2003 8:14:11 PM
 5. 8:14 PM
 6. 8:14:11 PM
 7. 8:14:11 PM EST
 8. 11/4/03 8:14 PM
 9. Nov 4, 2003 8:14 PM
10. November 4, 2003 8:14:11 PM EST
 */

public class DateFormats {
    public static void main(String[] args) {
        Date mydate = new Date();
        System.out.println(" 1. " + mydate.toString());
        System.out.println(" 2. " + DateFormat.getInstance().format(mydate));
        System.out.println(" 3. " + DateFormat.getTimeInstance().format(mydate));
        System.out.println(" 4. " + DateFormat.getDateTimeInstance().format(mydate));
        System.out.println(" 5. " + DateFormat.getTimeInstance(DateFormat.SHORT).format(mydate));
        System.out.println(" 6. " + DateFormat.getTimeInstance(DateFormat.MEDIUM).format(mydate));
        System.out.println(" 7. " + DateFormat.getTimeInstance(DateFormat.LONG).format(mydate));
        System.out.println(" 8. " + DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(mydate));
        System.out.println(" 9. " + DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(mydate));
        System.out.println(" 10. "+ DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(mydate));
    }
}

