/**
 * Client
 * Import from \"ayfuneus\" Function App
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.LoginWithCustomIDResponseData;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class LoginWithCustomIDResponse {
  
  @SerializedName("Code")
  private Integer code = null;
  @SerializedName("Status")
  private String status = null;
  @SerializedName("Data")
  private LoginWithCustomIDResponseData data = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public LoginWithCustomIDResponseData getData() {
    return data;
  }
  public void setData(LoginWithCustomIDResponseData data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginWithCustomIDResponse loginWithCustomIDResponse = (LoginWithCustomIDResponse) o;
    return (this.code == null ? loginWithCustomIDResponse.code == null : this.code.equals(loginWithCustomIDResponse.code)) &&
        (this.status == null ? loginWithCustomIDResponse.status == null : this.status.equals(loginWithCustomIDResponse.status)) &&
        (this.data == null ? loginWithCustomIDResponse.data == null : this.data.equals(loginWithCustomIDResponse.data));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginWithCustomIDResponse {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
