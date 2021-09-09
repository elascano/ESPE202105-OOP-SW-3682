package ec.edu.espe.sortapp.controller;

import ec.edu.espe.sortapp.core.SortedEntryDao;
import ec.edu.espe.sortapp.core.SortingContext;
import ec.edu.espe.sortapp.model.SortedEntry;
import ec.edu.espe.sortapp.view.FrmMain;

/**
 *
 * @author
 */
public class MainController {
    private final SortingContext sortingContext = new SortingContext();
    private final SortedEntryDao dao;
    
    public MainController() {
        dao = SortedEntryDao.getInstance();
    }
    
    public void init() {
        FrmMain view = new FrmMain(this);
        view.setVisible(true);
    }
    
    public int[] sort(int[] data) {
        return sortingContext.sort(data);
    }
    
    public SortingContext getSortingContext() {
        return sortingContext;
    }
    
    public void save(SortedEntry entry) {
        dao.saveSortedEntry(entry);
    }
}
