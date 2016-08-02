package example.rule7.sample;

public class Note {
    private NoteId noteId;
    private Title title;
    private Content content;
    private ImageUrl imageUrl;
    private LastUpdatedDate lastUpdatedDate;
    private List<TagSummary> tags;
    private ActivitySummaries activities;
    private NoteLinkPath nextNotePath;
    private NoteLinkPath previousNotePath;
    private List<RecommendItem> recommends;
    private TdkTitle tdkTitle;
    private TdkDescription tdkDescription;
    private TdkKeyword tdkKeyword;

    Note(NoteId noteId,
         Title title,
         Content content,
         ImageUrl imageUrl,
         LastUpdatedDate lastUpdatedDate,
         List<TagSummary> tags,
         ActivitySummaries activities,
         NoteLinkPath nextNotePath,
         NoteLinkPath previousNotePath,
         List<RecommendItem> recommends,
         TdkTitle tdkTitle,
         TdkDescription tdkDescription,
         TdkKeyword tdkKeyword) {
        this.noteId = noteId;
        this.title = title;
        this.content = content;
        this.imageUrl = imageUrl;
        this.lastUpdatedDate = lastUpdatedDate;
        this.tags = tags;
        this.activities = activities;
        this.previousNotePath = previousNotePath;
        this.nextNotePath = nextNotePath;
        this.recommends = recommends;
        this.tdkTitle = tdkTitle;
        this.tdkDescription = tdkDescription;
        this.tdkKeyword = tdkKeyword;
    }

    public Note() {
    }

    public Integer getNoteId() {
        return noteId.getValue();
    }

    public String getTitle() {
        return title.getValue();
    }

    public String getContent() {
        return content.getValue();
    }

    public String getImageUrl() {
        return imageUrl.getValue();
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate.asText();
    }

    public List<TagSummary> getTags() {
        return tags;
    }

    public List<ActivitySummary> getActivities() {
        return activities.getList();
    }

    public NoteLinkPath getPreviousNotePath() {
        return previousNotePath;
    }

    public NoteLinkPath getNextNotePath() {
        return nextNotePath;
    }

    public List<RecommendItem> getRecommends() {
        return recommends;
    }

    public TdkTitle getTdkTitle() {
        return tdkTitle;
    }

    public TdkDescription getTdkDescription() {
        return tdkDescription;
    }

    public TdkKeyword getTdkKeyword() {
        return tdkKeyword;
    }

    public boolean isEmpty() {
        return this.noteId == null || this.noteId.isEmpty();
    }
}
