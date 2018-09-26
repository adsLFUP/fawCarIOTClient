package com.faw.poc.iotclientmock.DirectlyConnectedMock;

import com.faw.poc.iotclientmock.model.IotMsg;
import oracle.iot.client.DeviceModel;
import oracle.iot.client.StorageObject;
import oracle.iot.client.device.DirectlyConnectedDevice;
import oracle.iot.client.device.VirtualDevice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import java.io.File;
import java.util.List;

@Component
public abstract class MockAbsService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected void handleWork(String hostname,IotMsg iotMsg, String URN, String activation_ID, String file_Protection_Password) throws Exception {
        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
                new javax.net.ssl.HostnameVerifier(){
                    public boolean verify(String hostname,
                                          javax.net.ssl.SSLSession sslSession) {
                        if (hostname.equals(hostname)) {
                            return true;
                        }
                        return false;
                    }
                });
        String content = null;
        DirectlyConnectedDevice dcd = null;
        try {
            dcd = new DirectlyConnectedDevice(activation_ID, file_Protection_Password);
        } catch (Exception e) {
            throw e;
        }
        if (dcd == null) return;
        // Activate the device if it not activated (so that you can run the code more than once!)
        if (!dcd.isActivated()) {
            try {
                dcd.activate(URN);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        // Set up a virtual device based on your device model
        DeviceModel dcdModel = dcd.getDeviceModel(URN);
        VirtualDevice virtualDevice = dcd.createVirtualDevice(dcd.getEndpointId(), dcdModel);
        //Triggers  messages to the Cloud Service.
        sendMessage(virtualDevice, iotMsg);
        try {
            dcd.close();
        } catch (Exception e) {
            throw e;
        }
    }
    public abstract void sendMessage(VirtualDevice virtualDevice, IotMsg iotMsg);

}
