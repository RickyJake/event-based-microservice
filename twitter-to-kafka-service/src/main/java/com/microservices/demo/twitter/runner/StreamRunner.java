package com.microservices.demo.twitter.runner;

import twitter4j.TwitterException;

public interface StreamRunner {
    void start() throws TwitterException;
}
