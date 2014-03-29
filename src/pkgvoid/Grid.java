/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgvoid;

/**
 *
 * @author Christopher
 */
public class Grid implements GridPlacable{
    
    private GridPlacable[][] myLocs;
    public Grid() {
        myLocs = new GridPlacable[50][50];
    }
    public Grid(boolean isLarge) {
        if (isLarge){
            myLocs = new GridPlacable[100][100];
        } else {
           myLocs = new GridPlacable[50][50];
        }
    }
    public void addObject(GridLoc a, GridPlacable Obj){
       if (!(myLocs[a.getRow()][a.getColemn()] == null)){
        myLocs[a.getRow()][a.getColemn()] = Obj;
       }
       }
    public GridPlacable getObject(GridLoc a) {
        return myLocs[a.getRow()][a.getColemn()];
    }
    
    
    
    @Override
   public void showInformation() {
       throw new UnsupportedOperationException("Not supported yet.");
   }

    @Override
    public void access() {
       throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Display() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Hide() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Close() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
