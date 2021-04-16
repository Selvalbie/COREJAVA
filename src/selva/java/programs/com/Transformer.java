package selva.java.programs.com;

public class Transformer {

	String inputFormat1 = "file";
	void transform(){
		System.out.println("change the file into an streams");
	}
	public static void main (String [] args){
		System.out.println("hey");
	}
}

	class XMLTransformer extends Transformer{
		String output = "xml";
		void process(){
			System.out.println("coverting the input into xml");
		}
		
		
	}
	class EnhancedXMLTransformer  extends XMLTransformer{
		String inputStyle = "enhancedXML";
		void publish(){
			System.out.println("publish the results in proper format");
		}
		//Multi level example
		public static void main (String [] args){
			EnhancedXMLTransformer xml = new EnhancedXMLTransformer();
			System.out.println(xml.output);
			System.out.println(xml.inputFormat1);
			xml.process();
			xml.transform();
			System.out.println(xml.inputStyle);
			xml.publish();
		}



}
