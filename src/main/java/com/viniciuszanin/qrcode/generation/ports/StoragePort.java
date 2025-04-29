package com.viniciuszanin.qrcode.generation.ports;

public interface StoragePort {
    String uploadFile(byte[] fileData, String fileName, String contentType);
}
