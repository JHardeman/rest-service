package com.example.restservice;

public class Greeting {

    /*
    The id field is our unique identifier for this greeting
    "content" will be the textual representation of the greeting
     */

    private final long id;
    private final String content;

    /*
    When our endpiint is hit from an outside source, a JSON object will be send back.
    JSON uses key value pairs, in this case it will be an id and content
     */
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
