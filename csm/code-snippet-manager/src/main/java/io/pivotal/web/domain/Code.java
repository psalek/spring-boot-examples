package io.pivotal.web.domain;

public class Code {
	private String id;
	private String source;

	
	public Code(){}
	public Code(String source) {
		super();
		this.id = java.util.UUID.randomUUID().toString();
		this.source = source;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
}
