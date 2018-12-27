package app.meetup.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListNewsAnswersResponse {
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("response")
    @Expose
    private ResponseListNews response;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ResponseListNews getResponse() {
        return response;
    }

    public void setResponse(ResponseListNews response) {
        this.response = response;
    }
}
