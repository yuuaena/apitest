<p class="has-line-data" data-line-start="0" data-line-end="1">การใช้งานของ PCC-apitest generatetoken</p>
<ul>
<li class="has-line-data" data-line-start="1" data-line-end="4">เตรียมโปรแกรมข้างต้นดังนี้<br>
1.โปรแกรม Code springboot หรือ intellij idea<br>
2.Database DBeaver / PostgreSQl</li>
<li class="has-line-data" data-line-start="4" data-line-end="37">ขั้นตอนการเชื่อมต่อ Database<br>
1.ทำการ Download และ setup PostgreSQl 13.11<br>
<a href="https://www.enterprisedb.com/downloads/postgres-postgresql-downloads">https://www.enterprisedb.com/downloads/postgres-postgresql-downloads</a><br>
2.ทำการเข้าโฟล์เดอร์ที่ติดตั้ง PostgreSQl เปิดใช้งาน pgAdmin4 ทำการสร้าง user โดยกำหนดให้<br>
คือ username : ssodev<br>
password : sso2022ok<br>
3.สร้าง Database โดยมีชื่อ ดังนี้<br>
คือ ssotest<br>
4.ทำการ Download และ setup DBeaver<br>
<a href="https://dbeaver.io/download/">https://dbeaver.io/download/</a><br>
5.New database ด้วยเลือกเป็น PostgreSQl และทำการ ใส่ค่า ดังต่อไปนี้<br>
host: localhost<br>
port: 5432<br>
database: ssotest<br>
username: ssodev<br>
password: sso2022ok<br>
6.ทำการสร้าง table โดยกำหนดเป็น sso_user_test<br>
7.ทำการสร้าง New colunm โดยกำหนดดังนี้<br>
request_date          timestamp not null<br>
ssotype               varchar(50),<br>
systemid              varchar(50),<br>
systemname            varchar(250),<br>
systemtransactions    varchar(250),<br>
systemprivileges      varchar(250),<br>
systemusergroup       varchar(50),<br>
systemlocationgroup   varchar(50),<br>
userid                varchar(200),<br>
userfullname          varchar(500),<br>
userrdofficecode      varchar(250),<br>
userofficecode        varchar(250),<br>
clientlocation        varchar(250),<br>
locationmachinenumber varchar(500),<br>
tokenid               varchar(1000)</li>
<li class="has-line-data" data-line-start="37" data-line-end="61">ขั้นตอนการ run swagger<br>
1.ทำการ run project swagger โดยโปรแกรม springboot หรือ intellij idea ผ่าน url นี้<br>
<a href="http://localhost:8080/apitest/swagger-ui.html">http://localhost:8080/apitest/swagger-ui.html</a><br>
2.ทำการเลือก apicontroller<br>
post/apictest/gentoken<br>
3.ใส่ข้อมูลลงใน apimodel จากนั้น Execute ค่าจะได้ในรูปแบบต่อไปนี้<br>
3.1 เมื่อ Response Header HTTP CODE 200 OK ข้อความจะได้ดังนี้<br>
{<br>
“responseCode”: “I07000”,<br>
“responseMessage”: “ทำรายการเรียบร้อย”,<br>
“responseData”: {<br>
“userId”: “string”,<br>
“tokenId”: “string”<br>
}<br>
}<br>
3.2 เมื่อทำการใส่ข้อมูลลงได้ไม่ได้ ข้อความจะแสดงดังนี้<br>
{<br>
“responseCode”: “E000001”,<br>
“responseMessage”: “ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้”,<br>
“responseData”: {<br>
“userId”: “WS233200”,<br>
“tokenId”: &quot; &quot;<br>
}<br>
}</li>
</ul>
