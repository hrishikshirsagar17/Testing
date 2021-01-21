package com.spring.rest.request;

import javax.validation.constraints.NotBlank;
import lombok.Data;

public @Data class LoginRequest {
  @NotBlank
  private String username;

  @NotBlank
  private String password;


}

