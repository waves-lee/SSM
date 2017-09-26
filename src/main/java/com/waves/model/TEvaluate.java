package com.waves.model;

public class TEvaluate extends TEvaluateKey {
    private String evaluated;

    private String department;

    private String rank;

    private String appraiser;

    private String type;

    private String state;

    private Integer score1;

    private Integer score2;

    private Integer score3;

    private Integer score4;

    private Integer score5;

    private Integer score6;

    private Integer score7;

    private Integer score8;

    private Integer score9;

    private Integer sum;

    public String getEvaluated() {
        return evaluated;
    }

    public void setEvaluated(String evaluated) {
        this.evaluated = evaluated == null ? null : evaluated.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getAppraiser() {
        return appraiser;
    }

    public void setAppraiser(String appraiser) {
        this.appraiser = appraiser == null ? null : appraiser.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getScore1() {
        return score1;
    }

    public void setScore1(Integer score1) {
        this.score1 = score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public void setScore2(Integer score2) {
        this.score2 = score2;
    }

    public Integer getScore3() {
        return score3;
    }

    public void setScore3(Integer score3) {
        this.score3 = score3;
    }

    public Integer getScore4() {
        return score4;
    }

    public void setScore4(Integer score4) {
        this.score4 = score4;
    }

    public Integer getScore5() {
        return score5;
    }

    public void setScore5(Integer score5) {
        this.score5 = score5;
    }

    public Integer getScore6() {
        return score6;
    }

    public void setScore6(Integer score6) {
        this.score6 = score6;
    }

    public Integer getScore7() {
        return score7;
    }

    public void setScore7(Integer score7) {
        this.score7 = score7;
    }

    public Integer getScore8() {
        return score8;
    }

    public void setScore8(Integer score8) {
        this.score8 = score8;
    }

    public Integer getScore9() {
        return score9;
    }

    public void setScore9(Integer score9) {
        this.score9 = score9;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }
}