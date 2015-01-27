package org.doetsch.listapp;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ListItem is an implementation of ListItemInterface.
 * 
 * @author Jacob Wesley Doetsch
 */
class ListItem implements ListItemInterface {

	private String title;
	private String description;
	private boolean isChecked;
	private ListItemCheckerInterface checker;
	private Collection<ListItem> subLists;
	private Collection<Tag> tags;
	
	ListItem (String title, String description, boolean isSubListDependent) {
		this.title = title;
		this.description = description;
		this.checker = (isSubListDependent ? new DependentListItemChecker() : new IndependentListItemChecker());
		this.isChecked = false;
		this.subLists = new ArrayList<ListItem>();
		this.tags = new ArrayList<Tag>();		
	}
	

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<ListItem> getSubLists() {
		return this.subLists;
	}
	
	public Collection<Tag> getTags() {
		return this.tags;
	}

	public boolean isChecked() {
		return checker.isChecked();
	}

	/**
	 * The list's checked status isn't dependent on the checked
	 * status of sub-items.
	 */
	private class IndependentListItemChecker implements ListItemCheckerInterface {

		public boolean isChecked() {
			return ListItem.this.isChecked;
		}

	}
	
	/**
	 * The list's checked status is dependent on the checked
	 * status of sub-items; all sub-items must also be checked
	 * to consider the list checked.
	 */
	private class DependentListItemChecker implements ListItemCheckerInterface {

		public boolean isChecked() {

			for (ListItem list : ListItem.this.subLists) {
				if (!list.isChecked()) {
					return false;
				}
			}
			
			return true;
		}
		
	}

	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
	
}
