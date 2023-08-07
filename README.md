การใช้งานของ PCC-apitest generatetoken
- เตรียมโปรแกรมข้างต้นดังนี้
  1.โปรแกรม Code springboot หรือ intellij idea
  2.Database DBeaver / PostgreSQl
- ขั้นตอนการเชื่อมต่อ Database
  1.ทำการ Download และ setup PostgreSQl 13.11
    https://www.enterprisedb.com/downloads/postgres-postgresql-downloads
  2.ทำการเข้าโฟล์เดอร์ที่ติดตั้ง PostgreSQl เปิดใช้งาน pgAdmin4 ทำการสร้าง user โดยกำหนดให้  
    คือ username : ssodev
       password : sso2022ok
  3.สร้าง Database โดยมีชื่อ ดังนี้
    คือ ssotest
  4.ทำการ Download และ setup DBeaver
    https://dbeaver.io/download/
  5.New database ด้วยเลือกเป็น PostgreSQl และทำการ ใส่ค่า ดังต่อไปนี้
    host: localhost
    port: 5432
    database: ssotest
    username: ssodev
    password: sso2022ok
  6.ทำการสร้าง table โดยกำหนดเป็น sso_user_test
  7.ทำการสร้าง New colunm โดยกำหนดดังนี้
    request_date          timestamp not null
    ssotype               varchar(50),
    systemid              varchar(50),
    systemname            varchar(250),
    systemtransactions    varchar(250),
    systemprivileges      varchar(250),
    systemusergroup       varchar(50),
    systemlocationgroup   varchar(50),
    userid                varchar(200),
    userfullname          varchar(500),
    userrdofficecode      varchar(250),
    userofficecode        varchar(250),
    clientlocation        varchar(250),
    locationmachinenumber varchar(500),
    tokenid               varchar(1000)
- ขั้นตอนการ run swagger
  1.ทำการ run project swagger โดยโปรแกรม springboot หรือ intellij idea ผ่าน url นี้
    http://localhost:8080/apitest/swagger-ui.html
  2.ทำการเลือก apicontroller 
    post/apictest/gentoken
  3.ใส่ข้อมูลลงใน apimodel จากนั้น Execute ค่าจะได้ในรูปแบบต่อไปนี้
    3.1 เมื่อ Response Header HTTP CODE 200 OK ข้อความจะได้ดังนี้
    {
      "responseCode": "I07000",
      "responseMessage": "ทำรายการเรียบร้อย",
      "responseData": {
      "userId": "string",
      "tokenId": "string"
      }
    }
    3.2 เมื่อทำการใส่ข้อมูลลงได้ไม่ได้ ข้อความจะแสดงดังนี้
    {
      "responseCode": "E000001",
      "responseMessage": "ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้",
      "responseData": {
      "userId": "WS233200",
      "tokenId": " "
      }
    }


     
    
  
