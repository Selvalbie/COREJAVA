package selva.java.programs.com;

public class TransformerImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XMLTransformer xml = new XMLTransformer();
		System.out.println(xml.output);
		System.out.println(xml.inputFormat1);
		xml.process();
		xml.transform();
		JSONTransformer json = new JSONTransformer();
		System.out.println(json.output);
		json.process();
		PARQUETTransformer parquet = new PARQUETTransformer();
		parquet.process();
		System.out.println(json instanceof Transformer );
		System.out.println(xml instanceof Transformer );
		System.out.println(parquet instanceof Transformer );
		System.out.println(json instanceof Object );
		System.out.println(xml instanceof EnhancedXMLTransformer);

	}

}
