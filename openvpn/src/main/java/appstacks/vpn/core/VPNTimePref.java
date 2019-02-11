package appstacks.vpn.core;

import android.content.Context;
import android.content.SharedPreferences;

public class VPNTimePref {
    private SharedPreferences sharedPreferences;

    public static VPNTimePref get(Context context){
        return new VPNTimePref(context);
    }

    private VPNTimePref(Context context) {
        sharedPreferences = context.getSharedPreferences("PREF_TIME_CONNECT", Context.MODE_PRIVATE);
    }

    public void putStartTime(long startTime){
        this.sharedPreferences.edit().putLong("start_time", startTime).apply();
    }

    public long getStartTime(){
        return this.sharedPreferences.getLong("start_time", 0);
    }
}
