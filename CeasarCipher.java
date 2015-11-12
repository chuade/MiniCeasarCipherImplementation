public class CeasarCipher {
	
	private int position;
	
	public CeasarCipher(){
		this.position = 0;
	}
	
	public CeasarCipher(int position){
			this.position = position;
	}
	

	
	public String encipher(String sentence){
		String result = "" ;
		
		if( this.position != 0 ){
			for(int i = 0 ; i< sentence.length() ; i++){
				 char ch = sentence.charAt(i) ;
				if(Character.isAlphabetic(ch) || Character.isDigit(ch))
					result +=  (char)(ch + this.position) ;
				else
					result += ch ;
			}
		}
		else
			result = sentence ;

		return result ;
	}
	
}