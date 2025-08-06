package com.atipera.model;

import lombok.Data;
import java.util.List;
public class RepositoryInfo {
    private String name;
    private String ownerLogin;
    private boolean fork;
    private List<BranchInfo> branches;
}
