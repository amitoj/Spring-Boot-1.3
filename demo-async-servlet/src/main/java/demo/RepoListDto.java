package demo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RepoListDto {

    @JsonProperty("query")
    private final String query;

    @JsonProperty("nbr_of_repositories")
    private final int nbrOfRepositories;

    @JsonProperty("repositories")
    private final  List<RepoDto> repositories;

    public RepoListDto(String query, int nbrOfRepositories, List<RepoDto> repositories) {
        this.query = query;
        this.nbrOfRepositories = nbrOfRepositories;
        this.repositories = repositories;
    }
}