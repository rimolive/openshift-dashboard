package org.openshift.dashboard.adapter;

/**
 * Created by rmartine on 3/27/16.
 */
public class ExpandedMenuModel {

    String iconName;

    private int iconImg;

    boolean selected;

    public ExpandedMenuModel() {

    }

    public ExpandedMenuModel(String iconName, int iconImg) {
        this.iconName = iconName;
        this.iconImg = iconImg;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public int getIconImg() {
        return iconImg;
    }

    public void setIconImg(int iconImg) {
        this.iconImg = iconImg;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

}
