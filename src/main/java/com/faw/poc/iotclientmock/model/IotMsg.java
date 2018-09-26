package com.faw.poc.iotclientmock.model;

public class IotMsg {
    private Double RMSV;
    private Double PeakV;
    private Double PPV;
    private Double SlopeV;
    private Double KurtosisV;
    private Double WaveFactorV;
    private Double PeakFactorV;
    private Double PulseFactorV;
    private Double ClearnanceFactorV;
    private Double KurtosisFactorV;

    public Double getRMSV() {
        return RMSV;
    }

    public void setRMSV(Double RMSV) {
        this.RMSV = RMSV;
    }

    public Double getPeakV() {
        return PeakV;
    }

    public void setPeakV(Double peakV) {
        PeakV = peakV;
    }

    public Double getPPV() {
        return PPV;
    }

    public void setPPV(Double PPV) {
        this.PPV = PPV;
    }

    public Double getSlopeV() {
        return SlopeV;
    }

    public void setSlopeV(Double slopeV) {
        SlopeV = slopeV;
    }

    public Double getKurtosisV() {
        return KurtosisV;
    }

    public void setKurtosisV(Double kurtosisV) {
        KurtosisV = kurtosisV;
    }

    public Double getWaveFactorV() {
        return WaveFactorV;
    }

    public void setWaveFactorV(Double waveFactorV) {
        WaveFactorV = waveFactorV;
    }

    public Double getPeakFactorV() {
        return PeakFactorV;
    }

    public void setPeakFactorV(Double peakFactorV) {
        PeakFactorV = peakFactorV;
    }

    public Double getPulseFactorV() {
        return PulseFactorV;
    }

    public void setPulseFactorV(Double pulseFactorV) {
        PulseFactorV = pulseFactorV;
    }

    public Double getClearnanceFactorV() {
        return ClearnanceFactorV;
    }

    public void setClearnanceFactorV(Double clearnanceFactorV) {
        ClearnanceFactorV = clearnanceFactorV;
    }

    public Double getKurtosisFactorV() {
        return KurtosisFactorV;
    }

    public void setKurtosisFactorV(Double kurtosisFactorV) {
        KurtosisFactorV = kurtosisFactorV;
    }

    @Override
    public String toString() {
        return "IotMsg{" +
                "RMSV=" + RMSV +
                ", PeakV=" + PeakV +
                ", PPV=" + PPV +
                ", SlopeV=" + SlopeV +
                ", KurtosisV=" + KurtosisV +
                ", WaveFactorV=" + WaveFactorV +
                ", PeakFactorV=" + PeakFactorV +
                ", PulseFactorV=" + PulseFactorV +
                ", ClearnanceFactorV=" + ClearnanceFactorV +
                ", KurtosisFactorV=" + KurtosisFactorV +
                '}';
    }
}
