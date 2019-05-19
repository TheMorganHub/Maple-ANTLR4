package com.morgandev.app.utils.bundles;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class ResourceBundleHandler {

    private ResourceBundle bundle;
    private String resourceName;

    public ResourceBundleHandler(String resourceName) {
        this.resourceName = resourceName;
        this.bundle = ResourceBundle.getBundle(resourceName);
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getMessage(Object key, Object... args) {
        String msg = bundle.getString(key.toString());
        String formatted = MessageFormat.format(msg, args);
        return formatted;
    }

}
