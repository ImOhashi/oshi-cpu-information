package com.ohashi.oshicpuinformation;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

public class InitProcess {
    public static void main(String[] args) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardwareAbstractionLayer = systemInfo.getHardware();
        CentralProcessor centralProcessor = hardwareAbstractionLayer.getProcessor();

        CentralProcessor.ProcessorIdentifier processorIdentifier = centralProcessor.getProcessorIdentifier();

        System.out.println("Processor Vendor: " + processorIdentifier.getVendor()
                + "\nProcessor Name: " + processorIdentifier.getName()
                + "\nProcessor ID: " + processorIdentifier.getProcessorID()
                + "\nIdentifier: " + processorIdentifier.getIdentifier()
                + "\nMicroarchitecture: " + processorIdentifier.getMicroarchitecture()
                + "\nFrequency (Hz): " + processorIdentifier.getVendorFreq()
                + "\nFrequency (GHz): " + processorIdentifier.getVendorFreq() / 1000000000.0
                + "\nNumber of physical packages: " + centralProcessor.getPhysicalPackageCount()
                + "\nNumber of physical CPU's: " + centralProcessor.getPhysicalProcessorCount()
                + "\nNumber of logical CPU's: " + centralProcessor.getLogicalProcessorCount());
    }
}
