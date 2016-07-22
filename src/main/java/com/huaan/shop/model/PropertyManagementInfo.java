package com.huaan.shop.model;

import java.util.Date;

public class PropertyManagementInfo {
	// 报修表
	private Integer reportfixId;
	private String reportfixContent;
	private String reportfixPicName;
	private Date reportfixreportTime;
	private Integer reportfixStatue;
	private Date reportfixResolveTime;
	private String reportfixReply;
	private Integer reportfixUserID;
	// 访客表
	private Integer visitId;
	private String visitName;
	private String visitSex;
	private Date visitTime;
	private Date visitBarCodeTime;
	private Integer visitStatue;
	private Integer visitUserID;

	// 投诉表
	private Integer complainId;
	private String complainContent;
	private String complainPicName;
	private Date complainReportTime;
	private Integer complainStatue;
	private Date complainResolveTime;
	private String complainReply;
	private Integer complainUserID;

	public Integer getReportfixId() {
		return reportfixId;
	}

	public void setReportfixId(Integer reportfixId) {
		this.reportfixId = reportfixId;
	}

	public String getReportfixContent() {
		return reportfixContent;
	}

	public void setReportfixContent(String reportfixContent) {
		this.reportfixContent = reportfixContent;
	}

	public String getReportfixPicName() {
		return reportfixPicName;
	}

	public void setReportfixPicName(String reportfixPicName) {
		this.reportfixPicName = reportfixPicName;
	}

	public Date getReportfixreportTime() {
		return reportfixreportTime;
	}

	public void setReportfixreportTime(Date reportfixreportTime) {
		this.reportfixreportTime = reportfixreportTime;
	}

	public Integer getReportfixStatue() {
		return reportfixStatue;
	}

	public void setReportfixStatue(Integer reportfixStatue) {
		this.reportfixStatue = reportfixStatue;
	}

	public Date getReportfixResolveTime() {
		return reportfixResolveTime;
	}

	public void setReportfixResolveTime(Date reportfixResolveTime) {
		this.reportfixResolveTime = reportfixResolveTime;
	}

	public String getReportfixReply() {
		return reportfixReply;
	}

	public void setReportfixReply(String reportfixReply) {
		this.reportfixReply = reportfixReply;
	}

	public Integer getReportfixUserID() {
		return reportfixUserID;
	}

	public void setReportfixUserID(Integer reportfixUserID) {
		this.reportfixUserID = reportfixUserID;
	}

	public Integer getVisitId() {
		return visitId;
	}

	public void setVisitId(Integer visitId) {
		this.visitId = visitId;
	}

	public String getVisitName() {
		return visitName;
	}

	public void setVisitName(String visitName) {
		this.visitName = visitName;
	}

	public String getVisitSex() {
		return visitSex;
	}

	public void setVisitSex(String visitSex) {
		this.visitSex = visitSex;
	}

	public Date getVisitTime() {
		return visitTime;
	}

	public void setVisitTime(Date visitTime) {
		this.visitTime = visitTime;
	}

	public Date getVisitBarCodeTime() {
		return visitBarCodeTime;
	}

	public void setVisitBarCodeTime(Date visitBarCodeTime) {
		this.visitBarCodeTime = visitBarCodeTime;
	}

	public Integer getVisitStatue() {
		return visitStatue;
	}

	public void setVisitStatue(Integer visitStatue) {
		this.visitStatue = visitStatue;
	}

	public Integer getVisitUserID() {
		return visitUserID;
	}

	public void setVisitUserID(Integer visitUserID) {
		this.visitUserID = visitUserID;
	}

	public Integer getComplainId() {
		return complainId;
	}

	public void setComplainId(Integer complainId) {
		this.complainId = complainId;
	}

	public String getComplainContent() {
		return complainContent;
	}

	public void setComplainContent(String complainContent) {
		this.complainContent = complainContent;
	}

	public String getComplainPicName() {
		return complainPicName;
	}

	public void setComplainPicName(String complainPicName) {
		this.complainPicName = complainPicName;
	}

	public Date getComplainReportTime() {
		return complainReportTime;
	}

	public void setComplainReportTime(Date complainReportTime) {
		this.complainReportTime = complainReportTime;
	}

	public Integer getComplainStatue() {
		return complainStatue;
	}

	public void setComplainStatue(Integer complainStatue) {
		this.complainStatue = complainStatue;
	}

	public Date getComplainResolveTime() {
		return complainResolveTime;
	}

	public void setComplainResolveTime(Date complainResolveTime) {
		this.complainResolveTime = complainResolveTime;
	}

	public String getComplainReply() {
		return complainReply;
	}

	public void setComplainReply(String complainReply) {
		this.complainReply = complainReply;
	}

	public Integer getComplainUserID() {
		return complainUserID;
	}

	public void setComplainUserID(Integer complainUserID) {
		this.complainUserID = complainUserID;
	}

}
