package br.com.queue.domain;

import java.io.Serializable;
import java.util.Calendar;

import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.Gson;

/**
 * @author Gabriel Amaral 28/03/2016
 *
 */
@XmlRootElement
public class Ticket implements Serializable {

	private static final long serialVersionUID = 3480754565762311215L;

	private Long sellerId;
	private String ticketId;
	private Calendar createDate = Calendar.getInstance();
	private String origin;
	private String resource;
	
	private Boolean requestOk;
	private String appToken;
	private String authToken;
	private Integer quantity;

	private String status;
	private Integer httpCode;
	private String request;

	public Long getSellerId() {
		return sellerId;
	}

	public String getTicketId() {
		return ticketId;
	}

	public Calendar getCreateDate() {
		return createDate;
	}

	public String getOrigin() {
		return origin;
	}

	public String getResource() {
		return resource;
	}

	public Boolean getRequestOk() {
		return requestOk;
	}

	public String getAppToken() {
		return appToken;
	}

	public String getAuthToken() {
		return authToken;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public String getStatus() {
		return status;
	}

	public Integer getHttpCode() {
		return httpCode;
	}

	public String getRequest() {
		return request;
	}

	public String toJson() {
		return new Gson().toJson(this);
	}
}