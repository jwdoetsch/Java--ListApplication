package org.doetsch.listapp;

/**
 * Tag is an implementation of TagInterface, an
 * immutable representation of a list item labelling
 * tag.
 * 
 * @author Jacob Wesley Doetsch
 */
class Tag implements TagInterface {

	private String tagName;
	
	private Tag (String tagName) {
		this.tagName = tagName;		
	}
	
	public static Tag createTag (String tagName) {
		return new Tag(tagName);
	}
	
	public String getTagName() {
		return this.tagName;
	}
	
}
