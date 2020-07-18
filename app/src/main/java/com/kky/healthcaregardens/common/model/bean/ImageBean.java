package com.kky.healthcaregardens.common.model.bean;


import java.util.List;

/**
 *
 * 瀑布流图片用
 *
 * 2020/05/07
 */
public class ImageBean {
    private boolean error;
    private List<Result> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public static class Result{
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}