package com.waves.model;

public class TEvaluateKey {
    private String evaluatedId;

    private String appraiserId;

    public String getEvaluatedId() {
        return evaluatedId;
    }

    public void setEvaluatedId(String evaluatedId) {
        this.evaluatedId = evaluatedId == null ? null : evaluatedId.trim();
    }

    public String getAppraiserId() {
        return appraiserId;
    }

    public void setAppraiserId(String appraiserId) {
        this.appraiserId = appraiserId == null ? null : appraiserId.trim();
    }
}