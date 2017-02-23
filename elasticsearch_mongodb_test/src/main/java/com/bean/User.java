package com.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "helloapi", type = "articleContext", shards = 1, replicas = 0, refreshInterval = "-1")
public class User {
	@Id
	private String id;
	private int rating;
	private UserInfo users;
	private String[]area;
	private int zanNum;
	private int zhuanfaNum;
	private String publishDate;
	private String[]tag;
	private String[]imgs;
	//private String article_url;
	private String title;
	//private String content;
	private int commentsNum;
	private String summary;
	private int zanNum2;
	private int commentsNum2;
	private int collectNum2;
	private String areaId;
	public class UserInfo{
		private String username;
		@Id
		private String _id;
		private String usrImg;
		private String types;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		
		public String get_id() {
			return _id;
		}
		public void set_id(String _id) {
			this._id = _id;
		}
		public String getUsrImg() {
			return usrImg;
		}
		public void setUsrImg(String usrImg) {
			this.usrImg = usrImg;
		}
		public String getTypes() {
			return types;
		}
		public void setTypes(String types) {
			this.types = types;
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public UserInfo getUsers() {
		return users;
	}

	public void setUsers(UserInfo users) {
		this.users = users;
	}

	public String[] getArea() {
		return area;
	}

	public void setArea(String[] area) {
		this.area = area;
	}

	public int getZanNum() {
		return zanNum;
	}

	public void setZanNum(int zanNum) {
		this.zanNum = zanNum;
	}

	public int getZhuanfaNum() {
		return zhuanfaNum;
	}

	public void setZhuanfaNum(int zhuanfaNum) {
		this.zhuanfaNum = zhuanfaNum;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String[] getTag() {
		return tag;
	}

	public void setTag(String[] tag) {
		this.tag = tag;
	}

	public String[] getImgs() {
		return imgs;
	}

	public void setImgs(String[] imgs) {
		this.imgs = imgs;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCommentsNum() {
		return commentsNum;
	}

	public void setCommentsNum(int commentsNum) {
		this.commentsNum = commentsNum;
	}


	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public int getZanNum2() {
		return zanNum2;
	}

	public void setZanNum2(int zanNum2) {
		this.zanNum2 = zanNum2;
	}

	public int getCommentsNum2() {
		return commentsNum2;
	}

	public void setCommentsNum2(int commentsNum2) {
		this.commentsNum2 = commentsNum2;
	}

	public int getCollectNum2() {
		return collectNum2;
	}

	public void setCollectNum2(int collectNum2) {
		this.collectNum2 = collectNum2;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

}
