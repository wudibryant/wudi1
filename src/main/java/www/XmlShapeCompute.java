package www;

public class XmlShapeCompute {
    private Shape circular;
    private Shape rectangle;
    private Shape triangle;

    public Shape compute(String shapName) {
        if (shapName == null || shapName.length() == 0) {
            throw new IllegalArgumentException("Not find" + shapName);
        }
        if(shapName.equals("circular")){
            return circular;
        }
        if(shapName.equals("rectangle")){
            return rectangle;
        }
        if(shapName.equals("triangle")){
            return triangle;
        }
        throw new IllegalArgumentException("Not find"+shapName);
    }

    public void setCircular(Shape circular) {
        this.circular = circular;
    }

    public void setRectangle(Shape rectangle) {
        this.rectangle = rectangle;
    }

    public void setTriangle(Shape triangle) {
        this.triangle = triangle;
    }
}

