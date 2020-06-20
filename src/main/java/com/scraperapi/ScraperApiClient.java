package com.scraperapi;

public class ScraperApiClient {

  private String apiToken;

  public ScraperApiClient(String token) {
    this.apiToken = token;
  }

  public ScraperApiRequest get(String url) {
    return new ScraperApiRequest(url, "GET", this.apiToken);
  }

  public ScraperApiRequest post(String url) {
    return new ScraperApiRequest(url, "POST", this.apiToken);
  }

  public ScraperApiRequest put(String url) {
    return new ScraperApiRequest(url, "PUT", this.apiToken);
  }

}


