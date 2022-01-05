public  class Dad extends FamilyTree {


    public Dad(Children children) {
        super(children);
    }


    @Override
    public String getFamilyName() {
        return super.getFamilyName() + " Skywalker";
    }
}
