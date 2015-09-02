package demo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
class GitHubItems {

    @JsonProperty("total_count")
    private int totalCount;

    @JsonProperty("items")
    private List<GitHubItem> items;

    int totalCount() {
        return totalCount;
    }

    List<GitHubItem> items() {
        return items;
    }
}