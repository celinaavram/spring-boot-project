
package com.springbootbooksApp.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "text",
    "image"
})
public class ReadingModes {

    @JsonProperty("text")
    private Boolean text;
    @JsonProperty("image")
    private Boolean image;

    @JsonProperty("text")
    public Boolean getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(Boolean text) {
        this.text = text;
    }

    @JsonProperty("image")
    public Boolean getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Boolean image) {
        this.image = image;
    }

}
