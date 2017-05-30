
package com.springbootbooksApp.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "containsEpubBubbles",
    "containsImageBubbles"
})
public class PanelizationSummary {

    @JsonProperty("containsEpubBubbles")
    private Boolean containsEpubBubbles;
    @JsonProperty("containsImageBubbles")
    private Boolean containsImageBubbles;

    @JsonProperty("containsEpubBubbles")
    public Boolean getContainsEpubBubbles() {
        return containsEpubBubbles;
    }

    @JsonProperty("containsEpubBubbles")
    public void setContainsEpubBubbles(Boolean containsEpubBubbles) {
        this.containsEpubBubbles = containsEpubBubbles;
    }

    @JsonProperty("containsImageBubbles")
    public Boolean getContainsImageBubbles() {
        return containsImageBubbles;
    }

    @JsonProperty("containsImageBubbles")
    public void setContainsImageBubbles(Boolean containsImageBubbles) {
        this.containsImageBubbles = containsImageBubbles;
    }

}
