package com.rbinternational.openapi.marketplace.test.navigation;

public enum Section {
    MarketplacePortal("http://localhost:4200/"),

    APICategories("http://localhost:4200/api-categories");

    private final String url;

    Section(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
    }
