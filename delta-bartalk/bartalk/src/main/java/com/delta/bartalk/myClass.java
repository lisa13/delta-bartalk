package com.delta.bartalk;

import android.util.Log;

/**
 * Created by lucifer13 on 1/28/2017.
 */

public class myClass {
    public void stopLooping(){
        char[] letters = {'b', 'c', 'e', 'b'};
        boolean isBinIt = false;
        for (int i=0; i< letters.length; i++){
            if(letters[i] == 'b') {
                isBinIt = true;
                Log.d(isBinIt.toString());
                break;
            }
        }
    }

}

