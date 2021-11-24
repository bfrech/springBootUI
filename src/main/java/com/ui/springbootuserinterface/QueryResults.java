package com.ui.springbootuserinterface;
import java.util.ArrayList;
import java.util.List;

public class QueryResults {

    private List<Result> queryResults;
    private long executionTime;

    public QueryResults(){
        queryResults = new ArrayList<>();
        executionTime = 0;
    }

    public void setQueryResults(List<Result> queryResults){
        this.queryResults = queryResults;
    }

    public List<Result> getQueryResults() {
        return queryResults;
    }

    public long getExecutionTime() {
        return executionTime;
    }

    public void addResult(Result res){
        queryResults.add(res);
    }
}
