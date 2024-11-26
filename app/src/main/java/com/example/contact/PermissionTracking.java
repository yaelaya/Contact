package com.example.contact;


import android.content.Context;

import pub.devrel.easypermissions.EasyPermissions;

public class PermissionTracking {

    public static boolean hasContactPermissions(Context context) {
        return EasyPermissions.hasPermissions(
                context,
                android.Manifest.permission.READ_CONTACTS,
                android.Manifest.permission.WRITE_CONTACTS
        );
    }
}