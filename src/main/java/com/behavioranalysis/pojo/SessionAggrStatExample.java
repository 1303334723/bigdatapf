package com.behavioranalysis.pojo;

import java.util.ArrayList;
import java.util.List;

public class SessionAggrStatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SessionAggrStatExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andSessionCountIsNull() {
            addCriterion("session_count is null");
            return (Criteria) this;
        }

        public Criteria andSessionCountIsNotNull() {
            addCriterion("session_count is not null");
            return (Criteria) this;
        }

        public Criteria andSessionCountEqualTo(Integer value) {
            addCriterion("session_count =", value, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountNotEqualTo(Integer value) {
            addCriterion("session_count <>", value, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountGreaterThan(Integer value) {
            addCriterion("session_count >", value, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("session_count >=", value, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountLessThan(Integer value) {
            addCriterion("session_count <", value, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountLessThanOrEqualTo(Integer value) {
            addCriterion("session_count <=", value, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountIn(List<Integer> values) {
            addCriterion("session_count in", values, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountNotIn(List<Integer> values) {
            addCriterion("session_count not in", values, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountBetween(Integer value1, Integer value2) {
            addCriterion("session_count between", value1, value2, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountNotBetween(Integer value1, Integer value2) {
            addCriterion("session_count not between", value1, value2, "sessionCount");
            return (Criteria) this;
        }

        public Criteria and1s3sIsNull() {
            addCriterion("1s_3s is null");
            return (Criteria) this;
        }

        public Criteria and1s3sIsNotNull() {
            addCriterion("1s_3s is not null");
            return (Criteria) this;
        }

        public Criteria and1s3sEqualTo(Double value) {
            addCriterion("1s_3s =", value, "1s3s");
            return (Criteria) this;
        }

        public Criteria and1s3sNotEqualTo(Double value) {
            addCriterion("1s_3s <>", value, "1s3s");
            return (Criteria) this;
        }

        public Criteria and1s3sGreaterThan(Double value) {
            addCriterion("1s_3s >", value, "1s3s");
            return (Criteria) this;
        }

        public Criteria and1s3sGreaterThanOrEqualTo(Double value) {
            addCriterion("1s_3s >=", value, "1s3s");
            return (Criteria) this;
        }

        public Criteria and1s3sLessThan(Double value) {
            addCriterion("1s_3s <", value, "1s3s");
            return (Criteria) this;
        }

        public Criteria and1s3sLessThanOrEqualTo(Double value) {
            addCriterion("1s_3s <=", value, "1s3s");
            return (Criteria) this;
        }

        public Criteria and1s3sIn(List<Double> values) {
            addCriterion("1s_3s in", values, "1s3s");
            return (Criteria) this;
        }

        public Criteria and1s3sNotIn(List<Double> values) {
            addCriterion("1s_3s not in", values, "1s3s");
            return (Criteria) this;
        }

        public Criteria and1s3sBetween(Double value1, Double value2) {
            addCriterion("1s_3s between", value1, value2, "1s3s");
            return (Criteria) this;
        }

        public Criteria and1s3sNotBetween(Double value1, Double value2) {
            addCriterion("1s_3s not between", value1, value2, "1s3s");
            return (Criteria) this;
        }

        public Criteria and4s6sIsNull() {
            addCriterion("4s_6s is null");
            return (Criteria) this;
        }

        public Criteria and4s6sIsNotNull() {
            addCriterion("4s_6s is not null");
            return (Criteria) this;
        }

        public Criteria and4s6sEqualTo(Double value) {
            addCriterion("4s_6s =", value, "4s6s");
            return (Criteria) this;
        }

        public Criteria and4s6sNotEqualTo(Double value) {
            addCriterion("4s_6s <>", value, "4s6s");
            return (Criteria) this;
        }

        public Criteria and4s6sGreaterThan(Double value) {
            addCriterion("4s_6s >", value, "4s6s");
            return (Criteria) this;
        }

        public Criteria and4s6sGreaterThanOrEqualTo(Double value) {
            addCriterion("4s_6s >=", value, "4s6s");
            return (Criteria) this;
        }

        public Criteria and4s6sLessThan(Double value) {
            addCriterion("4s_6s <", value, "4s6s");
            return (Criteria) this;
        }

        public Criteria and4s6sLessThanOrEqualTo(Double value) {
            addCriterion("4s_6s <=", value, "4s6s");
            return (Criteria) this;
        }

        public Criteria and4s6sIn(List<Double> values) {
            addCriterion("4s_6s in", values, "4s6s");
            return (Criteria) this;
        }

        public Criteria and4s6sNotIn(List<Double> values) {
            addCriterion("4s_6s not in", values, "4s6s");
            return (Criteria) this;
        }

        public Criteria and4s6sBetween(Double value1, Double value2) {
            addCriterion("4s_6s between", value1, value2, "4s6s");
            return (Criteria) this;
        }

        public Criteria and4s6sNotBetween(Double value1, Double value2) {
            addCriterion("4s_6s not between", value1, value2, "4s6s");
            return (Criteria) this;
        }

        public Criteria and7s9sIsNull() {
            addCriterion("7s_9s is null");
            return (Criteria) this;
        }

        public Criteria and7s9sIsNotNull() {
            addCriterion("7s_9s is not null");
            return (Criteria) this;
        }

        public Criteria and7s9sEqualTo(Double value) {
            addCriterion("7s_9s =", value, "7s9s");
            return (Criteria) this;
        }

        public Criteria and7s9sNotEqualTo(Double value) {
            addCriterion("7s_9s <>", value, "7s9s");
            return (Criteria) this;
        }

        public Criteria and7s9sGreaterThan(Double value) {
            addCriterion("7s_9s >", value, "7s9s");
            return (Criteria) this;
        }

        public Criteria and7s9sGreaterThanOrEqualTo(Double value) {
            addCriterion("7s_9s >=", value, "7s9s");
            return (Criteria) this;
        }

        public Criteria and7s9sLessThan(Double value) {
            addCriterion("7s_9s <", value, "7s9s");
            return (Criteria) this;
        }

        public Criteria and7s9sLessThanOrEqualTo(Double value) {
            addCriterion("7s_9s <=", value, "7s9s");
            return (Criteria) this;
        }

        public Criteria and7s9sIn(List<Double> values) {
            addCriterion("7s_9s in", values, "7s9s");
            return (Criteria) this;
        }

        public Criteria and7s9sNotIn(List<Double> values) {
            addCriterion("7s_9s not in", values, "7s9s");
            return (Criteria) this;
        }

        public Criteria and7s9sBetween(Double value1, Double value2) {
            addCriterion("7s_9s between", value1, value2, "7s9s");
            return (Criteria) this;
        }

        public Criteria and7s9sNotBetween(Double value1, Double value2) {
            addCriterion("7s_9s not between", value1, value2, "7s9s");
            return (Criteria) this;
        }

        public Criteria and10s30sIsNull() {
            addCriterion("10s_30s is null");
            return (Criteria) this;
        }

        public Criteria and10s30sIsNotNull() {
            addCriterion("10s_30s is not null");
            return (Criteria) this;
        }

        public Criteria and10s30sEqualTo(Double value) {
            addCriterion("10s_30s =", value, "10s30s");
            return (Criteria) this;
        }

        public Criteria and10s30sNotEqualTo(Double value) {
            addCriterion("10s_30s <>", value, "10s30s");
            return (Criteria) this;
        }

        public Criteria and10s30sGreaterThan(Double value) {
            addCriterion("10s_30s >", value, "10s30s");
            return (Criteria) this;
        }

        public Criteria and10s30sGreaterThanOrEqualTo(Double value) {
            addCriterion("10s_30s >=", value, "10s30s");
            return (Criteria) this;
        }

        public Criteria and10s30sLessThan(Double value) {
            addCriterion("10s_30s <", value, "10s30s");
            return (Criteria) this;
        }

        public Criteria and10s30sLessThanOrEqualTo(Double value) {
            addCriterion("10s_30s <=", value, "10s30s");
            return (Criteria) this;
        }

        public Criteria and10s30sIn(List<Double> values) {
            addCriterion("10s_30s in", values, "10s30s");
            return (Criteria) this;
        }

        public Criteria and10s30sNotIn(List<Double> values) {
            addCriterion("10s_30s not in", values, "10s30s");
            return (Criteria) this;
        }

        public Criteria and10s30sBetween(Double value1, Double value2) {
            addCriterion("10s_30s between", value1, value2, "10s30s");
            return (Criteria) this;
        }

        public Criteria and10s30sNotBetween(Double value1, Double value2) {
            addCriterion("10s_30s not between", value1, value2, "10s30s");
            return (Criteria) this;
        }

        public Criteria and30s60sIsNull() {
            addCriterion("30s_60s is null");
            return (Criteria) this;
        }

        public Criteria and30s60sIsNotNull() {
            addCriterion("30s_60s is not null");
            return (Criteria) this;
        }

        public Criteria and30s60sEqualTo(Double value) {
            addCriterion("30s_60s =", value, "30s60s");
            return (Criteria) this;
        }

        public Criteria and30s60sNotEqualTo(Double value) {
            addCriterion("30s_60s <>", value, "30s60s");
            return (Criteria) this;
        }

        public Criteria and30s60sGreaterThan(Double value) {
            addCriterion("30s_60s >", value, "30s60s");
            return (Criteria) this;
        }

        public Criteria and30s60sGreaterThanOrEqualTo(Double value) {
            addCriterion("30s_60s >=", value, "30s60s");
            return (Criteria) this;
        }

        public Criteria and30s60sLessThan(Double value) {
            addCriterion("30s_60s <", value, "30s60s");
            return (Criteria) this;
        }

        public Criteria and30s60sLessThanOrEqualTo(Double value) {
            addCriterion("30s_60s <=", value, "30s60s");
            return (Criteria) this;
        }

        public Criteria and30s60sIn(List<Double> values) {
            addCriterion("30s_60s in", values, "30s60s");
            return (Criteria) this;
        }

        public Criteria and30s60sNotIn(List<Double> values) {
            addCriterion("30s_60s not in", values, "30s60s");
            return (Criteria) this;
        }

        public Criteria and30s60sBetween(Double value1, Double value2) {
            addCriterion("30s_60s between", value1, value2, "30s60s");
            return (Criteria) this;
        }

        public Criteria and30s60sNotBetween(Double value1, Double value2) {
            addCriterion("30s_60s not between", value1, value2, "30s60s");
            return (Criteria) this;
        }

        public Criteria and1m3mIsNull() {
            addCriterion("1m_3m is null");
            return (Criteria) this;
        }

        public Criteria and1m3mIsNotNull() {
            addCriterion("1m_3m is not null");
            return (Criteria) this;
        }

        public Criteria and1m3mEqualTo(Double value) {
            addCriterion("1m_3m =", value, "1m3m");
            return (Criteria) this;
        }

        public Criteria and1m3mNotEqualTo(Double value) {
            addCriterion("1m_3m <>", value, "1m3m");
            return (Criteria) this;
        }

        public Criteria and1m3mGreaterThan(Double value) {
            addCriterion("1m_3m >", value, "1m3m");
            return (Criteria) this;
        }

        public Criteria and1m3mGreaterThanOrEqualTo(Double value) {
            addCriterion("1m_3m >=", value, "1m3m");
            return (Criteria) this;
        }

        public Criteria and1m3mLessThan(Double value) {
            addCriterion("1m_3m <", value, "1m3m");
            return (Criteria) this;
        }

        public Criteria and1m3mLessThanOrEqualTo(Double value) {
            addCriterion("1m_3m <=", value, "1m3m");
            return (Criteria) this;
        }

        public Criteria and1m3mIn(List<Double> values) {
            addCriterion("1m_3m in", values, "1m3m");
            return (Criteria) this;
        }

        public Criteria and1m3mNotIn(List<Double> values) {
            addCriterion("1m_3m not in", values, "1m3m");
            return (Criteria) this;
        }

        public Criteria and1m3mBetween(Double value1, Double value2) {
            addCriterion("1m_3m between", value1, value2, "1m3m");
            return (Criteria) this;
        }

        public Criteria and1m3mNotBetween(Double value1, Double value2) {
            addCriterion("1m_3m not between", value1, value2, "1m3m");
            return (Criteria) this;
        }

        public Criteria and3m10mIsNull() {
            addCriterion("3m_10m is null");
            return (Criteria) this;
        }

        public Criteria and3m10mIsNotNull() {
            addCriterion("3m_10m is not null");
            return (Criteria) this;
        }

        public Criteria and3m10mEqualTo(Double value) {
            addCriterion("3m_10m =", value, "3m10m");
            return (Criteria) this;
        }

        public Criteria and3m10mNotEqualTo(Double value) {
            addCriterion("3m_10m <>", value, "3m10m");
            return (Criteria) this;
        }

        public Criteria and3m10mGreaterThan(Double value) {
            addCriterion("3m_10m >", value, "3m10m");
            return (Criteria) this;
        }

        public Criteria and3m10mGreaterThanOrEqualTo(Double value) {
            addCriterion("3m_10m >=", value, "3m10m");
            return (Criteria) this;
        }

        public Criteria and3m10mLessThan(Double value) {
            addCriterion("3m_10m <", value, "3m10m");
            return (Criteria) this;
        }

        public Criteria and3m10mLessThanOrEqualTo(Double value) {
            addCriterion("3m_10m <=", value, "3m10m");
            return (Criteria) this;
        }

        public Criteria and3m10mIn(List<Double> values) {
            addCriterion("3m_10m in", values, "3m10m");
            return (Criteria) this;
        }

        public Criteria and3m10mNotIn(List<Double> values) {
            addCriterion("3m_10m not in", values, "3m10m");
            return (Criteria) this;
        }

        public Criteria and3m10mBetween(Double value1, Double value2) {
            addCriterion("3m_10m between", value1, value2, "3m10m");
            return (Criteria) this;
        }

        public Criteria and3m10mNotBetween(Double value1, Double value2) {
            addCriterion("3m_10m not between", value1, value2, "3m10m");
            return (Criteria) this;
        }

        public Criteria and10m30mIsNull() {
            addCriterion("10m_30m is null");
            return (Criteria) this;
        }

        public Criteria and10m30mIsNotNull() {
            addCriterion("10m_30m is not null");
            return (Criteria) this;
        }

        public Criteria and10m30mEqualTo(Double value) {
            addCriterion("10m_30m =", value, "10m30m");
            return (Criteria) this;
        }

        public Criteria and10m30mNotEqualTo(Double value) {
            addCriterion("10m_30m <>", value, "10m30m");
            return (Criteria) this;
        }

        public Criteria and10m30mGreaterThan(Double value) {
            addCriterion("10m_30m >", value, "10m30m");
            return (Criteria) this;
        }

        public Criteria and10m30mGreaterThanOrEqualTo(Double value) {
            addCriterion("10m_30m >=", value, "10m30m");
            return (Criteria) this;
        }

        public Criteria and10m30mLessThan(Double value) {
            addCriterion("10m_30m <", value, "10m30m");
            return (Criteria) this;
        }

        public Criteria and10m30mLessThanOrEqualTo(Double value) {
            addCriterion("10m_30m <=", value, "10m30m");
            return (Criteria) this;
        }

        public Criteria and10m30mIn(List<Double> values) {
            addCriterion("10m_30m in", values, "10m30m");
            return (Criteria) this;
        }

        public Criteria and10m30mNotIn(List<Double> values) {
            addCriterion("10m_30m not in", values, "10m30m");
            return (Criteria) this;
        }

        public Criteria and10m30mBetween(Double value1, Double value2) {
            addCriterion("10m_30m between", value1, value2, "10m30m");
            return (Criteria) this;
        }

        public Criteria and10m30mNotBetween(Double value1, Double value2) {
            addCriterion("10m_30m not between", value1, value2, "10m30m");
            return (Criteria) this;
        }

        public Criteria and30mIsNull() {
            addCriterion("30m is null");
            return (Criteria) this;
        }

        public Criteria and30mIsNotNull() {
            addCriterion("30m is not null");
            return (Criteria) this;
        }

        public Criteria and30mEqualTo(Double value) {
            addCriterion("30m =", value, "30m");
            return (Criteria) this;
        }

        public Criteria and30mNotEqualTo(Double value) {
            addCriterion("30m <>", value, "30m");
            return (Criteria) this;
        }

        public Criteria and30mGreaterThan(Double value) {
            addCriterion("30m >", value, "30m");
            return (Criteria) this;
        }

        public Criteria and30mGreaterThanOrEqualTo(Double value) {
            addCriterion("30m >=", value, "30m");
            return (Criteria) this;
        }

        public Criteria and30mLessThan(Double value) {
            addCriterion("30m <", value, "30m");
            return (Criteria) this;
        }

        public Criteria and30mLessThanOrEqualTo(Double value) {
            addCriterion("30m <=", value, "30m");
            return (Criteria) this;
        }

        public Criteria and30mIn(List<Double> values) {
            addCriterion("30m in", values, "30m");
            return (Criteria) this;
        }

        public Criteria and30mNotIn(List<Double> values) {
            addCriterion("30m not in", values, "30m");
            return (Criteria) this;
        }

        public Criteria and30mBetween(Double value1, Double value2) {
            addCriterion("30m between", value1, value2, "30m");
            return (Criteria) this;
        }

        public Criteria and30mNotBetween(Double value1, Double value2) {
            addCriterion("30m not between", value1, value2, "30m");
            return (Criteria) this;
        }

        public Criteria and13IsNull() {
            addCriterion("1_3 is null");
            return (Criteria) this;
        }

        public Criteria and13IsNotNull() {
            addCriterion("1_3 is not null");
            return (Criteria) this;
        }

        public Criteria and13EqualTo(Double value) {
            addCriterion("1_3 =", value, "13");
            return (Criteria) this;
        }

        public Criteria and13NotEqualTo(Double value) {
            addCriterion("1_3 <>", value, "13");
            return (Criteria) this;
        }

        public Criteria and13GreaterThan(Double value) {
            addCriterion("1_3 >", value, "13");
            return (Criteria) this;
        }

        public Criteria and13GreaterThanOrEqualTo(Double value) {
            addCriterion("1_3 >=", value, "13");
            return (Criteria) this;
        }

        public Criteria and13LessThan(Double value) {
            addCriterion("1_3 <", value, "13");
            return (Criteria) this;
        }

        public Criteria and13LessThanOrEqualTo(Double value) {
            addCriterion("1_3 <=", value, "13");
            return (Criteria) this;
        }

        public Criteria and13In(List<Double> values) {
            addCriterion("1_3 in", values, "13");
            return (Criteria) this;
        }

        public Criteria and13NotIn(List<Double> values) {
            addCriterion("1_3 not in", values, "13");
            return (Criteria) this;
        }

        public Criteria and13Between(Double value1, Double value2) {
            addCriterion("1_3 between", value1, value2, "13");
            return (Criteria) this;
        }

        public Criteria and13NotBetween(Double value1, Double value2) {
            addCriterion("1_3 not between", value1, value2, "13");
            return (Criteria) this;
        }

        public Criteria and46IsNull() {
            addCriterion("4_6 is null");
            return (Criteria) this;
        }

        public Criteria and46IsNotNull() {
            addCriterion("4_6 is not null");
            return (Criteria) this;
        }

        public Criteria and46EqualTo(Double value) {
            addCriterion("4_6 =", value, "46");
            return (Criteria) this;
        }

        public Criteria and46NotEqualTo(Double value) {
            addCriterion("4_6 <>", value, "46");
            return (Criteria) this;
        }

        public Criteria and46GreaterThan(Double value) {
            addCriterion("4_6 >", value, "46");
            return (Criteria) this;
        }

        public Criteria and46GreaterThanOrEqualTo(Double value) {
            addCriterion("4_6 >=", value, "46");
            return (Criteria) this;
        }

        public Criteria and46LessThan(Double value) {
            addCriterion("4_6 <", value, "46");
            return (Criteria) this;
        }

        public Criteria and46LessThanOrEqualTo(Double value) {
            addCriterion("4_6 <=", value, "46");
            return (Criteria) this;
        }

        public Criteria and46In(List<Double> values) {
            addCriterion("4_6 in", values, "46");
            return (Criteria) this;
        }

        public Criteria and46NotIn(List<Double> values) {
            addCriterion("4_6 not in", values, "46");
            return (Criteria) this;
        }

        public Criteria and46Between(Double value1, Double value2) {
            addCriterion("4_6 between", value1, value2, "46");
            return (Criteria) this;
        }

        public Criteria and46NotBetween(Double value1, Double value2) {
            addCriterion("4_6 not between", value1, value2, "46");
            return (Criteria) this;
        }

        public Criteria and79IsNull() {
            addCriterion("7_9 is null");
            return (Criteria) this;
        }

        public Criteria and79IsNotNull() {
            addCriterion("7_9 is not null");
            return (Criteria) this;
        }

        public Criteria and79EqualTo(Double value) {
            addCriterion("7_9 =", value, "79");
            return (Criteria) this;
        }

        public Criteria and79NotEqualTo(Double value) {
            addCriterion("7_9 <>", value, "79");
            return (Criteria) this;
        }

        public Criteria and79GreaterThan(Double value) {
            addCriterion("7_9 >", value, "79");
            return (Criteria) this;
        }

        public Criteria and79GreaterThanOrEqualTo(Double value) {
            addCriterion("7_9 >=", value, "79");
            return (Criteria) this;
        }

        public Criteria and79LessThan(Double value) {
            addCriterion("7_9 <", value, "79");
            return (Criteria) this;
        }

        public Criteria and79LessThanOrEqualTo(Double value) {
            addCriterion("7_9 <=", value, "79");
            return (Criteria) this;
        }

        public Criteria and79In(List<Double> values) {
            addCriterion("7_9 in", values, "79");
            return (Criteria) this;
        }

        public Criteria and79NotIn(List<Double> values) {
            addCriterion("7_9 not in", values, "79");
            return (Criteria) this;
        }

        public Criteria and79Between(Double value1, Double value2) {
            addCriterion("7_9 between", value1, value2, "79");
            return (Criteria) this;
        }

        public Criteria and79NotBetween(Double value1, Double value2) {
            addCriterion("7_9 not between", value1, value2, "79");
            return (Criteria) this;
        }

        public Criteria and1030IsNull() {
            addCriterion("10_30 is null");
            return (Criteria) this;
        }

        public Criteria and1030IsNotNull() {
            addCriterion("10_30 is not null");
            return (Criteria) this;
        }

        public Criteria and1030EqualTo(Double value) {
            addCriterion("10_30 =", value, "1030");
            return (Criteria) this;
        }

        public Criteria and1030NotEqualTo(Double value) {
            addCriterion("10_30 <>", value, "1030");
            return (Criteria) this;
        }

        public Criteria and1030GreaterThan(Double value) {
            addCriterion("10_30 >", value, "1030");
            return (Criteria) this;
        }

        public Criteria and1030GreaterThanOrEqualTo(Double value) {
            addCriterion("10_30 >=", value, "1030");
            return (Criteria) this;
        }

        public Criteria and1030LessThan(Double value) {
            addCriterion("10_30 <", value, "1030");
            return (Criteria) this;
        }

        public Criteria and1030LessThanOrEqualTo(Double value) {
            addCriterion("10_30 <=", value, "1030");
            return (Criteria) this;
        }

        public Criteria and1030In(List<Double> values) {
            addCriterion("10_30 in", values, "1030");
            return (Criteria) this;
        }

        public Criteria and1030NotIn(List<Double> values) {
            addCriterion("10_30 not in", values, "1030");
            return (Criteria) this;
        }

        public Criteria and1030Between(Double value1, Double value2) {
            addCriterion("10_30 between", value1, value2, "1030");
            return (Criteria) this;
        }

        public Criteria and1030NotBetween(Double value1, Double value2) {
            addCriterion("10_30 not between", value1, value2, "1030");
            return (Criteria) this;
        }

        public Criteria and3060IsNull() {
            addCriterion("30_60 is null");
            return (Criteria) this;
        }

        public Criteria and3060IsNotNull() {
            addCriterion("30_60 is not null");
            return (Criteria) this;
        }

        public Criteria and3060EqualTo(Double value) {
            addCriterion("30_60 =", value, "3060");
            return (Criteria) this;
        }

        public Criteria and3060NotEqualTo(Double value) {
            addCriterion("30_60 <>", value, "3060");
            return (Criteria) this;
        }

        public Criteria and3060GreaterThan(Double value) {
            addCriterion("30_60 >", value, "3060");
            return (Criteria) this;
        }

        public Criteria and3060GreaterThanOrEqualTo(Double value) {
            addCriterion("30_60 >=", value, "3060");
            return (Criteria) this;
        }

        public Criteria and3060LessThan(Double value) {
            addCriterion("30_60 <", value, "3060");
            return (Criteria) this;
        }

        public Criteria and3060LessThanOrEqualTo(Double value) {
            addCriterion("30_60 <=", value, "3060");
            return (Criteria) this;
        }

        public Criteria and3060In(List<Double> values) {
            addCriterion("30_60 in", values, "3060");
            return (Criteria) this;
        }

        public Criteria and3060NotIn(List<Double> values) {
            addCriterion("30_60 not in", values, "3060");
            return (Criteria) this;
        }

        public Criteria and3060Between(Double value1, Double value2) {
            addCriterion("30_60 between", value1, value2, "3060");
            return (Criteria) this;
        }

        public Criteria and3060NotBetween(Double value1, Double value2) {
            addCriterion("30_60 not between", value1, value2, "3060");
            return (Criteria) this;
        }

        public Criteria and60IsNull() {
            addCriterion("60 is null");
            return (Criteria) this;
        }

        public Criteria and60IsNotNull() {
            addCriterion("60 is not null");
            return (Criteria) this;
        }

        public Criteria and60EqualTo(Double value) {
            addCriterion("60 =", value, "60");
            return (Criteria) this;
        }

        public Criteria and60NotEqualTo(Double value) {
            addCriterion("60 <>", value, "60");
            return (Criteria) this;
        }

        public Criteria and60GreaterThan(Double value) {
            addCriterion("60 >", value, "60");
            return (Criteria) this;
        }

        public Criteria and60GreaterThanOrEqualTo(Double value) {
            addCriterion("60 >=", value, "60");
            return (Criteria) this;
        }

        public Criteria and60LessThan(Double value) {
            addCriterion("60 <", value, "60");
            return (Criteria) this;
        }

        public Criteria and60LessThanOrEqualTo(Double value) {
            addCriterion("60 <=", value, "60");
            return (Criteria) this;
        }

        public Criteria and60In(List<Double> values) {
            addCriterion("60 in", values, "60");
            return (Criteria) this;
        }

        public Criteria and60NotIn(List<Double> values) {
            addCriterion("60 not in", values, "60");
            return (Criteria) this;
        }

        public Criteria and60Between(Double value1, Double value2) {
            addCriterion("60 between", value1, value2, "60");
            return (Criteria) this;
        }

        public Criteria and60NotBetween(Double value1, Double value2) {
            addCriterion("60 not between", value1, value2, "60");
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