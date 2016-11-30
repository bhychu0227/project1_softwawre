package com.example.computer_pc.project1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;

public class WifiDirectBroadcastReceiver extends BroadcastReceiver {

    private WifiP2pManager mManager;
    private WifiP2pManager.Channel mChannel;
    private ConnectionFragment mFragment;

    public WifiDirectBroadcastReceiver(WifiP2pManager manager, WifiP2pManager.Channel channel,
                                       ConnectionFragment fragment) {
        super();
        this.mManager = manager;
        this.mChannel = channel;
        this.mFragment = fragment;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        final String LOG_TAG = WifiDirectBroadcastReceiver.class.getSimpleName();

        String action = intent.getAction();

        if (WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION.equals(action)) {
            // TODO: check to see if Wifi is enabled and notify appropriate activity
            int state = intent.getIntExtra(WifiP2pManager.EXTRA_WIFI_STATE, -1);
            if (state == WifiP2pManager.WIFI_P2P_STATE_ENABLED) {
                // wWifi P2P is enabled
            } else {
                // Wifi P2P is not enabled

            }
        } else if (WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION.equals(action)) {
            // TODO: Call wifip2pmanager.requestppers() to get a list of current peers
        } else if (WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION.equals(action)) {
            // TODO: Respond to new conenction or disconnections
        } else if (WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION.equals(action)) {
            // TODO: Respond to this device's wifi state changing
        }

    }
}
