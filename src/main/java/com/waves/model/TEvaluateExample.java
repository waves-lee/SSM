package com.waves.model;

import java.util.ArrayList;
import java.util.List;

public class TEvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TEvaluateExample() {
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

        public Criteria andEvaluatedIdIsNull() {
            addCriterion("EVALUATED_ID is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIdIsNotNull() {
            addCriterion("EVALUATED_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIdEqualTo(String value) {
            addCriterion("EVALUATED_ID =", value, "evaluatedId");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIdNotEqualTo(String value) {
            addCriterion("EVALUATED_ID <>", value, "evaluatedId");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIdGreaterThan(String value) {
            addCriterion("EVALUATED_ID >", value, "evaluatedId");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIdGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATED_ID >=", value, "evaluatedId");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIdLessThan(String value) {
            addCriterion("EVALUATED_ID <", value, "evaluatedId");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIdLessThanOrEqualTo(String value) {
            addCriterion("EVALUATED_ID <=", value, "evaluatedId");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIdLike(String value) {
            addCriterion("EVALUATED_ID like", value, "evaluatedId");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIdNotLike(String value) {
            addCriterion("EVALUATED_ID not like", value, "evaluatedId");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIdIn(List<String> values) {
            addCriterion("EVALUATED_ID in", values, "evaluatedId");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIdNotIn(List<String> values) {
            addCriterion("EVALUATED_ID not in", values, "evaluatedId");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIdBetween(String value1, String value2) {
            addCriterion("EVALUATED_ID between", value1, value2, "evaluatedId");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIdNotBetween(String value1, String value2) {
            addCriterion("EVALUATED_ID not between", value1, value2, "evaluatedId");
            return (Criteria) this;
        }

        public Criteria andAppraiserIdIsNull() {
            addCriterion("APPRAISER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAppraiserIdIsNotNull() {
            addCriterion("APPRAISER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiserIdEqualTo(String value) {
            addCriterion("APPRAISER_ID =", value, "appraiserId");
            return (Criteria) this;
        }

        public Criteria andAppraiserIdNotEqualTo(String value) {
            addCriterion("APPRAISER_ID <>", value, "appraiserId");
            return (Criteria) this;
        }

        public Criteria andAppraiserIdGreaterThan(String value) {
            addCriterion("APPRAISER_ID >", value, "appraiserId");
            return (Criteria) this;
        }

        public Criteria andAppraiserIdGreaterThanOrEqualTo(String value) {
            addCriterion("APPRAISER_ID >=", value, "appraiserId");
            return (Criteria) this;
        }

        public Criteria andAppraiserIdLessThan(String value) {
            addCriterion("APPRAISER_ID <", value, "appraiserId");
            return (Criteria) this;
        }

        public Criteria andAppraiserIdLessThanOrEqualTo(String value) {
            addCriterion("APPRAISER_ID <=", value, "appraiserId");
            return (Criteria) this;
        }

        public Criteria andAppraiserIdLike(String value) {
            addCriterion("APPRAISER_ID like", value, "appraiserId");
            return (Criteria) this;
        }

        public Criteria andAppraiserIdNotLike(String value) {
            addCriterion("APPRAISER_ID not like", value, "appraiserId");
            return (Criteria) this;
        }

        public Criteria andAppraiserIdIn(List<String> values) {
            addCriterion("APPRAISER_ID in", values, "appraiserId");
            return (Criteria) this;
        }

        public Criteria andAppraiserIdNotIn(List<String> values) {
            addCriterion("APPRAISER_ID not in", values, "appraiserId");
            return (Criteria) this;
        }

        public Criteria andAppraiserIdBetween(String value1, String value2) {
            addCriterion("APPRAISER_ID between", value1, value2, "appraiserId");
            return (Criteria) this;
        }

        public Criteria andAppraiserIdNotBetween(String value1, String value2) {
            addCriterion("APPRAISER_ID not between", value1, value2, "appraiserId");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIsNull() {
            addCriterion("EVALUATED is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIsNotNull() {
            addCriterion("EVALUATED is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatedEqualTo(String value) {
            addCriterion("EVALUATED =", value, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedNotEqualTo(String value) {
            addCriterion("EVALUATED <>", value, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedGreaterThan(String value) {
            addCriterion("EVALUATED >", value, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATED >=", value, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedLessThan(String value) {
            addCriterion("EVALUATED <", value, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedLessThanOrEqualTo(String value) {
            addCriterion("EVALUATED <=", value, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedLike(String value) {
            addCriterion("EVALUATED like", value, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedNotLike(String value) {
            addCriterion("EVALUATED not like", value, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedIn(List<String> values) {
            addCriterion("EVALUATED in", values, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedNotIn(List<String> values) {
            addCriterion("EVALUATED not in", values, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedBetween(String value1, String value2) {
            addCriterion("EVALUATED between", value1, value2, "evaluated");
            return (Criteria) this;
        }

        public Criteria andEvaluatedNotBetween(String value1, String value2) {
            addCriterion("EVALUATED not between", value1, value2, "evaluated");
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

        public Criteria andAppraiserIsNull() {
            addCriterion("APPRAISER is null");
            return (Criteria) this;
        }

        public Criteria andAppraiserIsNotNull() {
            addCriterion("APPRAISER is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiserEqualTo(String value) {
            addCriterion("APPRAISER =", value, "appraiser");
            return (Criteria) this;
        }

        public Criteria andAppraiserNotEqualTo(String value) {
            addCriterion("APPRAISER <>", value, "appraiser");
            return (Criteria) this;
        }

        public Criteria andAppraiserGreaterThan(String value) {
            addCriterion("APPRAISER >", value, "appraiser");
            return (Criteria) this;
        }

        public Criteria andAppraiserGreaterThanOrEqualTo(String value) {
            addCriterion("APPRAISER >=", value, "appraiser");
            return (Criteria) this;
        }

        public Criteria andAppraiserLessThan(String value) {
            addCriterion("APPRAISER <", value, "appraiser");
            return (Criteria) this;
        }

        public Criteria andAppraiserLessThanOrEqualTo(String value) {
            addCriterion("APPRAISER <=", value, "appraiser");
            return (Criteria) this;
        }

        public Criteria andAppraiserLike(String value) {
            addCriterion("APPRAISER like", value, "appraiser");
            return (Criteria) this;
        }

        public Criteria andAppraiserNotLike(String value) {
            addCriterion("APPRAISER not like", value, "appraiser");
            return (Criteria) this;
        }

        public Criteria andAppraiserIn(List<String> values) {
            addCriterion("APPRAISER in", values, "appraiser");
            return (Criteria) this;
        }

        public Criteria andAppraiserNotIn(List<String> values) {
            addCriterion("APPRAISER not in", values, "appraiser");
            return (Criteria) this;
        }

        public Criteria andAppraiserBetween(String value1, String value2) {
            addCriterion("APPRAISER between", value1, value2, "appraiser");
            return (Criteria) this;
        }

        public Criteria andAppraiserNotBetween(String value1, String value2) {
            addCriterion("APPRAISER not between", value1, value2, "appraiser");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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

        public Criteria andScore1IsNull() {
            addCriterion("SCORE_1 is null");
            return (Criteria) this;
        }

        public Criteria andScore1IsNotNull() {
            addCriterion("SCORE_1 is not null");
            return (Criteria) this;
        }

        public Criteria andScore1EqualTo(Integer value) {
            addCriterion("SCORE_1 =", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotEqualTo(Integer value) {
            addCriterion("SCORE_1 <>", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1GreaterThan(Integer value) {
            addCriterion("SCORE_1 >", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE_1 >=", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1LessThan(Integer value) {
            addCriterion("SCORE_1 <", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE_1 <=", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1In(List<Integer> values) {
            addCriterion("SCORE_1 in", values, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotIn(List<Integer> values) {
            addCriterion("SCORE_1 not in", values, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1Between(Integer value1, Integer value2) {
            addCriterion("SCORE_1 between", value1, value2, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE_1 not between", value1, value2, "score1");
            return (Criteria) this;
        }

        public Criteria andScore2IsNull() {
            addCriterion("SCORE_2 is null");
            return (Criteria) this;
        }

        public Criteria andScore2IsNotNull() {
            addCriterion("SCORE_2 is not null");
            return (Criteria) this;
        }

        public Criteria andScore2EqualTo(Integer value) {
            addCriterion("SCORE_2 =", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotEqualTo(Integer value) {
            addCriterion("SCORE_2 <>", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2GreaterThan(Integer value) {
            addCriterion("SCORE_2 >", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE_2 >=", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2LessThan(Integer value) {
            addCriterion("SCORE_2 <", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE_2 <=", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2In(List<Integer> values) {
            addCriterion("SCORE_2 in", values, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotIn(List<Integer> values) {
            addCriterion("SCORE_2 not in", values, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2Between(Integer value1, Integer value2) {
            addCriterion("SCORE_2 between", value1, value2, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE_2 not between", value1, value2, "score2");
            return (Criteria) this;
        }

        public Criteria andScore3IsNull() {
            addCriterion("SCORE_3 is null");
            return (Criteria) this;
        }

        public Criteria andScore3IsNotNull() {
            addCriterion("SCORE_3 is not null");
            return (Criteria) this;
        }

        public Criteria andScore3EqualTo(Integer value) {
            addCriterion("SCORE_3 =", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotEqualTo(Integer value) {
            addCriterion("SCORE_3 <>", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3GreaterThan(Integer value) {
            addCriterion("SCORE_3 >", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE_3 >=", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3LessThan(Integer value) {
            addCriterion("SCORE_3 <", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE_3 <=", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3In(List<Integer> values) {
            addCriterion("SCORE_3 in", values, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotIn(List<Integer> values) {
            addCriterion("SCORE_3 not in", values, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3Between(Integer value1, Integer value2) {
            addCriterion("SCORE_3 between", value1, value2, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE_3 not between", value1, value2, "score3");
            return (Criteria) this;
        }

        public Criteria andScore4IsNull() {
            addCriterion("SCORE_4 is null");
            return (Criteria) this;
        }

        public Criteria andScore4IsNotNull() {
            addCriterion("SCORE_4 is not null");
            return (Criteria) this;
        }

        public Criteria andScore4EqualTo(Integer value) {
            addCriterion("SCORE_4 =", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotEqualTo(Integer value) {
            addCriterion("SCORE_4 <>", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4GreaterThan(Integer value) {
            addCriterion("SCORE_4 >", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE_4 >=", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4LessThan(Integer value) {
            addCriterion("SCORE_4 <", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE_4 <=", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4In(List<Integer> values) {
            addCriterion("SCORE_4 in", values, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotIn(List<Integer> values) {
            addCriterion("SCORE_4 not in", values, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4Between(Integer value1, Integer value2) {
            addCriterion("SCORE_4 between", value1, value2, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE_4 not between", value1, value2, "score4");
            return (Criteria) this;
        }

        public Criteria andScore5IsNull() {
            addCriterion("SCORE_5 is null");
            return (Criteria) this;
        }

        public Criteria andScore5IsNotNull() {
            addCriterion("SCORE_5 is not null");
            return (Criteria) this;
        }

        public Criteria andScore5EqualTo(Integer value) {
            addCriterion("SCORE_5 =", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotEqualTo(Integer value) {
            addCriterion("SCORE_5 <>", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5GreaterThan(Integer value) {
            addCriterion("SCORE_5 >", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE_5 >=", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5LessThan(Integer value) {
            addCriterion("SCORE_5 <", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE_5 <=", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5In(List<Integer> values) {
            addCriterion("SCORE_5 in", values, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotIn(List<Integer> values) {
            addCriterion("SCORE_5 not in", values, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5Between(Integer value1, Integer value2) {
            addCriterion("SCORE_5 between", value1, value2, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE_5 not between", value1, value2, "score5");
            return (Criteria) this;
        }

        public Criteria andScore6IsNull() {
            addCriterion("SCORE_6 is null");
            return (Criteria) this;
        }

        public Criteria andScore6IsNotNull() {
            addCriterion("SCORE_6 is not null");
            return (Criteria) this;
        }

        public Criteria andScore6EqualTo(Integer value) {
            addCriterion("SCORE_6 =", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotEqualTo(Integer value) {
            addCriterion("SCORE_6 <>", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6GreaterThan(Integer value) {
            addCriterion("SCORE_6 >", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE_6 >=", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6LessThan(Integer value) {
            addCriterion("SCORE_6 <", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE_6 <=", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6In(List<Integer> values) {
            addCriterion("SCORE_6 in", values, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotIn(List<Integer> values) {
            addCriterion("SCORE_6 not in", values, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6Between(Integer value1, Integer value2) {
            addCriterion("SCORE_6 between", value1, value2, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE_6 not between", value1, value2, "score6");
            return (Criteria) this;
        }

        public Criteria andScore7IsNull() {
            addCriterion("SCORE_7 is null");
            return (Criteria) this;
        }

        public Criteria andScore7IsNotNull() {
            addCriterion("SCORE_7 is not null");
            return (Criteria) this;
        }

        public Criteria andScore7EqualTo(Integer value) {
            addCriterion("SCORE_7 =", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7NotEqualTo(Integer value) {
            addCriterion("SCORE_7 <>", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7GreaterThan(Integer value) {
            addCriterion("SCORE_7 >", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE_7 >=", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7LessThan(Integer value) {
            addCriterion("SCORE_7 <", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE_7 <=", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7In(List<Integer> values) {
            addCriterion("SCORE_7 in", values, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7NotIn(List<Integer> values) {
            addCriterion("SCORE_7 not in", values, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7Between(Integer value1, Integer value2) {
            addCriterion("SCORE_7 between", value1, value2, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE_7 not between", value1, value2, "score7");
            return (Criteria) this;
        }

        public Criteria andScore8IsNull() {
            addCriterion("SCORE_8 is null");
            return (Criteria) this;
        }

        public Criteria andScore8IsNotNull() {
            addCriterion("SCORE_8 is not null");
            return (Criteria) this;
        }

        public Criteria andScore8EqualTo(Integer value) {
            addCriterion("SCORE_8 =", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8NotEqualTo(Integer value) {
            addCriterion("SCORE_8 <>", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8GreaterThan(Integer value) {
            addCriterion("SCORE_8 >", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE_8 >=", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8LessThan(Integer value) {
            addCriterion("SCORE_8 <", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE_8 <=", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8In(List<Integer> values) {
            addCriterion("SCORE_8 in", values, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8NotIn(List<Integer> values) {
            addCriterion("SCORE_8 not in", values, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8Between(Integer value1, Integer value2) {
            addCriterion("SCORE_8 between", value1, value2, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE_8 not between", value1, value2, "score8");
            return (Criteria) this;
        }

        public Criteria andScore9IsNull() {
            addCriterion("SCORE_9 is null");
            return (Criteria) this;
        }

        public Criteria andScore9IsNotNull() {
            addCriterion("SCORE_9 is not null");
            return (Criteria) this;
        }

        public Criteria andScore9EqualTo(Integer value) {
            addCriterion("SCORE_9 =", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9NotEqualTo(Integer value) {
            addCriterion("SCORE_9 <>", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9GreaterThan(Integer value) {
            addCriterion("SCORE_9 >", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9GreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE_9 >=", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9LessThan(Integer value) {
            addCriterion("SCORE_9 <", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9LessThanOrEqualTo(Integer value) {
            addCriterion("SCORE_9 <=", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9In(List<Integer> values) {
            addCriterion("SCORE_9 in", values, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9NotIn(List<Integer> values) {
            addCriterion("SCORE_9 not in", values, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9Between(Integer value1, Integer value2) {
            addCriterion("SCORE_9 between", value1, value2, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9NotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE_9 not between", value1, value2, "score9");
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

        public Criteria andSumEqualTo(Integer value) {
            addCriterion("SUM =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(Integer value) {
            addCriterion("SUM <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(Integer value) {
            addCriterion("SUM >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUM >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(Integer value) {
            addCriterion("SUM <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(Integer value) {
            addCriterion("SUM <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<Integer> values) {
            addCriterion("SUM in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<Integer> values) {
            addCriterion("SUM not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(Integer value1, Integer value2) {
            addCriterion("SUM between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(Integer value1, Integer value2) {
            addCriterion("SUM not between", value1, value2, "sum");
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