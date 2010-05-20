package pgf.Trees.Absyn; // Java Package generated by the BNF Converter.

public class Application extends Tree {
  public final Tree tree_1, tree_2;

  public Application(Tree p1, Tree p2) { tree_1 = p1; tree_2 = p2; }

  public <R,A> R accept(pgf.Trees.Absyn.Tree.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof pgf.Trees.Absyn.Application) {
      pgf.Trees.Absyn.Application x = (pgf.Trees.Absyn.Application)o;
      return this.tree_1.equals(x.tree_1) && this.tree_2.equals(x.tree_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.tree_1.hashCode())+this.tree_2.hashCode();
  }


}
