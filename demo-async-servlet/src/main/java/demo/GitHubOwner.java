package demo;

import java.net.URL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
class GitHubOwner {

    @JsonProperty("login")
    private String userName;

    @JsonProperty("html_url")
    private URL url;

    @JsonProperty("avatar_url")
    private URL avatarUrl;

    String userName() {
        return userName;
    }

    URL url() {
        return url;
    }

    URL avatarUrl() {
        return avatarUrl;
    }
}