package org.doetsch.listapp;

/**
 * 
 * 
 * @author Jacob Wesley Doetsch
 */
class ListItemFactory {

	public ListItem createListItem () {
		return new ListItem("", "", false);
	}
	
	/**
	 * Builds a main list from the given XML list file encapsulated
	 * in a ListItem.
	 * 
	 * @param fileName the XML list file path.
	 * @return the new main list ListItem.
	 */
	public static ListItem buildHeadList (String fileName) {
		return null;
	}

}
