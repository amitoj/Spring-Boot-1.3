package demo;

import java.net.URL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
class GitHubItem {
	@JsonProperty("full_name")
	private String fullName;

	@JsonProperty("html_url")
	private URL url;

	@JsonProperty("description")
	private String description;

	@JsonProperty("owner")
	private GitHubOwner owner;

	String fullName() {
		return fullName;
	}

	URL getUrl() {
		return url;
	}

	String description() {
		return description;
	}

	GitHubOwner owner() {
		return owner;
	}
}
