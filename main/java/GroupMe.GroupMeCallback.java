package groupmebot;

public class GroupMeCallback {

  private String[] attachments;
  private String avatarUrl;
  private int createdAt;
  private String groupId;
  private String id;
  private String name;
  private String senderId;
  private String senderType;
  private String sourceGuid;
  private boolean system;
  private String text;
  private String userId;

  public GroupMeCallback() {}

  public String[] getAttachments() {
    return attachments;
  }

  public void setAttachments(String[] attachmentsIn) {
    this.attachments = attachmentsIn;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrlIn) {
    this.avatarUrl = avatarUrlIn;
  }

  public int getTimeCreated() {
    return createdAt;
  }

  public void setTimeCreated(int createdAtIn) {
    this.createdAt = createdAtIn;
  }

  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupIdIn) {
    this.groupIdIn = groupIdIn;
  }

  public String getId() {
    return id;
  }

  public void setId(String idIn) {
    this.id = idIn;
  }

  public String getName() {
    return name;
  }

  public void setName(String nameIn) {
    this.name = nameIn;
  }

  public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderIdIn) {
    this.senderId = senderIdIn;
  }

  public String getSenderType() {
    return senderType;
  }

  public void setSenderType(String senderTypeIn) {
    this.senderType = senderTypeIn;
  }

  public String getSourceGud() {
    return sourcGuid;
  }

  public void setSourceGuid(String sourceGuidIn) {
    this.sourceGuid = sourceGuidIn;
  }

  public boolean getSystem() {
    return system;
  }

  public void setSystem(boolean systemIn) {
    this.system = systemIn;
  }

  public String getText() {
    return text;
  }

  public void setText(String textIn) {
    this.text = textIn;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userIdIn) {
    this.userId = userIdIn;
  }

}
