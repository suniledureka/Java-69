<h2>
<jsp:useBean id="acc" class="co.edureka.Account"></jsp:useBean>

<jsp:setProperty name="acc" property="*" />

A/c No : 
<jsp:getProperty name="acc" property="acno"/> <br>

A/C Holder Name : 
<jsp:getProperty name="acc" property="name"/> <br>

A/C Balance :
<jsp:getProperty name="acc" property="bal"/> <br>

<hr>
<jsp:setProperty name="acc" property="name" value="Sunil Joseph"></jsp:setProperty>

A/C Holder Name : 
<jsp:getProperty name="acc" property="name"/> <br>
</h2>