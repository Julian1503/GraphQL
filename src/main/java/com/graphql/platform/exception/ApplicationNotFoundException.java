package com.graphql.platform.exception;

import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.language.SourceLocation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationNotFoundException extends RuntimeException implements GraphQLError {

  private Map<String, Object> extensions = new HashMap<>();

  public ApplicationNotFoundException(String message, Long appId) {
    super(message);
    extensions.put("appId", appId);
  }

  @Override
  public List<SourceLocation> getLocations() {
    return null;
  }

  @Override
  public ErrorClassification getErrorType() {
    return null;
  }
}
