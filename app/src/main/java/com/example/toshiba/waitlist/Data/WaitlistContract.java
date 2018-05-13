package com.example.toshiba.waitlist.Data;

import android.provider.BaseColumns;

/**
 * Created by TOSHIBA on 07/04/2018.
 */

public class WaitlistContract {
    public static final class WaitlistEntry implements BaseColumns {
        public static final String TABLE_NAME = "waitlist";
        public static final String COLUMN_GUEST_NAME = "guestName";
        public static final String COLUMN_PARTY_SIZE = "partySize";
        public static final String COLUMN_TIMESTAMP = "timestamp";
    }
}
