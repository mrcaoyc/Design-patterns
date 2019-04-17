package com.github.mrcaoyc.adapter.objectadapter;

import com.github.mrcaoyc.adapter.classadapter.UsbDataLine;
import com.github.mrcaoyc.adapter.classadapter.UsbPort;

/**
 * @author CaoYongCheng
 */
public class Test {
    public static void main(String[] args) {
        UsbPort usbPort = new UsbDataLine();
        usbPort.getUsbPort();
    }
}
