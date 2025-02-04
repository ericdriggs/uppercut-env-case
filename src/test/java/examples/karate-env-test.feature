Feature: test karate env

  #fails when run using uppercut
  #match failed: EQUALS
  #$ | not equal (STRING:STRING)
  #'DEV'
  #'dev'
  Scenario: when not setting karate.env should retain case from karate-config.js
    * match env == 'dev'

  #always passes
  Scenario: manually setting karate.env should retain case
    * def env = 'dev'
    * match   env == 'dev'
  