/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgvoid;

/**
 *
 * @author Christopher
 */
class GridLoc {
    private int Row;
    private int Colemn;
    
    public GridLoc(int row, int colemn) {
        Row = row;
        Colemn = colemn;
    }
    public int getRow() {
        return Row;
    }
    public int getColemn() {
        return Colemn;
    }
}
