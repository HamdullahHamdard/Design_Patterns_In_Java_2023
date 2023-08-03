package BuilderDesignPattern;

public class CDBuilder {

    // building sony CD
    public CDType buildSonyCD(){
        CDType cds = new CDType();
        cds.addItems(new SONY());

        return cds;
    }

    // Building Samsung CD
    public CDType buildSamsungCD(){
        CDType cds = new CDType();
        cds.addItems(new SAMSUNG());

        return cds;
    }

    
}
