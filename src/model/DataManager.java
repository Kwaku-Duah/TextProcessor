package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.collections.ObservableSet;

public class DataManager {
    
    private ObservableList<TextEntry> entriesList;
    private ObservableSet<TextEntry> entriesSet;
    private ObservableMap<String, TextEntry> entriesMap;

    public DataManager() {
        entriesList = FXCollections.observableArrayList();
        entriesSet = FXCollections.observableSet();
        entriesMap = FXCollections.observableHashMap();
    }

    
    /** 
     * @return ObservableList<TextEntry>
     */
    public ObservableList<TextEntry> getEntriesList() {
        return entriesList;
    }

    public ObservableSet<TextEntry> getEntriesSet() {
        return entriesSet;
    }

    public ObservableMap<String, TextEntry> getEntriesMap() {
        return entriesMap;
    }

    public void addToList(TextEntry entry) {
        entriesList.add(entry);
    }

    public void addToSet(TextEntry entry) {
        entriesSet.add(entry);
    }

    public void addToMap(TextEntry entry) {
        entriesMap.put(entry.getId(), entry);
    }

    public void updateListEntry(String id, String newContent) {
        for (TextEntry entry : entriesList) {
            if (entry.getId().equals(id)) {
                entry.setContent(newContent);
                break;
            }
        }
    }

    public void updateSetEntry(String id, String newContent) {
        for (TextEntry entry : entriesSet) {
            if (entry.getId().equals(id)) {
                entry.setContent(newContent);
                break;
            }
        }
    }

    public void updateMapEntry(String id, String newContent) {
        if (entriesMap.containsKey(id)) {
            TextEntry entry = entriesMap.get(id);
            entry.setContent(newContent);
        }
    }

    public void removeFromList(TextEntry entry) {
        entriesList.remove(entry);
    }

    public void removeFromSet(TextEntry entry) {
        entriesSet.remove(entry);
    }

    public void removeFromMap(String id) {
        entriesMap.remove(id);
    }
}
