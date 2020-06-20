package com.scraperapi;


public class TestClass {
  public static void main(String[] args) {

    ScraperApiClient client = new ScraperApiClient("b2b93816137cae0f4679b5253c3dcfd8");

    client.get("http://useoptic.com")
      .render(true)
      .result();

  }
}
