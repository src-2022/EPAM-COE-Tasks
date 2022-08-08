package org.example.properties.converters;

import org.example.enumeration.SupportedBrowsers;

public final class SupportedBrowserConverter {
    public static SupportedBrowsers valueOfWebBrowser(String webBrowser) {
        String brow;

        if (webBrowser.equalsIgnoreCase("local_chrome"))
                return SupportedBrowsers.LOCAL_CHROME;
        else if (webBrowser.equalsIgnoreCase("local_firefox")) {
            return SupportedBrowsers.LOCAL_FIREFOX;

        } else if (webBrowser.equalsIgnoreCase("remote_chrome")) {
            return SupportedBrowsers.REMOTE_CHROME;
        }
        else throw new IllegalArgumentException("No appropriate browser found");

//        return switch (webBrowser) {
//            case "local_chrome" -> SupportedBrowsers.LOCAL_CHROME;
//            case "local_firefox" -> SupportedBrowsers.LOCAL_FIREFOX;
//            case "remote_chrome" -> SupportedBrowsers.REMOTE_CHROME;
//            default -> throw new IllegalArgumentException("No appropriate browser found");
//        };
    }
}
