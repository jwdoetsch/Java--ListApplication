package org.doetsch.listapp;

import java.util.Collection;

/**
 * 
 * 
 * @author Jacob Wesley Doetsch
 */
interface ListItemInterface {
	
	/**
	 * Returns the title of the list.
	 * 
	 * @return the list's title.
	 */
	public String getTitle ();
	
	/**
	 * Sets the list's title.
	 * 
	 * @param title the new title.
	 */
	public void setTitle (String title);
	
	/**
	 * Returns a description of the list.
	 * 
	 * @return the description.
	 */
	public String getDescription ();
	
	/**
	 * Sets the list's description.
	 * 
	 * @param desc the new description.
	 */
	public void setDescription (String desc);
	
	/**
	 * Returns a Collection of the list's sub-lists.
	 * 
	 * @return a Collection of sub-lists
	 */
	public Collection<ListItem> getSubLists ();
	
	/**
	 * Returns a collection of the list's associated tags. 
	 * 
	 * @return a Collection of tags.
	 */
	public Collection<Tag> getTags ();
	
	/**
	 * Returns whether or not the ListItem is checked.
	 * 
	 * @return the ListItem's checked status.
	 */
	public boolean isChecked ();
	
	/**
	 * Sets the checked status of this item.
	 * 
	 * @param isChecked the item's checked status.
	 */
	public void setChecked (boolean isChecked); 
}
