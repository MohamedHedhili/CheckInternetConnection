package com.mohamedhedhili.checkinternetconnection;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by mohamedHedhili on 07/11/2016.
 */
public class InternetConnection {
    private Context context  ;
    public InternetConnection(Context context)
    {
        this.context= context ;
    }
    public  boolean IsConnected ()
    {
        ConnectivityManager connectivitymanager =(ConnectivityManager )context.getSystemService(Context.CONNECTIVITY_SERVICE) ;
        if  (connectivitymanager != null)
        {
            NetworkInfo info  = connectivitymanager.getActiveNetworkInfo() ;
            if (info!=null  && info.isConnected() )
            {return  true ;}
        }
        return  false  ;
    }
}
