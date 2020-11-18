package com.theviciousgames.rootchecker;

import eu.chainfire.libsuperuser.Shell;

public class Tools {
    public static boolean getRootStatus()
    {
        if(Shell.SU.available())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
