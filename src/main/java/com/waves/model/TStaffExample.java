package com.waves.model;

import java.util.ArrayList;
import java.util.List;

public class TStaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStaffExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("DATE is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("DATE =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("DATE <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("DATE >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("DATE >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("DATE <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("DATE <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("DATE like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("DATE not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("DATE in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("DATE not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("DATE between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("DATE not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("RANK is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("RANK is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(String value) {
            addCriterion("RANK =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(String value) {
            addCriterion("RANK <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(String value) {
            addCriterion("RANK >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(String value) {
            addCriterion("RANK >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(String value) {
            addCriterion("RANK <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(String value) {
            addCriterion("RANK <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLike(String value) {
            addCriterion("RANK like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotLike(String value) {
            addCriterion("RANK not like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<String> values) {
            addCriterion("RANK in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<String> values) {
            addCriterion("RANK not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(String value1, String value2) {
            addCriterion("RANK between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(String value1, String value2) {
            addCriterion("RANK not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("LEVEL =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("LEVEL <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("LEVEL >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEVEL >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("LEVEL <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("LEVEL <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("LEVEL in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("LEVEL not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andGovernorIsNull() {
            addCriterion("GOVERNOR is null");
            return (Criteria) this;
        }

        public Criteria andGovernorIsNotNull() {
            addCriterion("GOVERNOR is not null");
            return (Criteria) this;
        }

        public Criteria andGovernorEqualTo(String value) {
            addCriterion("GOVERNOR =", value, "governor");
            return (Criteria) this;
        }

        public Criteria andGovernorNotEqualTo(String value) {
            addCriterion("GOVERNOR <>", value, "governor");
            return (Criteria) this;
        }

        public Criteria andGovernorGreaterThan(String value) {
            addCriterion("GOVERNOR >", value, "governor");
            return (Criteria) this;
        }

        public Criteria andGovernorGreaterThanOrEqualTo(String value) {
            addCriterion("GOVERNOR >=", value, "governor");
            return (Criteria) this;
        }

        public Criteria andGovernorLessThan(String value) {
            addCriterion("GOVERNOR <", value, "governor");
            return (Criteria) this;
        }

        public Criteria andGovernorLessThanOrEqualTo(String value) {
            addCriterion("GOVERNOR <=", value, "governor");
            return (Criteria) this;
        }

        public Criteria andGovernorLike(String value) {
            addCriterion("GOVERNOR like", value, "governor");
            return (Criteria) this;
        }

        public Criteria andGovernorNotLike(String value) {
            addCriterion("GOVERNOR not like", value, "governor");
            return (Criteria) this;
        }

        public Criteria andGovernorIn(List<String> values) {
            addCriterion("GOVERNOR in", values, "governor");
            return (Criteria) this;
        }

        public Criteria andGovernorNotIn(List<String> values) {
            addCriterion("GOVERNOR not in", values, "governor");
            return (Criteria) this;
        }

        public Criteria andGovernorBetween(String value1, String value2) {
            addCriterion("GOVERNOR between", value1, value2, "governor");
            return (Criteria) this;
        }

        public Criteria andGovernorNotBetween(String value1, String value2) {
            addCriterion("GOVERNOR not between", value1, value2, "governor");
            return (Criteria) this;
        }

        public Criteria andGovernorIdIsNull() {
            addCriterion("GOVERNOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andGovernorIdIsNotNull() {
            addCriterion("GOVERNOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGovernorIdEqualTo(String value) {
            addCriterion("GOVERNOR_ID =", value, "governorId");
            return (Criteria) this;
        }

        public Criteria andGovernorIdNotEqualTo(String value) {
            addCriterion("GOVERNOR_ID <>", value, "governorId");
            return (Criteria) this;
        }

        public Criteria andGovernorIdGreaterThan(String value) {
            addCriterion("GOVERNOR_ID >", value, "governorId");
            return (Criteria) this;
        }

        public Criteria andGovernorIdGreaterThanOrEqualTo(String value) {
            addCriterion("GOVERNOR_ID >=", value, "governorId");
            return (Criteria) this;
        }

        public Criteria andGovernorIdLessThan(String value) {
            addCriterion("GOVERNOR_ID <", value, "governorId");
            return (Criteria) this;
        }

        public Criteria andGovernorIdLessThanOrEqualTo(String value) {
            addCriterion("GOVERNOR_ID <=", value, "governorId");
            return (Criteria) this;
        }

        public Criteria andGovernorIdLike(String value) {
            addCriterion("GOVERNOR_ID like", value, "governorId");
            return (Criteria) this;
        }

        public Criteria andGovernorIdNotLike(String value) {
            addCriterion("GOVERNOR_ID not like", value, "governorId");
            return (Criteria) this;
        }

        public Criteria andGovernorIdIn(List<String> values) {
            addCriterion("GOVERNOR_ID in", values, "governorId");
            return (Criteria) this;
        }

        public Criteria andGovernorIdNotIn(List<String> values) {
            addCriterion("GOVERNOR_ID not in", values, "governorId");
            return (Criteria) this;
        }

        public Criteria andGovernorIdBetween(String value1, String value2) {
            addCriterion("GOVERNOR_ID between", value1, value2, "governorId");
            return (Criteria) this;
        }

        public Criteria andGovernorIdNotBetween(String value1, String value2) {
            addCriterion("GOVERNOR_ID not between", value1, value2, "governorId");
            return (Criteria) this;
        }

        public Criteria andHeadIsNull() {
            addCriterion("HEAD is null");
            return (Criteria) this;
        }

        public Criteria andHeadIsNotNull() {
            addCriterion("HEAD is not null");
            return (Criteria) this;
        }

        public Criteria andHeadEqualTo(String value) {
            addCriterion("HEAD =", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotEqualTo(String value) {
            addCriterion("HEAD <>", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThan(String value) {
            addCriterion("HEAD >", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThanOrEqualTo(String value) {
            addCriterion("HEAD >=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThan(String value) {
            addCriterion("HEAD <", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThanOrEqualTo(String value) {
            addCriterion("HEAD <=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLike(String value) {
            addCriterion("HEAD like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotLike(String value) {
            addCriterion("HEAD not like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadIn(List<String> values) {
            addCriterion("HEAD in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotIn(List<String> values) {
            addCriterion("HEAD not in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadBetween(String value1, String value2) {
            addCriterion("HEAD between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotBetween(String value1, String value2) {
            addCriterion("HEAD not between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andHeadIdIsNull() {
            addCriterion("HEAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andHeadIdIsNotNull() {
            addCriterion("HEAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHeadIdEqualTo(String value) {
            addCriterion("HEAD_ID =", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdNotEqualTo(String value) {
            addCriterion("HEAD_ID <>", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdGreaterThan(String value) {
            addCriterion("HEAD_ID >", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdGreaterThanOrEqualTo(String value) {
            addCriterion("HEAD_ID >=", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdLessThan(String value) {
            addCriterion("HEAD_ID <", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdLessThanOrEqualTo(String value) {
            addCriterion("HEAD_ID <=", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdLike(String value) {
            addCriterion("HEAD_ID like", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdNotLike(String value) {
            addCriterion("HEAD_ID not like", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdIn(List<String> values) {
            addCriterion("HEAD_ID in", values, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdNotIn(List<String> values) {
            addCriterion("HEAD_ID not in", values, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdBetween(String value1, String value2) {
            addCriterion("HEAD_ID between", value1, value2, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdNotBetween(String value1, String value2) {
            addCriterion("HEAD_ID not between", value1, value2, "headId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIsNull() {
            addCriterion("SUPERIOR is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorIsNotNull() {
            addCriterion("SUPERIOR is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorEqualTo(String value) {
            addCriterion("SUPERIOR =", value, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorNotEqualTo(String value) {
            addCriterion("SUPERIOR <>", value, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorGreaterThan(String value) {
            addCriterion("SUPERIOR >", value, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorGreaterThanOrEqualTo(String value) {
            addCriterion("SUPERIOR >=", value, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorLessThan(String value) {
            addCriterion("SUPERIOR <", value, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorLessThanOrEqualTo(String value) {
            addCriterion("SUPERIOR <=", value, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorLike(String value) {
            addCriterion("SUPERIOR like", value, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorNotLike(String value) {
            addCriterion("SUPERIOR not like", value, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorIn(List<String> values) {
            addCriterion("SUPERIOR in", values, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorNotIn(List<String> values) {
            addCriterion("SUPERIOR not in", values, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorBetween(String value1, String value2) {
            addCriterion("SUPERIOR between", value1, value2, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorNotBetween(String value1, String value2) {
            addCriterion("SUPERIOR not between", value1, value2, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdIsNull() {
            addCriterion("SUPERIOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdIsNotNull() {
            addCriterion("SUPERIOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdEqualTo(String value) {
            addCriterion("SUPERIOR_ID =", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdNotEqualTo(String value) {
            addCriterion("SUPERIOR_ID <>", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdGreaterThan(String value) {
            addCriterion("SUPERIOR_ID >", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPERIOR_ID >=", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdLessThan(String value) {
            addCriterion("SUPERIOR_ID <", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdLessThanOrEqualTo(String value) {
            addCriterion("SUPERIOR_ID <=", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdLike(String value) {
            addCriterion("SUPERIOR_ID like", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdNotLike(String value) {
            addCriterion("SUPERIOR_ID not like", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdIn(List<String> values) {
            addCriterion("SUPERIOR_ID in", values, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdNotIn(List<String> values) {
            addCriterion("SUPERIOR_ID not in", values, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdBetween(String value1, String value2) {
            addCriterion("SUPERIOR_ID between", value1, value2, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdNotBetween(String value1, String value2) {
            addCriterion("SUPERIOR_ID not between", value1, value2, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSumIsNull() {
            addCriterion("SUM is null");
            return (Criteria) this;
        }

        public Criteria andSumIsNotNull() {
            addCriterion("SUM is not null");
            return (Criteria) this;
        }

        public Criteria andSumEqualTo(Double value) {
            addCriterion("SUM =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(Double value) {
            addCriterion("SUM <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(Double value) {
            addCriterion("SUM >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(Double value) {
            addCriterion("SUM >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(Double value) {
            addCriterion("SUM <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(Double value) {
            addCriterion("SUM <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<Double> values) {
            addCriterion("SUM in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<Double> values) {
            addCriterion("SUM not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(Double value1, Double value2) {
            addCriterion("SUM between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(Double value1, Double value2) {
            addCriterion("SUM not between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andDeviationIsNull() {
            addCriterion("DEVIATION is null");
            return (Criteria) this;
        }

        public Criteria andDeviationIsNotNull() {
            addCriterion("DEVIATION is not null");
            return (Criteria) this;
        }

        public Criteria andDeviationEqualTo(Double value) {
            addCriterion("DEVIATION =", value, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationNotEqualTo(Double value) {
            addCriterion("DEVIATION <>", value, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationGreaterThan(Double value) {
            addCriterion("DEVIATION >", value, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationGreaterThanOrEqualTo(Double value) {
            addCriterion("DEVIATION >=", value, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationLessThan(Double value) {
            addCriterion("DEVIATION <", value, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationLessThanOrEqualTo(Double value) {
            addCriterion("DEVIATION <=", value, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationIn(List<Double> values) {
            addCriterion("DEVIATION in", values, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationNotIn(List<Double> values) {
            addCriterion("DEVIATION not in", values, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationBetween(Double value1, Double value2) {
            addCriterion("DEVIATION between", value1, value2, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationNotBetween(Double value1, Double value2) {
            addCriterion("DEVIATION not between", value1, value2, "deviation");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}