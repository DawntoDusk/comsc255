package as10;

import javax.swing.JOptionPane;

public class Validate {
	public static void main(String[] args) {

        

        while (true) {

                    String id=JOptionPane.showInputDialog("Enter Id");

                    if (id.equalsIgnoreCase ("0") ){

                                JOptionPane.showMessageDialog(null,"Bye");

                                return;

                    }
                    String name=JOptionPane.showInputDialog("Enter name");
                    String out;

                    try {

                                validateId(id);
                                out="Validated id: "+ id +"\n";
                                JOptionPane.showMessageDialog(null,out);
                                validateName(name);
                                out="Validated name: "+ name +"\n";
                                JOptionPane.showMessageDialog(null,out);

                    }

                    catch (IdNotWholeNumberException e) {
                                String msg=e.getMessage();
                                System.out.println(msg);

                                //e.printStackTrace();

                    }

                    catch (IdOutOfRangeException e) {
                                String msg=e.getMessage();
                                System.out.println(msg);

                                //e.printStackTrace();

                    }

                    catch (NotAlphabeticException e) {
                                String msg=e.getMessage();
                                System.out.println(msg);

                                //e.printStackTrace();

                    }

                    catch (NotSpecifiedException e) {
                                String msg=e.getMessage();
                                System.out.println(msg);

                                //e.printStackTrace();

                    }

        }

	}
	
	
	
	//sample code for validateId
	
	public static void validateId (String sId)
	
	        throws IdNotWholeNumberException,
	                    IdOutOfRangeException {
	
	                    int idInt;
	                    try {idInt=Integer.parseInt(sId);}
	                    catch (NumberFormatException ex){throw new IdNotWholeNumberException();}
	                    if (idInt < 1 || idInt > 999) {throw new IdOutOfRangeException ( ) ;}         
	
	        }
	
		public static void validateName(String name) 
				throws NotAlphabeticException, 
				NotSpecifiedException{
					if (name.equals("")){throw new NotSpecifiedException ();}
					else if(!name.matches("[a-zA-Z]+")){throw new NotAlphabeticException ();}
						
		}
	}
	
	
