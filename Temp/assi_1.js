var exp=require("express");
var mysql=require("mysql2");

var app=exp();

var con = mysql.createConnection({
	host: "localhost",
	user: "root",
	password: "root",
	database: "knowitdb"
});

con.connect(function(err){
	if(!err)
		console.log("connected to db");
	else
		console.log(" Not connected to db");
});

app.get('/empform',function(req,res){
	res.sendFile(__dirname+"/empform.html");
	
});

app.get('/empdetails',function(req,res){
	var q = "select ENAME,JOB,SAL,HIREDATE from emp where EMPNO = "+req.query.empid;
    	con.query(q,function(err,result){
		if(!err)
		{
			    res.write("<table border=1>")
			    result.forEach(function(v){
				res.write("<tr>");
				res.write("<td> Emp name : "+v.ENAME+"</td>");
				res.write("<td> Emp Job : "+v.JOB+"</td>");
				res.write("<td> Emp Salary : "+v.SAL+"</td>");
				res.write("<td> Emp hiredate : "+v.HIREDATE+"</td>");
				res.write("</tr>");
			});
			res.write("</table>");
			
			if(req.query.empid!="emp.EMPNO")
		    {
			res.write("not found");
		    }
		}
		res.end();
		
	});

});



app.all('*',function(req,res){
	res.send("INVALID");
});

app.listen(9000,function(){
	console.log("RUNNING");
});