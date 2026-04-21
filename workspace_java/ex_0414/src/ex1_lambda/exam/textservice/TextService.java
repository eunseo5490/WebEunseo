package ex1_lambda.exam.textservice;

public class TextService {
	
	public String processText(String text, StringProcessor processor) {
		
		
		String result = processor.process(text);
		
		return result;
	}
}
