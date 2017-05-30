package com.springbootbooksApp.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "authors",
    "publishedDate",
    "industryIdentifiers",
    "readingModes",
    "pageCount",
    "printType",
    "categories",
    "maturityRating",
    "allowAnonLogging",
    "contentVersion",
    "language",
    "previewLink",
    "infoLink",
    "canonicalVolumeLink",
    "publisher",
    "description",
    "panelizationSummary",
    "imageLinks",
    "subtitle",
    "averageRating",
    "ratingsCount"
})
public class VolumeInfo {

    @JsonProperty("title")
    private String title;
    @JsonProperty("authors")
    private List<String> authors = null;
    @JsonProperty("publishedDate")
    private String publishedDate;
    @JsonProperty("industryIdentifiers")
    private List<IndustryIdentifier> industryIdentifiers = null;
    @JsonProperty("readingModes")
    private ReadingModes readingModes;
    @JsonProperty("pageCount")
    private Integer pageCount;
    @JsonProperty("printType")
    private String printType;
    @JsonProperty("categories")
    private List<String> categories = null;
    @JsonProperty("maturityRating")
    private String maturityRating;
    @JsonProperty("allowAnonLogging")
    private Boolean allowAnonLogging;
    @JsonProperty("contentVersion")
    private String contentVersion;
    @JsonProperty("language")
    private String language;
    @JsonProperty("previewLink")
    private String previewLink;
    @JsonProperty("infoLink")
    private String infoLink;
    @JsonProperty("canonicalVolumeLink")
    private String canonicalVolumeLink;
    @JsonProperty("publisher")
    private String publisher;
    @JsonProperty("description")
    private String description;
    @JsonProperty("panelizationSummary")
    private PanelizationSummary panelizationSummary;
    @JsonProperty("imageLinks")
    private ImageLinks imageLinks;
    @JsonProperty("subtitle")
    private String subtitle;
    @JsonProperty("averageRating")
    private Double averageRating;
    @JsonProperty("ratingsCount")
    private Integer ratingsCount;

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("authors")
    public List<String> getAuthors() {
        return authors;
    }

    @JsonProperty("authors")
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @JsonProperty("publishedDate")
    public String getPublishedDate() {
        return publishedDate;
    }

    @JsonProperty("publishedDate")
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @JsonProperty("industryIdentifiers")
    public List<IndustryIdentifier> getIndustryIdentifiers() {
        return industryIdentifiers;
    }

    @JsonProperty("industryIdentifiers")
    public void setIndustryIdentifiers(List<IndustryIdentifier> industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
    }

    @JsonProperty("readingModes")
    public ReadingModes getReadingModes() {
        return readingModes;
    }

    @JsonProperty("readingModes")
    public void setReadingModes(ReadingModes readingModes) {
        this.readingModes = readingModes;
    }

    @JsonProperty("pageCount")
    public Integer getPageCount() {
        return pageCount;
    }

    @JsonProperty("pageCount")
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    @JsonProperty("printType")
    public String getPrintType() {
        return printType;
    }

    @JsonProperty("printType")
    public void setPrintType(String printType) {
        this.printType = printType;
    }

    @JsonProperty("categories")
    public List<String> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    @JsonProperty("maturityRating")
    public String getMaturityRating() {
        return maturityRating;
    }

    @JsonProperty("maturityRating")
    public void setMaturityRating(String maturityRating) {
        this.maturityRating = maturityRating;
    }

    @JsonProperty("allowAnonLogging")
    public Boolean getAllowAnonLogging() {
        return allowAnonLogging;
    }

    @JsonProperty("allowAnonLogging")
    public void setAllowAnonLogging(Boolean allowAnonLogging) {
        this.allowAnonLogging = allowAnonLogging;
    }

    @JsonProperty("contentVersion")
    public String getContentVersion() {
        return contentVersion;
    }

    @JsonProperty("contentVersion")
    public void setContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("previewLink")
    public String getPreviewLink() {
        return previewLink;
    }

    @JsonProperty("previewLink")
    public void setPreviewLink(String previewLink) {
        this.previewLink = previewLink;
    }

    @JsonProperty("infoLink")
    public String getInfoLink() {
        return infoLink;
    }

    @JsonProperty("infoLink")
    public void setInfoLink(String infoLink) {
        this.infoLink = infoLink;
    }

    @JsonProperty("canonicalVolumeLink")
    public String getCanonicalVolumeLink() {
        return canonicalVolumeLink;
    }

    @JsonProperty("canonicalVolumeLink")
    public void setCanonicalVolumeLink(String canonicalVolumeLink) {
        this.canonicalVolumeLink = canonicalVolumeLink;
    }

    @JsonProperty("publisher")
    public String getPublisher() {
        return publisher;
    }

    @JsonProperty("publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("panelizationSummary")
    public PanelizationSummary getPanelizationSummary() {
        return panelizationSummary;
    }

    @JsonProperty("panelizationSummary")
    public void setPanelizationSummary(PanelizationSummary panelizationSummary) {
        this.panelizationSummary = panelizationSummary;
    }

    @JsonProperty("imageLinks")
    public ImageLinks getImageLinks() {
        return imageLinks;
    }

    @JsonProperty("imageLinks")
    public void setImageLinks(ImageLinks imageLinks) {
        this.imageLinks = imageLinks;
    }

    @JsonProperty("subtitle")
    public String getSubtitle() {
        return subtitle;
    }

    @JsonProperty("subtitle")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("averageRating")
    public Double getAverageRating() {
        return averageRating;
    }

    @JsonProperty("averageRating")
    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    @JsonProperty("ratingsCount")
    public Integer getRatingsCount() {
        return ratingsCount;
    }

    @JsonProperty("ratingsCount")
    public void setRatingsCount(Integer ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

}
