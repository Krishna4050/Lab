<%! int count=0;
	int i,a; %>
<%
	String name = request.getParameter("num1");
	a = Integer.parseInt(name);
	for( i = 0; i<=a; i++ ){
		count = 0;
		for(int k =2; k<=i/2; k++){
			if(i%k==0){
				count++;
				break;
			}
		}
		
		if(count==0){
			out.println(i);
		}
      }
     
%>