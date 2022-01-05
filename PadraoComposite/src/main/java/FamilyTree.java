public abstract class FamilyTree implements  Children{

    private final Children children;

    public FamilyTree(Children children) {
        this.children = children;
    }

    @Override
    public String getFamilyName() {
        return children.getFamilyName();
    }
}
