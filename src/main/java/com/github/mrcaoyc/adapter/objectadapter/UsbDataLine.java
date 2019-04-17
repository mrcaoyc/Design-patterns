package com.github.mrcaoyc.adapter.objectadapter;

/**
 * @author CaoYongCheng
 */
public class UsbDataLine implements UsbPort {
    private PhonePort phonePort = new PhonePort();

    @Override
    public void getUsbPort() {
        phonePort.getPhonePort();
    }
}
